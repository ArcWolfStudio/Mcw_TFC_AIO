package com.mcw_tfc_aio.arcwolf;

import com.mcw_tfc_aio.arcwolf.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod("mcw_tfc_aio")
@Mod.EventBusSubscriber(modid = Mcw_Tfc_Aio.MOD_ID, bus = Bus.MOD)
public class Mcw_Tfc_Aio 
{
	public static final String MOD_ID = "mcw_tfc_aio";
	public static Mcw_Tfc_Aio instance;
	
	public Mcw_Tfc_Aio() 
	{
			IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);
			//modEventBus.addListener(this::addCreative);

			CreativeTab.CREATIVE_TABS.register(modEventBus);
			CreativeTab.register(modEventBus);
			BlockInit.BLOCKS.register(modEventBus);
			RoofInit.BLOCKS_ROOFS.register(modEventBus);
			FenceInit.BLOCKS_FENCES.register(modEventBus);
			GutterInit.BLOCKS_GUTTERS.register(modEventBus);
			BridgeInit.BLOCKS_BRIDGES.register(modEventBus);
			ItemInit.ITEMS.register(modEventBus);


			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
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

}

