package com.mcw_tfc_aio.arcwolf.init;


import com.mcw_tfc_aio.arcwolf.objects.FuelItemBlock;
import com.mcw_tfc_aio.arcwolf.objects.bridges.*;
import com.mcw_tfc_aio.arcwolf.objects.items.Hammer;
import com.mcw_tfc_aio.arcwolf.objects.items.Plier;
import com.mcw_tfc_aio.arcwolf.objects.items.RoofItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "mcw_tfc_aio");
    public static final RegistryObject<Item> ROOFING_HAMMER = ITEMS.register("roofing_hammer", () -> new Hammer(null));
    public static final RegistryObject<Item> RAIN_GUTTER = ITEMS.register("rain_gutter", () -> new RoofItem(null));
    public static final RegistryObject<Item> PLIERS = ITEMS.register("pliers", () -> new Plier(null));

    public static final RegistryObject<Item> ACACIA_PICKET_FENCE = ITEMS.register("fences/acacia_fences/acacia_picket_fence",() -> {
       return new FuelItemBlock((Block)FenceInit.ACACIA_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PICKET_FENCE = ITEMS.register("fences/ash_fences/ash_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PICKET_FENCE = ITEMS.register("fences/aspen_fences/aspen_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PICKET_FENCE = ITEMS.register("fences/birch_fences/birch_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PICKET_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PICKET_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PICKET_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PICKET_FENCE = ITEMS.register("fences/hickory_fences/hickory_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PICKET_FENCE = ITEMS.register("fences/kapok_fences/kapok_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PICKET_FENCE = ITEMS.register("fences/maple_fences/maple_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PICKET_FENCE = ITEMS.register("fences/oak_fences/oak_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PICKET_FENCE = ITEMS.register("fences/palm_fences/palm_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PICKET_FENCE = ITEMS.register("fences/pine_fences/pine_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PICKET_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PICKET_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PICKET_FENCE = ITEMS.register("fences/spruce_fences/spruce_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PICKET_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PICKET_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PICKET_FENCE = ITEMS.register("fences/willow_fences/willow_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_STOCKADE_FENCE = ITEMS.register("fences/acacia_fences/acacia_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_STOCKADE_FENCE = ITEMS.register("fences/ash_fences/ash_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_STOCKADE_FENCE = ITEMS.register("fences/aspen_fences/aspen_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_STOCKADE_FENCE = ITEMS.register("fences/birch_fences/birch_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_STOCKADE_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_STOCKADE_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_STOCKADE_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_STOCKADE_FENCE = ITEMS.register("fences/hickory_fences/hickory_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_STOCKADE_FENCE = ITEMS.register("fences/kapok_fences/kapok_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_STOCKADE_FENCE = ITEMS.register("fences/maple_fences/maple_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_STOCKADE_FENCE = ITEMS.register("fences/oak_fences/oak_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_STOCKADE_FENCE = ITEMS.register("fences/palm_fences/palm_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_STOCKADE_FENCE = ITEMS.register("fences/pine_fences/pine_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_STOCKADE_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_STOCKADE_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_STOCKADE_FENCE = ITEMS.register("fences/spruce_fences/spruce_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_STOCKADE_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_STOCKADE_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_STOCKADE_FENCE = ITEMS.register("fences/willow_fences/willow_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_HORSE_FENCE = ITEMS.register("fences/acacia_fences/acacia_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_HORSE_FENCE = ITEMS.register("fences/ash_fences/ash_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_HORSE_FENCE = ITEMS.register("fences/aspen_fences/aspen_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_HORSE_FENCE = ITEMS.register("fences/birch_fences/birch_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_HORSE_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_HORSE_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_HORSE_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_HORSE_FENCE = ITEMS.register("fences/hickory_fences/hickory_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_HORSE_FENCE = ITEMS.register("fences/kapok_fences/kapok_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_HORSE_FENCE = ITEMS.register("fences/maple_fences/maple_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_HORSE_FENCE = ITEMS.register("fences/oak_fences/oak_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_HORSE_FENCE = ITEMS.register("fences/palm_fences/palm_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_HORSE_FENCE = ITEMS.register("fences/pine_fences/pine_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_HORSE_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_HORSE_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_HORSE_FENCE = ITEMS.register("fences/spruce_fences/spruce_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_HORSE_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_HORSE_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_HORSE_FENCE = ITEMS.register("fences/willow_fences/willow_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_WIRED_FENCE = ITEMS.register("fences/acacia_fences/acacia_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_WIRED_FENCE = ITEMS.register("fences/ash_fences/ash_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_WIRED_FENCE = ITEMS.register("fences/aspen_fences/aspen_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_WIRED_FENCE = ITEMS.register("fences/birch_fences/birch_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_WIRED_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_WIRED_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_WIRED_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_WIRED_FENCE = ITEMS.register("fences/hickory_fences/hickory_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_WIRED_FENCE = ITEMS.register("fences/kapok_fences/kapok_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_WIRED_FENCE = ITEMS.register("fences/maple_fences/maple_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_WIRED_FENCE = ITEMS.register("fences/oak_fences/oak_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_WIRED_FENCE = ITEMS.register("fences/palm_fences/palm_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_WIRED_FENCE = ITEMS.register("fences/pine_fences/pine_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_WIRED_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_WIRED_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_WIRED_FENCE = ITEMS.register("fences/spruce_fences/spruce_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_WIRED_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_WIRED_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_WIRED_FENCE = ITEMS.register("fences/willow_fences/willow_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_FENCE = ITEMS.register("fences/other_fences/bamboo_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BAMBOO_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HEDGE = ITEMS.register("fences/other_fences/hedge",() -> {
        return new FuelItemBlock((Block)FenceInit.HEDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_HIGHLEY_GATE = ITEMS.register("fences/acacia_fences/acacia_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_HIGHLEY_GATE = ITEMS.register("fences/ash_fences/ash_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_HIGHLEY_GATE = ITEMS.register("fences/aspen_fences/aspen_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_HIGHLEY_GATE = ITEMS.register("fences/birch_fences/birch_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_HIGHLEY_GATE = ITEMS.register("fences/blackwood_fences/blackwood_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_HIGHLEY_GATE = ITEMS.register("fences/chestnut_fences/chestnut_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_HIGHLEY_GATE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_HIGHLEY_GATE = ITEMS.register("fences/hickory_fences/hickory_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_HIGHLEY_GATE = ITEMS.register("fences/kapok_fences/kapok_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_HIGHLEY_GATE = ITEMS.register("fences/maple_fences/maple_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_HIGHLEY_GATE = ITEMS.register("fences/oak_fences/oak_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_HIGHLEY_GATE = ITEMS.register("fences/palm_fences/palm_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_HIGHLEY_GATE = ITEMS.register("fences/pine_fences/pine_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_HIGHLEY_GATE = ITEMS.register("fences/rosewood_fences/rosewood_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_HIGHLEY_GATE = ITEMS.register("fences/sequoia_fences/sequoia_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_HIGHLEY_GATE = ITEMS.register("fences/spruce_fences/spruce_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_HIGHLEY_GATE = ITEMS.register("fences/sycamore_fences/sycamore_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_HIGHLEY_GATE = ITEMS.register("fences/white_cedar_fences/white_cedar_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_HIGHLEY_GATE = ITEMS.register("fences/willow_fences/willow_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PYRAMID_GATE = ITEMS.register("fences/acacia_fences/acacia_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PYRAMID_GATE = ITEMS.register("fences/ash_fences/ash_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PYRAMID_GATE = ITEMS.register("fences/aspen_fences/aspen_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PYRAMID_GATE = ITEMS.register("fences/birch_fences/birch_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PYRAMID_GATE = ITEMS.register("fences/blackwood_fences/blackwood_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PYRAMID_GATE = ITEMS.register("fences/chestnut_fences/chestnut_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PYRAMID_GATE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PYRAMID_GATE = ITEMS.register("fences/hickory_fences/hickory_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PYRAMID_GATE = ITEMS.register("fences/kapok_fences/kapok_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PYRAMID_GATE = ITEMS.register("fences/maple_fences/maple_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PYRAMID_GATE = ITEMS.register("fences/oak_fences/oak_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PYRAMID_GATE = ITEMS.register("fences/palm_fences/palm_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PYRAMID_GATE = ITEMS.register("fences/pine_fences/pine_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PYRAMID_GATE = ITEMS.register("fences/rosewood_fences/rosewood_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PYRAMID_GATE = ITEMS.register("fences/sequoia_fences/sequoia_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PYRAMID_GATE = ITEMS.register("fences/spruce_fences/spruce_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PYRAMID_GATE = ITEMS.register("fences/sycamore_fences/sycamore_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PYRAMID_GATE = ITEMS.register("fences/white_cedar_fences/white_cedar_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PYRAMID_GATE = ITEMS.register("fences/willow_fences/willow_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ACACIA_BRIDGE = ITEMS.register("bridges/acacia_bridges/rope_acacia_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ACACIA_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ASH_BRIDGE = ITEMS.register("bridges/ash_bridges/rope_ash_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ASH_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ASPEN_BRIDGE = ITEMS.register("bridges/aspen_bridges/rope_aspen_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ASPEN_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_BIRCH_BRIDGE = ITEMS.register("bridges/birch_bridges/rope_birch_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_BIRCH_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_BLACKWOOD_BRIDGE = ITEMS.register("bridges/blackwood_bridges/rope_blackwood_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_BLACKWOOD_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_CHESTNUT_BRIDGE = ITEMS.register("bridges/chestnut_bridges/rope_chestnut_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_CHESTNUT_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_DOUGLAS_FIR_BRIDGE = ITEMS.register("bridges/douglas_fir_bridges/rope_douglas_fir_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_DOUGLAS_FIR_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_HICKORY_BRIDGE = ITEMS.register("bridges/hickory_bridges/rope_hickory_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_HICKORY_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_KAPOK_BRIDGE = ITEMS.register("bridges/kapok_bridges/rope_kapok_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_KAPOK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_MAPLE_BRIDGE = ITEMS.register("bridges/maple_bridges/rope_maple_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_MAPLE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_OAK_BRIDGE = ITEMS.register("bridges/oak_bridges/rope_oak_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_OAK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_PALM_BRIDGE = ITEMS.register("bridges/palm_bridges/rope_palm_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_PALM_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_PINE_BRIDGE = ITEMS.register("bridges/pine_bridges/rope_pine_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_PINE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ROSEWOOD_BRIDGE = ITEMS.register("bridges/rosewood_bridges/rope_rosewood_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ROSEWOOD_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SEQUOIA_BRIDGE = ITEMS.register("bridges/sequoia_bridges/rope_sequoia_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SEQUOIA_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SPRUCE_BRIDGE = ITEMS.register("bridges/spruce_bridges/rope_spruce_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SPRUCE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SYCAMORE_BRIDGE = ITEMS.register("bridges/sycamore_bridges/rope_sycamore_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SYCAMORE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_WHITE_CEDAR_BRIDGE = ITEMS.register("bridges/white_cedar_bridges/rope_white_cedar_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_WHITE_CEDAR_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_WILLOW_BRIDGE = ITEMS.register("bridges/willow_bridges/rope_willow_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_WILLOW_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_BRIDGE_PIER = ITEMS.register("bridges/acacia_bridges/acacia_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_BRIDGE_PIER = ITEMS.register("bridges/ash_bridges/ash_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_BRIDGE_PIER = ITEMS.register("bridges/aspen_bridges/aspen_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_BRIDGE_PIER = ITEMS.register("bridges/birch_bridges/birch_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_BRIDGE_PIER = ITEMS.register("bridges/blackwood_bridges/blackwood_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_BRIDGE_PIER = ITEMS.register("bridges/chestnut_bridges/chestnut_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_BRIDGE_PIER = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_BRIDGE_PIER = ITEMS.register("bridges/hickory_bridges/hickory_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_BRIDGE_PIER = ITEMS.register("bridges/kapok_bridges/kapok_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_BRIDGE_PIER = ITEMS.register("bridges/maple_bridges/maple_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_BRIDGE_PIER = ITEMS.register("bridges/oak_bridges/oak_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_BRIDGE_PIER = ITEMS.register("bridges/palm_bridges/palm_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_BRIDGE_PIER = ITEMS.register("bridges/pine_bridges/pine_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_BRIDGE_PIER = ITEMS.register("bridges/rosewood_bridges/rosewood_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_BRIDGE_PIER = ITEMS.register("bridges/sequoia_bridges/sequoia_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_BRIDGE_PIER = ITEMS.register("bridges/spruce_bridges/spruce_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_BRIDGE_PIER = ITEMS.register("bridges/sycamore_bridges/sycamore_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_BRIDGE_PIER = ITEMS.register("bridges/white_cedar_bridges/white_cedar_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_BRIDGE_PIER = ITEMS.register("bridges/willow_bridges/willow_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/acacia_bridges/acacia_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/ash_bridges/ash_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/aspen_bridges/aspen_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/birch_bridges/birch_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/blackwood_bridges/blackwood_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/chestnut_bridges/chestnut_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/hickory_bridges/hickory_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/kapok_bridges/kapok_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/maple_bridges/maple_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/oak_bridges/oak_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/palm_bridges/palm_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/pine_bridges/pine_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/rosewood_bridges/rosewood_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/sequoia_bridges/sequoia_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/spruce_bridges/spruce_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/sycamore_bridges/sycamore_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/white_cedar_bridges/white_cedar_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/willow_bridges/willow_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_STAIR = ITEMS.register("bridges/acacia_bridges/acacia_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOG_BRIDGE_STAIR = ITEMS.register("bridges/ash_bridges/ash_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOG_BRIDGE_STAIR = ITEMS.register("bridges/aspen_bridges/aspen_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_STAIR = ITEMS.register("bridges/birch_bridges/birch_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOG_BRIDGE_STAIR = ITEMS.register("bridges/blackwood_bridges/blackwood_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOG_BRIDGE_STAIR = ITEMS.register("bridges/chestnut_bridges/chestnut_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOG_BRIDGE_STAIR = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOG_BRIDGE_STAIR = ITEMS.register("bridges/hickory_bridges/hickory_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOG_BRIDGE_STAIR = ITEMS.register("bridges/kapok_bridges/kapok_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/maple_bridges/maple_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOG_BRIDGE_STAIR = ITEMS.register("bridges/oak_bridges/oak_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOG_BRIDGE_STAIR = ITEMS.register("bridges/palm_bridges/palm_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/pine_bridges/pine_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOG_BRIDGE_STAIR = ITEMS.register("bridges/rosewood_bridges/rosewood_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOG_BRIDGE_STAIR = ITEMS.register("bridges/sequoia_bridges/sequoia_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/spruce_bridges/spruce_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/sycamore_bridges/sycamore_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOG_BRIDGE_STAIR = ITEMS.register("bridges/white_cedar_bridges/white_cedar_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOG_BRIDGE_STAIR = ITEMS.register("bridges/willow_bridges/willow_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/acacia_bridges/acacia_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/ash_bridges/ash_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/aspen_bridges/aspen_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/birch_bridges/birch_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/blackwood_bridges/blackwood_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/chestnut_bridges/chestnut_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/hickory_bridges/hickory_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/kapok_bridges/kapok_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/maple_bridges/maple_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/oak_bridges/oak_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/palm_bridges/palm_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/pine_bridges/pine_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/rosewood_bridges/rosewood_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/sequoia_bridges/sequoia_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/spruce_bridges/spruce_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/sycamore_bridges/sycamore_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/white_cedar_bridges/white_cedar_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/willow_bridges/willow_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_RAIL_BRIDGE = ITEMS.register("bridges/acacia_bridges/acacia_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_RAIL_BRIDGE = ITEMS.register("bridges/ash_bridges/ash_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_RAIL_BRIDGE = ITEMS.register("bridges/aspen_bridges/aspen_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_RAIL_BRIDGE = ITEMS.register("bridges/birch_bridges/birch_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_RAIL_BRIDGE = ITEMS.register("bridges/blackwood_bridges/blackwood_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_RAIL_BRIDGE = ITEMS.register("bridges/chestnut_bridges/chestnut_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_RAIL_BRIDGE = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_RAIL_BRIDGE = ITEMS.register("bridges/hickory_bridges/hickory_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_RAIL_BRIDGE = ITEMS.register("bridges/kapok_bridges/kapok_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_RAIL_BRIDGE = ITEMS.register("bridges/maple_bridges/maple_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_RAIL_BRIDGE = ITEMS.register("bridges/oak_bridges/oak_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_RAIL_BRIDGE = ITEMS.register("bridges/palm_bridges/palm_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_RAIL_BRIDGE = ITEMS.register("bridges/pine_bridges/pine_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_RAIL_BRIDGE = ITEMS.register("bridges/rosewood_bridges/rosewood_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_RAIL_BRIDGE = ITEMS.register("bridges/sequoia_bridges/sequoia_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_RAIL_BRIDGE = ITEMS.register("bridges/spruce_bridges/spruce_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_RAIL_BRIDGE = ITEMS.register("bridges/sycamore_bridges/sycamore_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_RAIL_BRIDGE = ITEMS.register("bridges/white_cedar_bridges/white_cedar_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_RAIL_BRIDGE = ITEMS.register("bridges/willow_bridges/willow_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE = ITEMS.register("bridges/brick_bridges/brick_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE_PIER = ITEMS.register("bridges/brick_bridges/brick_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE_STAIR = ITEMS.register("bridges/brick_bridges/brick_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE_PIER = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_PIER = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE_STAIR = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_STAIR = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE_PIER = ITEMS.register("bridges/iron_bridges/iron_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE_STAIR = ITEMS.register("bridges/iron_bridges/iron_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE = ITEMS.register("bridges/iron_bridges/iron_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ROOF = ITEMS.register("roofs/ash_roofs/ash_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ROOF = ITEMS.register("roofs/birch_roofs/birch_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ROOF = ITEMS.register("roofs/maple_roofs/maple_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ROOF = ITEMS.register("roofs/oak_roofs/oak_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ROOF = ITEMS.register("roofs/palm_roofs/palm_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ROOF = ITEMS.register("roofs/pine_roofs/pine_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ROOF = ITEMS.register("roofs/willow_roofs/willow_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ATTIC_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ATTIC_ROOF = ITEMS.register("roofs/ash_roofs/ash_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ATTIC_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ATTIC_ROOF = ITEMS.register("roofs/birch_roofs/birch_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ATTIC_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ATTIC_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ATTIC_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ATTIC_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ATTIC_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ATTIC_ROOF = ITEMS.register("roofs/maple_roofs/maple_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ATTIC_ROOF = ITEMS.register("roofs/oak_roofs/oak_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ATTIC_ROOF = ITEMS.register("roofs/palm_roofs/palm_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ATTIC_ROOF = ITEMS.register("roofs/pine_roofs/pine_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ATTIC_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ATTIC_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ATTIC_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ATTIC_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ATTIC_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ATTIC_ROOF = ITEMS.register("roofs/willow_roofs/willow_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_TOP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_TOP_ROOF = ITEMS.register("roofs/ash_roofs/ash_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_TOP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_TOP_ROOF = ITEMS.register("roofs/birch_roofs/birch_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_TOP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_TOP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_TOP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_TOP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_TOP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_TOP_ROOF = ITEMS.register("roofs/maple_roofs/maple_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_TOP_ROOF = ITEMS.register("roofs/oak_roofs/oak_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_TOP_ROOF = ITEMS.register("roofs/palm_roofs/palm_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_TOP_ROOF = ITEMS.register("roofs/pine_roofs/pine_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_TOP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_TOP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_TOP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_TOP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_TOP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_TOP_ROOF = ITEMS.register("roofs/willow_roofs/willow_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_UPPER_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_UPPER_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_UPPER_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_UPPER_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_UPPER_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_UPPER_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_UPPER_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_UPPER_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_UPPER_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_UPPER_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_UPPER_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_UPPER_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_UPPER_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_UPPER_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_UPPER_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_UPPER_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_UPPER_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_UPPER_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_UPPER_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_UPPER_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_UPPER_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_UPPER_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_UPPER_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_UPPER_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_UPPER_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_UPPER_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_UPPER_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_UPPER_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_UPPER_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_UPPER_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_UPPER_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_UPPER_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_UPPER_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_UPPER_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_UPPER_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_UPPER_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_TOP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_TOP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_TOP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_TOP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_TOP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_TOP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_TOP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_TOP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_TOP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_TOP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_TOP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_TOP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_TOP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_TOP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_TOP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_TOP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_TOP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_TOP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_TOP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF = ITEMS.register("roofs/base_roofs/base_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ATTIC_ROOF = ITEMS.register("roofs/base_roofs/base_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_TOP_ROOF = ITEMS.register("roofs/base_roofs/base_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_LOWER_ROOF = ITEMS.register("roofs/base_roofs/base_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_STEEP_ROOF = ITEMS.register("roofs/base_roofs/base_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_UPPER_LOWER_ROOF = ITEMS.register("roofs/base_roofs/base_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_UPPER_STEEP_ROOF = ITEMS.register("roofs/base_roofs/base_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF_BLOCK = ITEMS.register("roofs/base_roofs/base_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF_SLAB = ITEMS.register("roofs/base_roofs/base_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_TOP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_TOP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_TOP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_TOP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_TOP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_TOP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_TOP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_TOP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF = ITEMS.register("roofs/white_roofs/white_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ATTIC_ROOF = ITEMS.register("roofs/white_roofs/white_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TOP_ROOF = ITEMS.register("roofs/white_roofs/white_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_LOWER_ROOF = ITEMS.register("roofs/white_roofs/white_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_STEEP_ROOF = ITEMS.register("roofs/white_roofs/white_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_roofs/white_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_roofs/white_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF_BLOCK = ITEMS.register("roofs/white_roofs/white_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF_SLAB = ITEMS.register("roofs/white_roofs/white_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ATTIC_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TOP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_LOWER_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_STEEP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF_BLOCK = ITEMS.register("roofs/light_gray_roofs/light_gray_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF_SLAB = ITEMS.register("roofs/light_gray_roofs/light_gray_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF = ITEMS.register("roofs/gray_roofs/gray_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ATTIC_ROOF = ITEMS.register("roofs/gray_roofs/gray_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TOP_ROOF = ITEMS.register("roofs/gray_roofs/gray_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_LOWER_ROOF = ITEMS.register("roofs/gray_roofs/gray_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_STEEP_ROOF = ITEMS.register("roofs/gray_roofs/gray_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_roofs/gray_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_roofs/gray_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF_BLOCK = ITEMS.register("roofs/gray_roofs/gray_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF_SLAB = ITEMS.register("roofs/gray_roofs/gray_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF = ITEMS.register("roofs/black_roofs/black_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ATTIC_ROOF = ITEMS.register("roofs/black_roofs/black_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TOP_ROOF = ITEMS.register("roofs/black_roofs/black_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_LOWER_ROOF = ITEMS.register("roofs/black_roofs/black_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_STEEP_ROOF = ITEMS.register("roofs/black_roofs/black_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_roofs/black_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_roofs/black_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF_BLOCK = ITEMS.register("roofs/black_roofs/black_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF_SLAB = ITEMS.register("roofs/black_roofs/black_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_ATTIC_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_TOP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_LOWER_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_STEEP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_UPPER_LOWER_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_UPPER_STEEP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_ROOF = ITEMS.register("roofs/brick_roofs/bricks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_ATTIC_ROOF = ITEMS.register("roofs/brick_roofs/bricks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_TOP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_LOWER_ROOF = ITEMS.register("roofs/brick_roofs/bricks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_STEEP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/brick_roofs/bricks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_STRIPED_AWNING = ITEMS.register("roofs/awnings/black_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BLACK_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_STRIPED_AWNING = ITEMS.register("roofs/awnings/blue_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BLUE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_STRIPED_AWNING = ITEMS.register("roofs/awnings/brown_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BROWN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_STRIPED_AWNING = ITEMS.register("roofs/awnings/cyan_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.CYAN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_STRIPED_AWNING = ITEMS.register("roofs/awnings/gray_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.GRAY_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_STRIPED_AWNING = ITEMS.register("roofs/awnings/green_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.GREEN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_STRIPED_AWNING = ITEMS.register("roofs/awnings/light_blue_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIGHT_BLUE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_STRIPED_AWNING = ITEMS.register("roofs/awnings/light_gray_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIGHT_GRAY_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_STRIPED_AWNING = ITEMS.register("roofs/awnings/lime_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIME_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_STRIPED_AWNING = ITEMS.register("roofs/awnings/magenta_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.MAGENTA_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_STRIPED_AWNING = ITEMS.register("roofs/awnings/orange_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.ORANGE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_STRIPED_AWNING = ITEMS.register("roofs/awnings/pink_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.PINK_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_STRIPED_AWNING = ITEMS.register("roofs/awnings/purple_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.PURPLE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_STRIPED_AWNING = ITEMS.register("roofs/awnings/red_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.RED_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_STRIPED_AWNING = ITEMS.register("roofs/awnings/yellow_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.YELLOW_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BLACK = ITEMS.register("roofs/gutters/gutter_base_black",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BLACK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BLUE = ITEMS.register("roofs/gutters/gutter_base_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BROWN = ITEMS.register("roofs/gutters/gutter_base_brown",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BROWN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_CYAN = ITEMS.register("roofs/gutters/gutter_base_cyan",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_CYAN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_GRAY = ITEMS.register("roofs/gutters/gutter_base_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_GREEN = ITEMS.register("roofs/gutters/gutter_base_green",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_GREEN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIGHT_BLUE = ITEMS.register("roofs/gutters/gutter_base_light_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIGHT_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIGHT_GRAY = ITEMS.register("roofs/gutters/gutter_base_light_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIGHT_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIME = ITEMS.register("roofs/gutters/gutter_base_lime",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIME.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_MAGENTA = ITEMS.register("roofs/gutters/gutter_base_magenta",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_MAGENTA.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_ORANGE = ITEMS.register("roofs/gutters/gutter_base_orange",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_ORANGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_PINK = ITEMS.register("roofs/gutters/gutter_base_pink",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_PINK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_PURPLE = ITEMS.register("roofs/gutters/gutter_base_purple",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_PURPLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_RED = ITEMS.register("roofs/gutters/gutter_base_red",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_RED.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_YELLOW = ITEMS.register("roofs/gutters/gutter_base_yellow",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_YELLOW.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_WHITE = ITEMS.register("roofs/gutters/gutter_base_white",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_WHITE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE = ITEMS.register("roofs/gutters/gutter_base",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE = ITEMS.register("roofs/gutters/gutter_middle",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BLACK = ITEMS.register("roofs/gutters/gutter_middle_black",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BLACK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BLUE = ITEMS.register("roofs/gutters/gutter_middle_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BROWN = ITEMS.register("roofs/gutters/gutter_middle_brown",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BROWN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_CYAN = ITEMS.register("roofs/gutters/gutter_middle_cyan",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_CYAN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_GRAY = ITEMS.register("roofs/gutters/gutter_middle_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_GREEN = ITEMS.register("roofs/gutters/gutter_middle_green",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_GREEN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIGHT_BLUE = ITEMS.register("roofs/gutters/gutter_middle_light_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIGHT_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIGHT_GRAY = ITEMS.register("roofs/gutters/gutter_middle_light_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIGHT_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIME = ITEMS.register("roofs/gutters/gutter_middle_lime",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIME.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_MAGENTA = ITEMS.register("roofs/gutters/gutter_middle_magenta",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_MAGENTA.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_ORANGE = ITEMS.register("roofs/gutters/gutter_middle_orange",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_ORANGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_PINK = ITEMS.register("roofs/gutters/gutter_middle_pink",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_PINK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_PURPLE = ITEMS.register("roofs/gutters/gutter_middle_purple",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_PURPLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_RED = ITEMS.register("roofs/gutters/gutter_middle_red",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_RED.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_YELLOW = ITEMS.register("roofs/gutters/gutter_middle_yellow",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_YELLOW.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_WHITE = ITEMS.register("roofs/gutters/gutter_middle_white",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_WHITE.get(), new Item.Properties());
    });


    public ItemInit() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}