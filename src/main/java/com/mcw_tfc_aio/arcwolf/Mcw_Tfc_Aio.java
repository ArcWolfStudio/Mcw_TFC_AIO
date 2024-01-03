package com.mcw_tfc_aio.arcwolf;

import com.mcw_tfc_aio.arcwolf.init.*;
import com.mcw_tfc_aio.arcwolf.storage.FurnitureStorageScreen;
import net.dries007.tfc.common.container.RestrictedChestContainer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.Direction;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
			FurnitureInit.BLOCKS_FURNITURE.register(modEventBus);
			EntityInit.setup(modEventBus);
			BlockEntityInit.REGISTER.register(modEventBus);
			ContainerInit.CONTAINERS.register(modEventBus);
			ItemInit.ITEMS.register(modEventBus);


			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}

	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}

	private void doClientStuff(final FMLClientSetupEvent event)
	{
		MenuScreens.register((MenuType)ContainerInit.EXAMPLE_CHEST.get(), FurnitureStorageScreen::new);
//		MenuScreens.register((MenuType)ContainerInit.EXAMPLE_CHEST.get(), RestrictedChestContainer::new);
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}

	public static VoxelShape calculateShapes(Direction to, VoxelShape shape) {
		VoxelShape[] buffer = new VoxelShape[]{shape, Shapes.empty()};
		int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;

		for(int i = 0; i < times; ++i) {
			buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> {
				buffer[1] = Shapes.or(buffer[1], Shapes.box(1.0 - maxZ, minY, minX, 1.0 - minZ, maxY, maxX));
			});
			buffer[0] = buffer[1];
			buffer[1] = Shapes.empty();
		}

		return buffer[0];
	}
	public static class Entity {
		public static final String SITTABLE_BLOCK = "mcw_tfc_aio:sittable_block";

		public Entity() {
		}
	}

}

