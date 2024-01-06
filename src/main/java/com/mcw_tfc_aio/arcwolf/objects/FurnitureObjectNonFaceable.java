package com.mcw_tfc_aio.arcwolf.objects;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FurnitureObjectNonFaceable extends Block {
    protected static final VoxelShape BASE = Shapes.or(Block.box(0.0, 3.0, 0.0, 16.0, 16.0, 16.0), new VoxelShape[0]);

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        return BASE;
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public FurnitureObjectNonFaceable(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)this.stateDefinition.any());
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState();
    }

    public void onBroken(Level level, BlockPos pos) {
        level.levelEvent(1029, pos, 0);
    }

    public boolean isPathfindable(BlockState state, BlockGetter getter, BlockPos pos, PathComputationType type) {
        return false;
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, Level level, BlockPos currentPos, BlockPos facingPos) {
        return super.updateShape(stateIn, facing, facingState, level, currentPos, facingPos);
    }
}