package com.mcw_tfc_aio.arcwolf.objects.roofs;


import com.mcw_tfc_aio.arcwolf.init.ItemInit;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RoofTopNew extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    protected static final VoxelShape OCCLUSION = Block.box(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
    private static final EnumProperty<RoofPart> PART = EnumProperty.create("part", RoofPart.class);
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");

    public RoofTopNew(BlockBehaviour.Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any().setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(PART, RoofPart.BASIC).setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
    }

    public void onBroken(Level worldIn, BlockPos pos) {
        worldIn.levelEvent(1029, pos, 0);
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
        return OCCLUSION;
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        return BASE;
    }

    private BlockState RoofTopState(BlockState state, LevelAccessor world, BlockPos pos) {
        boolean north = world.getBlockState(pos.north()).getBlock() == this;
        boolean east = world.getBlockState(pos.east()).getBlock() == this;
        boolean south = world.getBlockState(pos.south()).getBlock() == this;
        boolean west = world.getBlockState(pos.west()).getBlock() == this;
        return (((state.setValue(NORTH, north)).setValue(EAST, east)).setValue(SOUTH, south)).setValue(WEST, west);
    }

    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState stateblock, boolean bolean) {
        if (!stateblock.is(state.getBlock())) {
            this.RoofTopState(state, world, pos);
        }

    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (item == ItemInit.ROOFING_HAMMER.get()) {
            state = state.cycle(PART);
            world.setBlock(pos, state, 0);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, PART, FACING, WATERLOGGED);
    }

    public BlockState updateShape(BlockState state, Direction dir, BlockState stateblock, LevelAccessor world, BlockPos pos, BlockPos postwo) {
        return this.RoofTopState(state, world, pos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.RoofTopState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public void placeAt(Level world, BlockPos pos, int intos) {
        world.setBlock(pos, this.defaultBlockState(), intos);
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.getValue(WATERLOGGED) ? Fluids.WATER.defaultFluidState() : super.getFluidState(state);
    }

    public static enum RoofPart implements StringRepresentable {
        BASIC("basic"),
        SWITCHED("switched"),
        END_PART("end_part"),
        PYRAMID("pyramid");

        private final String name;

        private RoofPart(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String getString() {
            return this.name;
        }

        public String getSerializedName() {
            return this.name;
        }
    }
}
