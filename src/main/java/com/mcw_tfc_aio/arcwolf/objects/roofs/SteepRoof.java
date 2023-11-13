package com.mcw_tfc_aio.arcwolf.objects.roofs;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SteepRoof extends BaseRoof {
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape BASE_TOP = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape OCCLUSION = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    protected static final VoxelShape OCCLUSION_BOTTOM = Block.box(0.0, 1.0, 0.0, 16.0, 16.0, 16.0);
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;

    public SteepRoof(BlockState state, Properties prop) {
        super(state, prop);
    }

    public VoxelShape getOcclusionShape(BlockState state, BlockGetter getter, BlockPos pos) {
        return state.getValue(HALF) == Half.BOTTOM ? OCCLUSION : OCCLUSION_BOTTOM;
    }

    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext sel) {
        return state.getValue(HALF) == Half.TOP ? BASE_TOP : BASE;
    }

}
