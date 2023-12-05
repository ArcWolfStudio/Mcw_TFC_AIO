package com.mcw_tfc_aio.arcwolf.objects.items;


import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Hammer extends Item {
    public Hammer(Object properties) {
        super((new Item.Properties()).tab(Mcw_Tfc_Aio.ROOFSITEMGROUP));
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> comp, TooltipFlag flag) {
        comp.add(this.getDescription().withStyle(ChatFormatting.GRAY));
    }

    @OnlyIn(Dist.CLIENT)
    public MutableComponent getDescription() {
        return new TranslatableComponent("mcw_tfc_aio.hammer.desc");
    }
}