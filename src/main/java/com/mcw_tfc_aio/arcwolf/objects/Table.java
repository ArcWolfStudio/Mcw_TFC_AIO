package com.mcw_tfc_aio.arcwolf.objects;


import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Table extends FurnitureObjectNonFaceable {
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    protected static final VoxelShape BASE = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), Block.box(6.0, 0.0, 6.0, 10.0, 14.0, 10.0));
    protected static final VoxelShape MIDDLE = Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);

    public Table(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(((((this.stateDefinition.any()).setValue(NORTH, false)).setValue(EAST, false)).setValue(SOUTH, false)).setValue(WEST, false));
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        boolean north = state.getValue(NORTH);
        boolean east = state.getValue(EAST);
        boolean south = state.getValue(SOUTH);
        boolean west = state.getValue(WEST);
        return (!north || !west || south || east) && (!north || !east || south || west) && (!east || !south || north || west) && (!west || !south || north || east) && (!north || east || south || west) && (north || !east || south || west) && (north || east || !south || west) && (north || east || south || !west) && (north || east || south || west) ? MIDDLE : BASE;
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
        this.TableState(state, level, pos);
    }

    private BlockState TableState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean north = level.getBlockState(pos.north()).getBlock() == this;
        boolean east = level.getBlockState(pos.east()).getBlock() == this;
        boolean south = level.getBlockState(pos.south()).getBlock() == this;
        boolean west = level.getBlockState(pos.west()).getBlock() == this;
        return ((((state.setValue(NORTH, north)).setValue(EAST, east)).setValue(SOUTH, south)).setValue(WEST, west));
    }

    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bolean) {
        if (!statetwo.is(state.getBlock())) {
            this.TableState(state, level, pos);
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{NORTH, EAST, SOUTH, WEST});
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return this.TableState(state, level, pos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.TableState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos());
    }

    public void placeAt(Level level, BlockPos pos, int number) {
        level.setBlock(pos, this.defaultBlockState(), number);
    }
}
