package com.mcw_tfc_aio.arcwolf;

import com.mcw_tfc_aio.arcwolf.init.*;
import com.mcw_tfc_aio.arcwolf.objects.FuelItemBlock;
import com.mojang.bridge.Bridge;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

@Mod("mcw_tfc_aio")
@Mod.EventBusSubscriber(modid = Mcw_Tfc_Aio.MOD_ID, bus = Bus.MOD)
public class Mcw_Tfc_Aio 
{
	public static final String MOD_ID = "mcw_tfc_aio";
	public static Mcw_Tfc_Aio instance;
	
	public Mcw_Tfc_Aio() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			BlockInit.BLOCKS.register(modEventBus);
			RoofInit.BLOCKS_ROOFS.register(modEventBus);
			FenceInit.BLOCKS_FENCES.register(modEventBus);
			GutterInit.BLOCKS_GUTTERS.register(modEventBus);
			BridgeInit.BLOCKS_BRIDGES.register(modEventBus);
			ItemInit.ITEMS.register(modEventBus);

			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		GutterInit.BLOCKS_GUTTERS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(GUTTERGROUP);
			final BlockItem blockItem = new FuelItemBlock(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		
		RoofInit.BLOCKS_ROOFS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(ROOFSITEMGROUP);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});

		FenceInit.BLOCKS_FENCES.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(FencesItemGroup);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		BridgeInit.BLOCKS_BRIDGES.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().tab(BridgesItemGroup);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});

	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}

	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}
	
    private static final CreativeModeTab FencesItemGroup = new CreativeModeTab("fences") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FenceInit.OAK_PICKET_FENCE.get());
        }
    };
	public static final CreativeModeTab ROOFSITEMGROUP = new CreativeModeTab("roofs") {
		@Nonnull
		public ItemStack makeIcon() {
			return new ItemStack(RoofInit.OAK_ROOF.get());
		}
	};
	public static final CreativeModeTab GUTTERGROUP = new CreativeModeTab("roofs2") {
		@Nonnull
		public ItemStack makeIcon() {
			return new ItemStack(GutterInit.GUTTER_MIDDLE.get());
		}
	};
	public static final CreativeModeTab BridgesItemGroup = new CreativeModeTab("bridges") {
		@Nonnull
		public ItemStack makeIcon() {
			return new ItemStack(BridgeInit.IRON_BRIDGE.get());
		}
	};
}

