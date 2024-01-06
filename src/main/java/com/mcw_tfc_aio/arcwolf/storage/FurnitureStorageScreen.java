package com.mcw_tfc_aio.arcwolf.storage;


import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class FurnitureStorageScreen extends AbstractContainerScreen<FurnitureStorageContainer> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("mcw_tfc_aio", "textures/gui/generic_27.png");

    public FurnitureStorageScreen(FurnitureStorageContainer container, Inventory playerInv, Component title) {
        super(container, playerInv, title);
        this.leftPos = 0;
        this.topPos = 0;
    }

    public void render(GuiGraphics gui, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(gui);
        super.render(gui, mouseX, mouseY, partialTicks);
        this.renderTooltip(gui, mouseX, mouseY);
    }

    protected void renderBg(GuiGraphics gui, float mouseX, int mouseY, int partialTicks) {
        this.renderBackground(gui);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        gui.blit(TEXTURE, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
    }

    protected void renderLabels(GuiGraphics stack, int mouseX, int mouseY) {
    }
}