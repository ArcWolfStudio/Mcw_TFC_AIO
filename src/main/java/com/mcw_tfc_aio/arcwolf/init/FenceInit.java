package com.mcw_tfc_aio.arcwolf.init;

import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import com.mcw_tfc_aio.arcwolf.objects.WiredFence;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FenceInit {

   // public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcw_Tfc_Aio.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS_FENCES = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcw_Tfc_Aio.MOD_ID);
    public static final RegistryObject<Block> ACACIA_PICKET_FENCE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ACACIA_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ACACIA_HORSE_FENCE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ACACIA_WIRED_FENCE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> ACACIA_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.ACACIA));
    public static final RegistryObject<Block> ACACIA_PYRAMID_GATE = BLOCKS_FENCES.register("fences/acacia_fences/acacia_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.ACACIA));
    public static final RegistryObject<Block> ASH_PICKET_FENCE = BLOCKS_FENCES.register("fences/ash_fences/ash_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASH_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/ash_fences/ash_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASH_HORSE_FENCE = BLOCKS_FENCES.register("fences/ash_fences/ash_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASH_WIRED_FENCE = BLOCKS_FENCES.register("fences/ash_fences/ash_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> ASH_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/ash_fences/ash_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> ASH_PYRAMID_GATE = BLOCKS_FENCES.register("fences/ash_fences/ash_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> ASPEN_PICKET_FENCE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASPEN_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASPEN_HORSE_FENCE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ASPEN_WIRED_FENCE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> ASPEN_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> ASPEN_PYRAMID_GATE = BLOCKS_FENCES.register("fences/aspen_fences/aspen_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> BIRCH_PICKET_FENCE = BLOCKS_FENCES.register("fences/birch_fences/birch_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BIRCH_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/birch_fences/birch_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BIRCH_HORSE_FENCE = BLOCKS_FENCES.register("fences/birch_fences/birch_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BIRCH_WIRED_FENCE = BLOCKS_FENCES.register("fences/birch_fences/birch_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> BIRCH_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/birch_fences/birch_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.BIRCH));
    public static final RegistryObject<Block> BIRCH_PYRAMID_GATE = BLOCKS_FENCES.register("fences/birch_fences/birch_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.BIRCH));
    public static final RegistryObject<Block> BLACKWOOD_PICKET_FENCE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACKWOOD_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACKWOOD_HORSE_FENCE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACKWOOD_WIRED_FENCE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> BLACKWOOD_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> BLACKWOOD_PYRAMID_GATE = BLOCKS_FENCES.register("fences/blackwood_fences/blackwood_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> CHESTNUT_PICKET_FENCE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CHESTNUT_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CHESTNUT_HORSE_FENCE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CHESTNUT_WIRED_FENCE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> CHESTNUT_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> CHESTNUT_PYRAMID_GATE = BLOCKS_FENCES.register("fences/chestnut_fences/chestnut_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> DOUGLAS_FIR_PICKET_FENCE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> DOUGLAS_FIR_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> DOUGLAS_FIR_HORSE_FENCE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> DOUGLAS_FIR_WIRED_FENCE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> DOUGLAS_FIR_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> DOUGLAS_FIR_PYRAMID_GATE = BLOCKS_FENCES.register("fences/douglas_fir_fences/douglas_fir_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> HICKORY_PICKET_FENCE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> HICKORY_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> HICKORY_HORSE_FENCE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> HICKORY_WIRED_FENCE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> HICKORY_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.DARK_OAK));
    public static final RegistryObject<Block> HICKORY_PYRAMID_GATE = BLOCKS_FENCES.register("fences/hickory_fences/hickory_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.DARK_OAK));
    public static final RegistryObject<Block> KAPOK_PICKET_FENCE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> KAPOK_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> KAPOK_HORSE_FENCE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> KAPOK_WIRED_FENCE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> KAPOK_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.JUNGLE));
    public static final RegistryObject<Block> KAPOK_PYRAMID_GATE = BLOCKS_FENCES.register("fences/kapok_fences/kapok_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.JUNGLE));
    public static final RegistryObject<Block> MANGROVE_PICKET_FENCE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MANGROVE_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MANGROVE_HORSE_FENCE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MANGROVE_WIRED_FENCE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> MANGROVE_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> MANGROVE_PYRAMID_GATE = BLOCKS_FENCES.register("fences/mangrove_fences/mangrove_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> MAPLE_PICKET_FENCE = BLOCKS_FENCES.register("fences/maple_fences/maple_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAPLE_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/maple_fences/maple_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAPLE_HORSE_FENCE = BLOCKS_FENCES.register("fences/maple_fences/maple_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> MAPLE_WIRED_FENCE = BLOCKS_FENCES.register("fences/maple_fences/maple_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> MAPLE_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/maple_fences/maple_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> MAPLE_PYRAMID_GATE = BLOCKS_FENCES.register("fences/maple_fences/maple_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> OAK_PICKET_FENCE = BLOCKS_FENCES.register("fences/oak_fences/oak_picket_fence", () ->  new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OAK_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/oak_fences/oak_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OAK_HORSE_FENCE = BLOCKS_FENCES.register("fences/oak_fences/oak_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> OAK_WIRED_FENCE = BLOCKS_FENCES.register("fences/oak_fences/oak_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> OAK_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/oak_fences/oak_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> OAK_PYRAMID_GATE = BLOCKS_FENCES.register("fences/oak_fences/oak_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> PALM_PICKET_FENCE = BLOCKS_FENCES.register("fences/palm_fences/palm_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PALM_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/palm_fences/palm_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PALM_HORSE_FENCE = BLOCKS_FENCES.register("fences/palm_fences/palm_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PALM_WIRED_FENCE = BLOCKS_FENCES.register("fences/palm_fences/palm_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> PALM_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/palm_fences/palm_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> PALM_PYRAMID_GATE = BLOCKS_FENCES.register("fences/palm_fences/palm_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> PINE_PICKET_FENCE = BLOCKS_FENCES.register("fences/pine_fences/pine_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PINE_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/pine_fences/pine_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PINE_HORSE_FENCE = BLOCKS_FENCES.register("fences/pine_fences/pine_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> PINE_WIRED_FENCE = BLOCKS_FENCES.register("fences/pine_fences/pine_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> PINE_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/pine_fences/pine_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> PINE_PYRAMID_GATE = BLOCKS_FENCES.register("fences/pine_fences/pine_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> ROSEWOOD_PICKET_FENCE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROSEWOOD_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROSEWOOD_HORSE_FENCE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ROSEWOOD_WIRED_FENCE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> ROSEWOOD_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> ROSEWOOD_PYRAMID_GATE = BLOCKS_FENCES.register("fences/rosewood_fences/rosewood_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> SEQUOIA_PICKET_FENCE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SEQUOIA_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SEQUOIA_HORSE_FENCE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SEQUOIA_WIRED_FENCE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> SEQUOIA_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> SEQUOIA_PYRAMID_GATE = BLOCKS_FENCES.register("fences/sequoia_fences/sequoia_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SPRUCE_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SPRUCE_HORSE_FENCE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SPRUCE_WIRED_FENCE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> SPRUCE_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.SPRUCE));
    public static final RegistryObject<Block> SPRUCE_PYRAMID_GATE = BLOCKS_FENCES.register("fences/spruce_fences/spruce_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.SPRUCE));
    public static final RegistryObject<Block> SYCAMORE_PICKET_FENCE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SYCAMORE_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SYCAMORE_HORSE_FENCE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SYCAMORE_WIRED_FENCE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> SYCAMORE_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> SYCAMORE_PYRAMID_GATE = BLOCKS_FENCES.register("fences/sycamore_fences/sycamore_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> WHITE_CEDAR_PICKET_FENCE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WHITE_CEDAR_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WHITE_CEDAR_HORSE_FENCE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WHITE_CEDAR_WIRED_FENCE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> WHITE_CEDAR_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> WHITE_CEDAR_PYRAMID_GATE = BLOCKS_FENCES.register("fences/white_cedar_fences/white_cedar_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> WILLOW_PICKET_FENCE = BLOCKS_FENCES.register("fences/willow_fences/willow_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_STOCKADE_FENCE = BLOCKS_FENCES.register("fences/willow_fences/willow_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_HORSE_FENCE = BLOCKS_FENCES.register("fences/willow_fences/willow_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WILLOW_WIRED_FENCE = BLOCKS_FENCES.register("fences/willow_fences/willow_wired_fence", () -> new WiredFence(null));
    public static final RegistryObject<Block> WILLOW_HIGHLEY_GATE = BLOCKS_FENCES.register("fences/willow_fences/willow_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> WILLOW_PYRAMID_GATE = BLOCKS_FENCES.register("fences/willow_fences/willow_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD),WoodType.OAK));
    public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS_FENCES.register("fences/other_fences/bamboo_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.0F, 2.0F).sound(SoundType.SCAFFOLDING)));
    public static final RegistryObject<Block> HEDGE = BLOCKS_FENCES.register("fences/other_fences/hedge", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.0F, 2.0F).sound(SoundType.GRASS)));



}

