package com.mcw_tfc_aio.arcwolf.storage;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ChairRenderer extends EntityRenderer<ChairEntity> {
    public ChairRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public ResourceLocation getTextureLocation(ChairEntity chairEntity) {
        return null;
    }
}
