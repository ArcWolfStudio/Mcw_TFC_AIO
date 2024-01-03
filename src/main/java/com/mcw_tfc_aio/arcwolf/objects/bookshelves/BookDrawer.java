package com.mcw_tfc_aio.arcwolf.objects.bookshelves;

import com.mcw_tfc_aio.arcwolf.objects.WideFurniture;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class BookDrawer extends WideFurniture {
    public BookDrawer(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return 1.0F;
    }
}
