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

public class Rope_Bridge extends Bridge_Base implements SimpleWaterloggedBlock {
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 15.99, 2.0, 15.99);
    protected static final VoxelShape SIDE0 = Block.box(0.0, 1.0, 15.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SIDE90 = Block.box(0.0, 1.0, 0.0, 1.0, 16.0, 16.0);
    protected static final VoxelShape SIDE180 = Block.box(0.0, 1.0, 0.0, 16.0, 16.0, 1.0);
    protected static final VoxelShape SIDE270 = Block.box(15.0, 1.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SIDE_0 = Shapes.or(BASE, SIDE0);
    protected static final VoxelShape SIDE_90 = Shapes.or(BASE, SIDE90);
    protected static final VoxelShape SIDE_180 = Shapes.or(BASE, SIDE180);
    protected static final VoxelShape SIDE_270 = Shapes.or(BASE, SIDE270);
    protected static final VoxelShape CORNER_0 = Shapes.or(BASE, SIDE180, SIDE90);
    protected static final VoxelShape CORNER_90 = Shapes.or(BASE, SIDE180, SIDE270);
    protected static final VoxelShape CORNER_180 = Shapes.or(BASE, SIDE270, SIDE0);
    protected static final VoxelShape CORNER_270 = Shapes.or(BASE, SIDE0, SIDE90);
    protected static final VoxelShape MIDDLE_90 = Shapes.or(SIDE0, SIDE180, BASE);
    protected static final VoxelShape MIDDLE_0 = Shapes.or(SIDE90, SIDE270, BASE);

    public Rope_Bridge(Properties properties) {
        super(properties.lightLevel(setLightLevel(15)));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(TOGGLE, false).setValue(TORCH, false).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(WATERLOGGED, false));
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        VoxelShape[] obj = new VoxelShape[]{CORNER_180, CORNER_270, CORNER_90, CORNER_0, SIDE_180, SIDE_270, SIDE_0, SIDE_90, MIDDLE_0, MIDDLE_90, BASE};
        return obj[Bridge_Base.shapeMaker(state)];
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, TOGGLE, TORCH, WATERLOGGED, FACING);
    }

}