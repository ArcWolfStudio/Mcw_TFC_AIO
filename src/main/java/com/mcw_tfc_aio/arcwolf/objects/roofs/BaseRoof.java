package com.mcw_tfc_aio.arcwolf.objects.roofs;

import net.minecraft.core.BlockPos;
import com.mcw_tfc_aio.arcwolf.init.ItemInit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BaseRoof extends StairBlock {
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    protected static final VoxelShape BASE_BOTTOM = Block.box(0.0, 1.0, 0.0, 16.0, 16.0, 16.0);

    public BaseRoof(BlockState state, BlockBehaviour.Properties prop){
        super(state, prop);
    }

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos){
        return state.getValue(HALF) == Half.BOTTOM ?  BASE: BASE_BOTTOM;
    }
    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        if (item == ItemInit.ROOFING_HAMMER.get()) {
            BlockState newState = state.cycle(SHAPE);
            worldIn.setBlock(pos, newState, 3);
            worldIn.sendBlockUpdated(pos, state, newState, 3);
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }

    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving){
        world.sendBlockUpdated(pos, Blocks.AIR.defaultBlockState(),state, 3);
        world.sendBlockUpdated(pos.below(), Blocks.AIR.defaultBlockState(), world.getBlockState(pos.below()),3);
    }
}
