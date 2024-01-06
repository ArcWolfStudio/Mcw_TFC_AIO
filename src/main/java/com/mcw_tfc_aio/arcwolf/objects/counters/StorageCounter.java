package com.mcw_tfc_aio.arcwolf.objects.counters;


import com.mcw_tfc_aio.arcwolf.storage.StorageTileEntity;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
//import net.dries007.tfc.common.blockentities.TFCChestBlockEntity;

public class StorageCounter extends Counter implements EntityBlock {
    public StorageCounter(BlockState state, BlockBehaviour.Properties prop) {
        super(prop);
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StorageTileEntity(pos, state);
    }
//    @Nullable
//    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//        return new TFCChestBlockEntity(pos, state);
//    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (item != this.asItem()) {
            if (!level.isClientSide()) {
                BlockEntity var10 = level.getBlockEntity(pos);
                if (var10 instanceof StorageTileEntity) {
                    StorageTileEntity blockEntity = (StorageTileEntity)var10;
                    player.openMenu(blockEntity);
                }
            }

            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.PASS;
        }
    }
//    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
//        ItemStack itemstack = player.getItemInHand(hand);
//        Item item = itemstack.getItem();
//        if (item != this.asItem()) {
//            if (!level.isClientSide()) {
//                BlockEntity var10 = level.getBlockEntity(pos);
//                if (var10 instanceof TFCChestBlockEntity) {
//                    TFCChestBlockEntity blockEntity = (TFCChestBlockEntity)var10;
//                    player.openMenu(blockEntity);
//                }
//            }
//
//            return InteractionResult.SUCCESS;
//        } else {
//            return InteractionResult.PASS;
//        }
//    }

    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!state.is(statetwo.getBlock())) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            if (blockentity instanceof Container) {
                Containers.dropContents(level, pos, (Container)blockentity);
                level.updateNeighbourForOutputSignal(pos, this);
            }

            super.onRemove(state, level, pos, statetwo, bool);
        }

    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof StorageTileEntity) {
            ((StorageTileEntity)blockentity).recheckOpen();
        }

    }
//    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
//        BlockEntity blockentity = level.getBlockEntity(pos);
//        if (blockentity instanceof TFCChestBlockEntity) {
//            ((TFCChestBlockEntity)blockentity).recheckOpen();
//        }
//
//    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
        if (stack.hasCustomHoverName()) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            if (blockentity instanceof StorageTileEntity) {
                ((StorageTileEntity)blockentity).setCustomName(stack.getHoverName());
            }
        }

    }
//    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
//        if (stack.hasCustomHoverName()) {
//            BlockEntity blockentity = level.getBlockEntity(pos);
//            if (blockentity instanceof TFCChestBlockEntity) {
//                ((TFCChestBlockEntity)blockentity).setCustomName(stack.getHoverName());
//            }
//        }
//
//    }

    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos));
    }
}
