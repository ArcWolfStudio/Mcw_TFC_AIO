package com.mcw_tfc_aio.arcwolf.objects.bridges;


import java.util.function.ToIntFunction;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
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
import net.minecraft.world.phys.shapes.VoxelShape;

public class Stair_Base extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty TORCH = BooleanProperty.create("torch");
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 15.99, 8.0, 15.99);
    public static ToIntFunction<BlockState> lightLevel = (BlockState) -> {
        return 5;
    };

    public Stair_Base(BlockBehaviour.Properties properties) {
        super(properties.lightLevel(setLightLevel(15)));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(TORCH, false).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(WATERLOGGED, false));
    }

    public static ToIntFunction<BlockState> setLightLevel(int lightValue) {
        return (state) -> {
            Boolean i = state.getValue(TORCH);
            if (!i) {
                return (Boolean)state.getValue(TORCH) ? lightValue : 0;
            } else {
                return (Boolean)state.getValue(TORCH) ? lightValue : 15;
            }
        };
    }

    public int getLightValue(BlockState state, LevelReader world, BlockPos pos) {
        Boolean i = state.getValue(TORCH);
        return i ? 14 : 0;
    }

    public void onBroken(Level worldIn, BlockPos pos) {
        worldIn.levelEvent(1029, pos, 0);
    }

    private BlockState StairState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean north = level.getBlockState(pos.north()).getBlock() == this;
        boolean east = level.getBlockState(pos.east()).getBlock() == this;
        boolean south = level.getBlockState(pos.south()).getBlock() == this;
        boolean west = level.getBlockState(pos.west()).getBlock() == this;
        return state.setValue(NORTH, north).setValue(EAST, east).setValue(SOUTH, south).setValue(WEST, west);
    }

    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!statetwo.is(state.getBlock())) {
            this.StairState(state, level, pos);
        }

    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return this.StairState(state, level, pos);
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        Boolean i = state.getValue(TORCH);
        if (i) {
            state = state.cycle(TORCH);
            worldIn.setBlock(pos, state, 2);
            dropTorch(worldIn, pos);
            return InteractionResult.CONSUME;
        } else if (item == Items.TORCH && !i) {
            state = state.cycle(TORCH);
            worldIn.setBlock(pos, state, 2);
            if (!player.getAbilities().instabuild) {
                itemstack.shrink(1);
            }

            return InteractionResult.CONSUME;
        } else {
            return !i && item != Items.TORCH ? InteractionResult.PASS : InteractionResult.PASS;
        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return BASE;
    }

    public static void dropTorch(Level world, BlockPos pos) {
        popResource(world, pos, new ItemStack(Items.TORCH, 1));
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
    }

    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player user) {
        Boolean i = state.getValue(TORCH);
        if (!level.isClientSide && i) {
            dropTorch(level, pos);
        }

        super.playerWillDestroy(level, pos, state, user);
    }

    public BlockState updateShape(BlockState state, Direction dir, BlockState statetwo, Level level, BlockPos pos, BlockPos postwo) {
        return this.StairState(state, level, pos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.StairState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, NORTH, EAST, SOUTH, WEST, TORCH, WATERLOGGED);
    }

    
}