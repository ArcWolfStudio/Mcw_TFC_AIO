package com.mcw_tfc_aio.arcwolf.objects.roofs;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AwningBlock extends BaseRoof{
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

    public AwningBlock(BlockState state, BlockBehaviour.Properties prop){
        super(state, prop);
    }

    public VoxelShape getShape (BlockState state, BlockGetter getter, BlockPos pos){
        return Shapes.empty();
    }

    public VoxelShape getShape (BlockState state, BlockGetter getter, BlockPos pos, CollisionContext selectionContext){
        return BASE;
    }
}
