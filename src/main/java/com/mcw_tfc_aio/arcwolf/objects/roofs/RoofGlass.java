package com.mcw_tfc_aio.arcwolf.objects.roofs;

import net.minecraft.core.BlockPos;
import com.mcw_tfc_aio.arcwolf.init.ItemInit;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RoofGlass extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
    //m_83110_ = or?
    protected static final VoxelShape CLOSED1 = Shapes.or(Block.box(0.0, 8.0, 8.0, 16.0, 15.0, 16.0), Block.box(0.0, 0.01, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape CLOSED2 = Shapes.or(Block.box(8.0, 8.0, 0.0, 16.0, 15.0, 16.0), Block.box(0.0, 0.01, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape CLOSED3 = Shapes.or(Block.box(0.0, 8.0, 0.0, 16.0, 15.0, 8.0), Block.box(0.0, 0.01, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape CLOSED4 = Shapes.or(Block.box(0.0, 8.0, 0.0, 8.0, 15.0, 16.0), Block.box(0.0, 0.01, 0.0, 16.0, 8.0, 16.0));

    public RoofGlass(BlockBehaviour.Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(OPEN, false).setValue(WATERLOGGED, false).setValue(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return ((this.defaultBlockState().setValue(WATERLOGGED, false)).setValue(OPEN, false)).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public void onBroken (Level worldIn, BlockPos pos) {
        worldIn.levelEvent(1029, pos, 0);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return CLOSED4;
            case SOUTH:
                return CLOSED2;
            case WEST:
                return CLOSED1;
            case EAST:
            default:
                return CLOSED3;
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        Boolean openik = state.getValue(OPEN);
        switch (state.getValue(FACING)) {
            case NORTH:
                if (openik) {
                    return Shapes.empty();
                }

                return CLOSED1;
            case SOUTH:
            default:
                if (openik) {
                    return Shapes.empty();
                }

                return CLOSED2;
            case WEST:
                if (openik) {
                    return Shapes.empty();
                }

                return CLOSED4;
            case EAST:
                return openik ? Shapes.empty() : CLOSED3;
        }
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        if (item == ItemInit.ROOFING_HAMMER.get()) {
            state = state.cycle(FACING);
            worldIn.setBlock(pos, state, 2);
        } else if (state.getValue(WATERLOGGED)) {
            worldIn.getFluidTicks().hasScheduledTick(pos, Fluids.WATER);
        } else {
            state = state.cycle(OPEN);
            worldIn.setBlock(pos, state, 2);
            worldIn.playSound(player, pos, state.getValue(OPEN) ? SoundEvents.WOODEN_TRAPDOOR_OPEN : SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundSource.BLOCKS, 1.0F, worldIn.getRandom().nextFloat() * 0.1F + 1.0F);
        }
//m_19078_
        return InteractionResult.sidedSuccess(worldIn.isClientSide);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(OPEN, FACING, WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, Level worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.getFluidTicks().hasScheduledTick(currentPos, Fluids.WATER);
        }

        return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

}