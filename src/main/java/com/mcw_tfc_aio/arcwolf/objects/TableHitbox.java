package com.mcw_tfc_aio.arcwolf.objects;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TableHitbox extends Table {
    protected static final VoxelShape CORNER_N = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(12.0, 0.0, 1.0, 15.0, 11.0, 4.0), Block.box(0.0, 11.0, 1.0, 15.0, 14.0, 16.0)});
    protected static final VoxelShape CORNER_E = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(12.0, 0.0, 12.0, 15.0, 11.0, 15.0), Block.box(0.0, 11.0, 0.0, 15.0, 14.0, 15.0)});
    protected static final VoxelShape CORNER_S = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(1.0, 0.0, 12.0, 4.0, 11.0, 15.0), Block.box(1.0, 11.0, 0.0, 16.0, 14.0, 15.0)});
    protected static final VoxelShape CORNER_W = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(1.0, 0.0, 1.0, 4.0, 11.0, 4.0), Block.box(1.0, 11.0, 1.0, 16.0, 14.0, 16.0)});
    protected static final VoxelShape SIDE_N = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(12.0, 0.0, 1.0, 15.0, 14.0, 4.0), Block.box(12.0, 0.0, 12.0, 15.0, 14.0, 15.0), Block.box(12.0, 11.0, 4.0, 15.0, 14.0, 12.0), Block.box(0.0, 11.0, 1.0, 12.0, 14.0, 15.0)});
    protected static final VoxelShape SIDE_E = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(12.0, 0.0, 12.0, 15.0, 14.0, 15.0), Block.box(1.0, 0.0, 12.0, 4.0, 14.0, 15.0), Block.box(4.0, 11.0, 12.0, 12.0, 14.0, 15.0), Block.box(1.0, 11.0, 0.0, 15.0, 14.0, 12.0)});
    protected static final VoxelShape SIDE_S = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(1.0, 0.0, 12.0, 4.0, 14.0, 15.0), Block.box(1.0, 0.0, 1.0, 4.0, 14.0, 4.0), Block.box(1.0, 11.0, 4.0, 4.0, 14.0, 12.0), Block.box(4.0, 11.0, 1.0, 16.0, 14.0, 15.0)});
    protected static final VoxelShape SIDE_W = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(1.0, 0.0, 1.0, 4.0, 14.0, 4.0), Block.box(12.0, 0.0, 1.0, 15.0, 14.0, 4.0), Block.box(4.0, 11.0, 1.0, 12.0, 14.0, 4.0), Block.box(1.0, 11.0, 4.0, 15.0, 14.0, 16.0)});
    protected static final VoxelShape SINGLE = Shapes.or(Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[]{Block.box(12.0, 0.0, 1.0, 15.0, 11.0, 4.0), Block.box(12.0, 0.0, 12.0, 15.0, 11.0, 15.0), Block.box(1.0, 0.0, 1.0, 4.0, 11.0, 4.0), Block.box(1.0, 0.0, 12.0, 4.0, 11.0, 15.0), Block.box(1.0, 11.0, 1.0, 15.0, 14.0, 15.0)});
    protected static final VoxelShape MIDDLE_NS = Shapes.or(Block.box(0.0, 11.0, 1.0, 16.0, 14.0, 15.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0));
    protected static final VoxelShape MIDDLE_WE = Shapes.or(Block.box(1.0, 11.0, 0.0, 15.0, 14.0, 16.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0));
    protected static final VoxelShape CENTER = Block.box(0.0, 11.0, 0.0, 16.0, 16.0, 16.0);

    public TableHitbox(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public VoxelShape m_5940_(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        boolean north = (Boolean)state.getValue(NORTH);
        boolean east = (Boolean)state.getValue(EAST);
        boolean south = (Boolean)state.getValue(SOUTH);
        boolean west = (Boolean)state.getValue(WEST);
        switch ((north ? 1 : 0) << 3 | (east ? 1 : 0) << 2 | (south ? 1 : 0) << 1 | (west ? 1 : 0)) {
            case 0:
                return SINGLE;
            case 1:
                return SIDE_N;
            case 2:
                return SIDE_W;
            case 3:
                return CORNER_N;
            case 4:
                return SIDE_S;
            case 5:
                return MIDDLE_WE;
            case 6:
                return CORNER_W;
            case 7:
                return MIDDLE_NS;
            case 8:
                return SIDE_E;
            case 9:
                return CORNER_E;
            case 10:
            case 11:
            default:
                return CENTER;
            case 12:
                return CORNER_S;
        }
    }
}
