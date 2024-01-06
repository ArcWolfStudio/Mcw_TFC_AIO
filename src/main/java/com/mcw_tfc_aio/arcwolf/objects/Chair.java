package com.mcw_tfc_aio.arcwolf.objects;


import com.mcw_tfc_aio.arcwolf.storage.ChairEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Chair extends FurnitureObjectNonFaceable {
    private static final VoxelShape BASE = Shapes.or(Block.box(4.0, 11.0, 4.0, 12.0, 11.6, 12.0), new VoxelShape[]{Block.box(10.0, 0.0, 10.0, 12.0, 9.0, 12.0), Block.box(4.0, 0.0, 10.0, 6.0, 9.0, 12.0), Block.box(10.0, 0.0, 4.0, 12.0, 9.0, 6.0), Block.box(4.0, 0.0, 4.0, 6.0, 9.0, 6.0), Block.box(3.0, 9.0, 3.0, 13.0, 11.0, 13.0)});

    public Chair(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)this.stateDefinition.any());
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player playerEntity, InteractionHand hand, BlockHitResult hitResult) {
        return ChairEntity.create(level, pos, 0.3, playerEntity);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        return BASE;
    }
}
