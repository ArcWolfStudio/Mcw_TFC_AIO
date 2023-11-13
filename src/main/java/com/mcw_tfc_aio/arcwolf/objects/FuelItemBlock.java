package com.mcw_tfc_aio.arcwolf.objects;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nullable;

public class FuelItemBlock extends BlockItem implements IForgeItem {

		public FuelItemBlock(Block block, Properties prop) {
			super(block, prop);
		}

		@Override
		public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
			return 300;
		}
}