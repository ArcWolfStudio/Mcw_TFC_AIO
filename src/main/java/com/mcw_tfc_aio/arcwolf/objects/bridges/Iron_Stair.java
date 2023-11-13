package com.mcw_tfc_aio.arcwolf.objects.bridges;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Iron_Stair extends Stair_Base implements SimpleWaterloggedBlock {
    protected static final VoxelShape NORTH_W = Shapes.or(Block.box(0.0, 8.0, 8.0, 16.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape EAST_W = Shapes.or(Block.box(0.0, 8.0, 0.0, 8.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape SOUTH_W = Shapes.or(Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 8.0), Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape WEST_W = Shapes.or(Block.box(8.0, 8.0, 0.0, 16.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0));
    protected static final VoxelShape BASE_0 = Shapes.or(Block.box(0.0, 6.0, 0.0, 16.0, 9.0, 8.0), Block.box(0.0, 0.0, 8.0, 16.0, 3.0, 16.0));
    protected static final VoxelShape BASE_90 = Shapes.or(Block.box(8.0, 6.0, 0.0, 16.0, 9.0, 16.0), Block.box(0.0, 0.0, 0.0, 8.0, 3.0, 16.0));
    protected static final VoxelShape BASE_180 = Shapes.or(Block.box(0.0, 6.0, 8.0, 16.0, 9.0, 16.0), Block.box(0.0, 0.0, 0.0, 16.0, 3.0, 8.0));
    protected static final VoxelShape BASE_270 = Shapes.or(Block.box(0.0, 6.0, 0.0, 8.0, 9.0, 16.0), Block.box(8.0, 0.0, 0.0, 16.0, 3.0, 16.0));
    protected static final VoxelShape SIDE_L_0 = Shapes.or(Block.box(0.0, 9.0, 0.0, 1.0, 16.0, 10.0), Block.box(0.0, 0.0, 0.0, 1.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_L_90 = Shapes.or(Block.box(6.0, 9.0, 0.0, 16.0, 16.0, 1.0), Block.box(0.0, 0.0, 0.0, 16.0, 7.0, 1.0));
    protected static final VoxelShape SIDE_L_180 = Shapes.or(Block.box(15.0, 9.0, 6.0, 16.0, 16.0, 16.0), Block.box(15.0, 0.0, 0.0, 16.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_L_270 = Shapes.or(Block.box(0.0, 9.0, 15.0, 10.0, 16.0, 16.0), Block.box(0.0, 0.0, 15.0, 16.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_R_0 = Shapes.or(Block.box(15.0, 9.0, 0.0, 16.0, 16.0, 10.0), Block.box(15.0, 0.0, 0.0, 16.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_R_90 = Shapes.or(Block.box(6.0, 9.0, 15.0, 16.0, 16.0, 16.0), Block.box(0.0, 0.0, 15.0, 16.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_R_180 = Shapes.or(Block.box(0.0, 9.0, 6.0, 1.0, 16.0, 16.0), Block.box(0.0, 0.0, 0.0, 1.0, 7.0, 16.0));
    protected static final VoxelShape SIDE_R_270 = Shapes.or(Block.box(0.0, 9.0, 0.0, 10.0, 16.0, 1.0), Block.box(0.0, 0.0, 0.0, 16.0, 7.0, 1.0));
    protected static final VoxelShape NORTH_LEFT  = Shapes.or(SIDE_L_270, BASE_270);
    protected static final VoxelShape NORTH_RIGHT  = Shapes.or(SIDE_R_270, BASE_270);
    protected static final VoxelShape NORTH_DOUBLE = Shapes.or(NORTH_LEFT, NORTH_RIGHT, BASE_270);
    protected static final VoxelShape EAST_LEFT = Shapes.or(SIDE_L_0, BASE_0);
    protected static final VoxelShape EAST_RIGHT  = Shapes.or(SIDE_R_0, BASE_0);
    protected static final VoxelShape EAST_DOUBLE  = Shapes.or(EAST_LEFT, EAST_RIGHT, BASE_0);
    protected static final VoxelShape SOUTH_LEFT  = Shapes.or(SIDE_L_90, BASE_90);
    protected static final VoxelShape SOUTH_RIGHT = Shapes.or(SIDE_R_90, BASE_90);
    protected static final VoxelShape SOUTH_DOUBLE  = Shapes.or(SOUTH_LEFT, SOUTH_RIGHT, BASE_90);
    protected static final VoxelShape WEST_LEFT  = Shapes.or(SIDE_L_180, BASE_180);
    protected static final VoxelShape WEST_RIGHT  = Shapes.or(SIDE_R_180, BASE_180);
    protected static final VoxelShape WEST_DOUBLE  = Shapes.or(WEST_LEFT, WEST_RIGHT, BASE_180);

    public Iron_Stair(Properties properties) {
        super(properties.lightLevel(setLightLevel(15)));
        this.registerDefaultState(((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH).setValue(TORCH, false).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(WATERLOGGED, false));
    }

    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        boolean n = state.getValue(NORTH);
        boolean e = state.getValue(EAST);
        boolean s = state.getValue(SOUTH);
        boolean w = state.getValue(WEST);
        switch (state.getValue(FACING)) {
            case NORTH:
                if (!n) {
                    if (!s) {
                        return NORTH_DOUBLE;
                    }

                    return NORTH_RIGHT;
                } else {
                    if (!s) {
                        return NORTH_LEFT;
                    }

                    return BASE_270;
                }
            case SOUTH:
                if (!n) {
                    if (!s) {
                        return SOUTH_DOUBLE;
                    }

                    return SOUTH_LEFT;
                } else {
                    if (!s) {
                        return SOUTH_RIGHT;
                    }

                    return BASE_90;
                }
            case EAST:
                if (!e) {
                    if (!w) {
                        return EAST_DOUBLE;
                    }

                    return EAST_RIGHT;
                } else {
                    if (!w) {
                        return EAST_LEFT;
                    }

                    return BASE_0;
                }
            case WEST:
                if (!e) {
                    if (!w) {
                        return WEST_DOUBLE;
                    }

                    return WEST_LEFT;
                } else {
                    if (!w) {
                        return WEST_RIGHT;
                    }

                    return BASE_180;
                }
            default:
                return BASE;
        }
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return BASE_270;
            case SOUTH:
                return BASE_90;
            case EAST:
                return BASE_0;
            case WEST:
                return BASE_180;
            default:
                return null;
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return EAST_W;
            case SOUTH:
                return WEST_W;
            case EAST:
                return SOUTH_W;
            case WEST:
                return NORTH_W;
            default:
                return null;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, TORCH, WATERLOGGED, FACING);
    }

}