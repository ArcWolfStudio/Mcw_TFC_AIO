package com.mcw_tfc_aio.arcwolf.objects.items;


import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class RoofItem extends Item {
    public RoofItem(Object properties) {
        super(new Item.Properties());
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag flag) {
        list.add(this.getDescription().withStyle(ChatFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public MutableComponent getDescription() {
        return Component.translatable("mcw_tfc_aio.roofitem.desc");
    }
}
