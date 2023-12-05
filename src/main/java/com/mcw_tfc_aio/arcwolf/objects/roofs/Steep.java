package com.mcw_tfc_aio.arcwolf.objects.roofs;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Steep extends BaseRoof {
    protected static final VoxelShape WEST = Block.box(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape NORTH = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST = Block.box(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH = Block.box(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape OUTER_NORTH = Block.box(0.0, 0.0, 0.0, 8.0, 16.0, 8.0);
    protected static final VoxelShape OUTER_EAST = Block.box(8.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape OUTER_SOUTH = Block.box(8.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape OUTER_WEST = Block.box(0.0, 0.0, 8.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape INNER_WEST = Shapes.or(Block.box(0.0, 0.0, 8.0, 8.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 8.0));
    protected static final VoxelShape INNER_NORTH = Shapes.or(Block.box(8.0, 0.0, 8.0, 16.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 8.0));
    protected static final VoxelShape INNER_EAST = Shapes.or(Block.box(0.0, 0.0, 0.0, 8.0, 16.0, 8.0), Block.box(0.0, 0.0, 8.0, 16.0, 16.0, 16.0));
    protected static final VoxelShape INNER_SOUTH = Shapes.or(Block.box(8.0, 0.0, 0.0, 16.0, 16.0, 8.0), Block.box(0.0, 0.0, 8.0, 16.0, 16.0, 16.0));

    public Steep(BlockState state, BlockBehaviour.Properties prop) {
        super(state, prop);
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
        switch ((Direction)state.getValue(FACING)) {
            case EAST:
                return EAST;
            case NORTH:
                return NORTH;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            default:
                return null;
        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        switch (state.getValue(FACING)) {
            case EAST:
                if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_SOUTH;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_EAST;
                } else if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                    return INNER_NORTH;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_RIGHT) {
                        return INNER_SOUTH;
                    }

                    return EAST;
                }
            case NORTH:
                if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_EAST;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_NORTH;
                } else if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                    return INNER_WEST;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_RIGHT) {
                        return INNER_NORTH;
                    }

                    return NORTH;
                }
            case SOUTH:
                if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_WEST;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_SOUTH;
                } else if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                    return INNER_SOUTH;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_RIGHT) {
                        return INNER_EAST;
                    }

                    return SOUTH;
                }
            case WEST:
                if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_NORTH;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_WEST;
                } else if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                    return INNER_EAST;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_RIGHT) {
                        return INNER_WEST;
                    }

                    return WEST;
                }
            default:
                return null;
        }
    }
}
