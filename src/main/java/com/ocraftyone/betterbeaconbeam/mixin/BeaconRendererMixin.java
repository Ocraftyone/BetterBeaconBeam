package com.ocraftyone.betterbeaconbeam.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.blockentity.BeaconRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BeaconRenderer.class)
public abstract class BeaconRendererMixin {
    /**
     * @author Ocraftyone
     * @reason Tie beacon beam to render distance
     */
    @Overwrite
    public int getViewDistance() {
        return Minecraft.getInstance().options.renderDistance().get() * 16;
    }
}
