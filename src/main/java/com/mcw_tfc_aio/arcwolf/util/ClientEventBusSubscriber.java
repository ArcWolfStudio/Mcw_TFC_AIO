//package com.mcw_tfc_aio.arcwolf.util;
//
//import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
//import com.mcw_tfc_aio.arcwolf.init.BridgeInit;
//import com.mcw_tfc_aio.arcwolf.init.FenceInit;
//import com.mcw_tfc_aio.arcwolf.init.RoofInit;
//import net.minecraft.client.renderer.ItemBlockRenderTypes;
//import net.minecraft.client.renderer.RenderType;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//
//@Mod.EventBusSubscriber(modid = Mcw_Tfc_Aio.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
//public class ClientEventBusSubscriber {
//
//	@SubscribeEvent
//	public static void clientSetup(FMLClientSetupEvent event) {
//
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.OAK_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SPRUCE_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BIRCH_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.KAPOK_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ACACIA_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.HICKORY_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASH_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASPEN_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BLACKWOOD_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.CHESTNUT_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.MAPLE_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PALM_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PINE_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.DOUGLAS_FIR_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ROSEWOOD_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SEQUOIA_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SYCAMORE_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WHITE_CEDAR_WIRED_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WILLOW_WIRED_FENCE.get(), RenderType.cutout());
//
//
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_STONE_BRICK_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_ANDESITE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DIORITE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_GRANITE_WALL.get(), RenderType.cutout());
//	//	ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_SANDSTONE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_RED_SANDSTONE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_BLACKSTONE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_NETHER_BRICK_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_END_BRICK_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DEEPSLATE_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DEEPSLATE_BRICK_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_QUARTZ_WALL.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_PRISMARINE_WALL.get(), RenderType.cutout());
//
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.KAPOK_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.HICKORY_HEDGE.get(), RenderType.cutout());
//	//	ItemBlockRenderTypes.setRenderLayer(BlockInit.AZALEA_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.ASH_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.ASPEN_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKWOOD_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.CHESTNUT_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.DOUGLAS_FIR_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.MAPLE_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.PALM_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.PINE_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.SEQUOIA_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.SYCAMORE_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.ROSEWOOD_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_CEDAR_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.WILLOW_HEDGE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.FLOWERING_AZALEA_HEDGE.get(), RenderType.cutout());
//
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.OAK_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BIRCH_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.KAPOK_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ACACIA_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.HICKORY_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASH_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASPEN_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BLACKWOOD_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.CHESTNUT_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.DOUGLAS_FIR_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.MAPLE_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PALM_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PINE_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ROSEWOOD_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SEQUOIA_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SYCAMORE_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WHITE_CEDAR_PICKET_FENCE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WILLOW_PICKET_FENCE.get(), RenderType.cutout());
//
//
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.OAK_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BIRCH_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.KAPOK_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ACACIA_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.HICKORY_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASH_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ASPEN_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.BLACKWOOD_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.CHESTNUT_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.DOUGLAS_FIR_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.MAPLE_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PALM_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.PINE_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.ROSEWOOD_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SEQUOIA_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.SYCAMORE_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WHITE_CEDAR_HIGHLEY_GATE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(FenceInit.WILLOW_HIGHLEY_GATE.get(), RenderType.cutout());
//
//
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.ANDESITE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.DIORITE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.GRANITE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.NETHER_BRICK_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.END_BRICK_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_RAILING_GATE.get(), RenderType.cutout());
//	//	ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_BRICK_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.QUARTZ_RAILING_GATE.get(), RenderType.cutout());
//		//ItemBlockRenderTypes.setRenderLayer(BlockInit.PRISMARINE_RAILING_GATE.get(), RenderType.cutout());
//
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ACACIA_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.THATCH_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BRICKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WHITE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIGHT_GRAY_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.GRAY_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLACK_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BASE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.RED_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PURPLE_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PINK_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ORANGE_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.MAGENTA_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIME_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIGHT_GRAY_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIGHT_BLUE_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.GREEN_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.GRAY_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.CYAN_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BROWN_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLUE_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLACK_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.YELLOW_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WHITE_CONCRETE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.YELLOW_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WHITE_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.RED_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PURPLE_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PINK_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ORANGE_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.MAGENTA_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIME_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIGHT_GRAY_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.LIGHT_BLUE_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.GREEN_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.GRAY_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.CYAN_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BROWN_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLUE_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLACK_TERRACOTTA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BIRCH_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.OAK_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SPRUCE_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ACACIA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BIRCH_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SPRUCE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.OAK_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ASH_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ASH_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ASPEN_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.ASPEN_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLACKWOOD_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.BLACKWOOD_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.CHESTNUT_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.CHESTNUT_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.DOUGLAS_FIR_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.DOUGLAS_FIR_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.HICKORY_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.HICKORY_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.KAPOK_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.KAPOK_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.MAPLE_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.MAPLE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PALM_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PALM_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PINE_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.PINE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SEQUOIA_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SEQUOIA_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SYCAMORE_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.SYCAMORE_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WHITE_CEDAR_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WHITE_CEDAR_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WILLOW_PLANKS_ATTIC_ROOF.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(RoofInit.WILLOW_ATTIC_ROOF.get(), RenderType.cutout());
//
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.IRON_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.OAK_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BIRCH_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ACACIA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SPRUCE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_OAK_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_BIRCH_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_SPRUCE_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_ACACIA_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BRICK_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.OAK_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SPRUCE_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BIRCH_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ACACIA_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BAMBOO_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DRY_BAMBOO_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.IRON_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.OAK_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SPRUCE_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BIRCH_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ACACIA_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BRICK_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BAMBOO_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DRY_BAMBOO_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.IRON_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.OAK_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SPRUCE_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BIRCH_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ACACIA_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.OAK_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SPRUCE_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BIRCH_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ACACIA_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BRICK_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BAMBOO_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DRY_BAMBOO_BRIDGE_STAIR.get(), RenderType.cutout());
//
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASH_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASH_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASH_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASH_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_ASH_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASH_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASPEN_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASPEN_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASPEN_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASPEN_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_ASPEN_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ASPEN_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BLACKWOOD_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BLACKWOOD_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BLACKWOOD_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BLACKWOOD_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_BLACKWOOD_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.BLACKWOOD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.CHESTNUT_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.CHESTNUT_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.CHESTNUT_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.CHESTNUT_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_CHESTNUT_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.CHESTNUT_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DOUGLAS_FIR_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DOUGLAS_FIR_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DOUGLAS_FIR_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_DOUGLAS_FIR_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.HICKORY_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.HICKORY_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.HICKORY_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.HICKORY_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_HICKORY_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.HICKORY_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.KAPOK_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.KAPOK_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.KAPOK_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.KAPOK_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_KAPOK_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.KAPOK_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.MAPLE_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.MAPLE_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.MAPLE_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.MAPLE_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_MAPLE_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.MAPLE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PALM_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PALM_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PALM_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PALM_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_PALM_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PALM_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PINE_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PINE_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PINE_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PINE_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_PINE_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.PINE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROSEWOOD_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROSEWOOD_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROSEWOOD_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROSEWOOD_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_ROSEWOOD_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROSEWOOD_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SEQUOIA_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SEQUOIA_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SEQUOIA_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SEQUOIA_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_SEQUOIA_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SEQUOIA_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SYCAMORE_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SYCAMORE_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SYCAMORE_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SYCAMORE_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_SYCAMORE_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.SYCAMORE_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WHITE_CEDAR_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WHITE_CEDAR_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WHITE_CEDAR_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WHITE_CEDAR_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_WHITE_CEDAR_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WHITE_CEDAR_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WILLOW_LOG_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WILLOW_ROPE_BRIDGE_STAIR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WILLOW_BRIDGE_PIER.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WILLOW_RAIL_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.ROPE_WILLOW_BRIDGE.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BridgeInit.WILLOW_LOG_BRIDGE_MIDDLE.get(), RenderType.cutout());
//
//	}
//}
//
