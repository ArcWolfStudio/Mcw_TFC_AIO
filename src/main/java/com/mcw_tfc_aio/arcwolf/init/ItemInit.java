package com.mcw_tfc_aio.arcwolf.init;


import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import com.mcw_tfc_aio.arcwolf.objects.items.Hammer;
import com.mcw_tfc_aio.arcwolf.objects.items.Plier;
import com.mcw_tfc_aio.arcwolf.objects.items.RoofItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> ROOFING_HAMMER;
    public static final RegistryObject<Item> RAIN_GUTTER;
    public static final RegistryObject<Item> PLIERS;

    public ItemInit() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "mcw_tfc_aio");
        ROOFING_HAMMER = ITEMS.register("roofing_hammer", () -> new Hammer(null));

        RAIN_GUTTER = ITEMS.register("rain_gutter", () -> new RoofItem(null));

        PLIERS = ITEMS.register("pliers", () -> new Plier(null));


    }
}