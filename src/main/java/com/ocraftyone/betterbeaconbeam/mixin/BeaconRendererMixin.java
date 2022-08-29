package com.ocraftyone.betterbeaconbeam.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BeaconRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BeaconRenderer.class)
public abstract class BeaconRendererMixin {
    
    public int getViewDistance() {
        return Minecraft.getInstance().options.renderDistance().get() * 16;
    }
}
