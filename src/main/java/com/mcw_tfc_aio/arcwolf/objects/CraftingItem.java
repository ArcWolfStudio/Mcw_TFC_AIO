package com.mcw_tfc_aio.arcwolf.objects;


import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CraftingItem extends Item {
    public CraftingItem(Item.Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flag) {
        list.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public MutableComponent getDisplayName() {
        return Component.translatable("mcw_tfc_aio.furnitureitem.desc");
    }

    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 300;
    }
}