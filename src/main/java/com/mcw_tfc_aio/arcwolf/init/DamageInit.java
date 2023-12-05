package com.mcw_tfc_aio.arcwolf.init;

import net.minecraft.world.damagesource.DamageSource;

public class DamageInit extends DamageSource {
	

	   public DamageInit(String string) {
		super(string);
	}

	public static final DamageSource WIRED_FENCE = new DamageSource("wired_fence");


}
