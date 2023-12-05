package com.mcw_tfc_aio.arcwolf.objects.bridges;


import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
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
import net.minecraft.world.phys.shapes.VoxelShape;

public class Rail_Bridge extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    protected static final VoxelShape OCCLUSION = Block.box(0.0, 0.1, 0.0, 16.0, 16.0, 16.0);
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty NORTH_WEST = BooleanProperty.create("north_west");
    public static final BooleanProperty NORTH_EAST = BooleanProperty.create("north_east");
    public static final BooleanProperty SOUTH_EAST = BooleanProperty.create("south_east");
    public static final BooleanProperty SOUTH_WEST = BooleanProperty.create("south_west");

    public Rail_Bridge(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(NORTH_WEST, false).setValue(NORTH_EAST, false).setValue(SOUTH_EAST, false).setValue(SOUTH_WEST, false).setValue(POWERED, false).setValue(WATERLOGGED, false));
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
        return OCCLUSION;
    }

    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return OCCLUSION;
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    private BlockState RailBridge(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean north = level.getBlockState(pos.north()).getBlock() == this;
        boolean east = level.getBlockState(pos.east()).getBlock() == this;
        boolean south = level.getBlockState(pos.south()).getBlock() == this;
        boolean west = level.getBlockState(pos.west()).getBlock() == this;
        boolean cornerNorthWest = north && west && level.getBlockState(pos.north().west()).getBlock() != this;
        boolean cornerNorthEast = north && east && level.getBlockState(pos.north().east()).getBlock() != this;
        boolean cornerSouthEast = south && east && level.getBlockState(pos.south().east()).getBlock() != this;
        boolean cornerSouthWest = south && west && level.getBlockState(pos.south().west()).getBlock() != this;
        return state.setValue(NORTH, north).setValue(EAST, east).setValue(SOUTH, south).setValue(WEST, west).setValue(NORTH_WEST, cornerNorthWest).setValue(NORTH_EAST, cornerNorthEast).setValue(SOUTH_EAST, cornerSouthEast).setValue(SOUTH_WEST, cornerSouthWest);
    }

    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!statetwo.is(state.getBlock())) {
            this.RailBridge(state, level, pos);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, NORTH_EAST, NORTH_WEST, SOUTH_EAST, SOUTH_WEST, POWERED, WATERLOGGED, FACING);
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return this.RailBridge(state, level, pos);
    }

    public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction dir) {
        return state.getValue(POWERED) ? 10 : 0;
    }

    public boolean isSignalSource(BlockState state) {
        return state.getValue(POWERED);
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        Boolean power = state.getValue(POWERED);
        if (power && item == Items.AIR) {
            state = state.cycle(POWERED);
            worldIn.setBlock(pos, state, 2);
            dropTorch(worldIn, pos);
            return InteractionResult.CONSUME;
        } else if (item == Items.REDSTONE_TORCH && !power) {
            state = state.cycle(POWERED);
            worldIn.setBlock(pos, state, 2);
            if (!player.getAbilities().instabuild) {
                itemstack.shrink(1);
            }

            return InteractionResult.CONSUME;
        } else {
            return !power && item != Items.REDSTONE_TORCH ? InteractionResult.PASS : InteractionResult.PASS;
        }
    }

    public static void dropTorch(Level world, BlockPos pos) {
        popResource(world, pos, new ItemStack(Items.REDSTONE_TORCH, 1));
    }

    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player user) {
        Boolean i = state.getValue(POWERED);
        if (!level.isClientSide && i) {
            dropTorch(level, pos);
        }

        super.playerWillDestroy(level, pos, state, user);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState ifluidstate = context.getLevel().getFluidState(context.getClickedPos());
        return this.RailBridge(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise()).setValue(WATERLOGGED, ifluidstate.is(FluidTags.WATER) && ifluidstate.getAmount() == 8);
    }

    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
    }

    public void placeAt(Level level, BlockPos pos, int num) {
        level.setBlock(pos, this.defaultBlockState(), num);
    }
    
}