package com.mcw_tfc_aio.arcwolf.init;

import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import com.mcw_tfc_aio.arcwolf.objects.FuelItemBlock;
import com.mcw_tfc_aio.arcwolf.objects.WiredFence;
import com.mcw_tfc_aio.arcwolf.objects.bridges.*;
import com.mcw_tfc_aio.arcwolf.objects.gutters.GutterTall;
import com.mcw_tfc_aio.arcwolf.objects.gutters.RainGutter;
import com.mcw_tfc_aio.arcwolf.objects.roofs.*;
import io.netty.resolver.DefaultHostsFileEntriesResolver;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Supplier;


public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mcw_Tfc_Aio.MOD_ID);

}
