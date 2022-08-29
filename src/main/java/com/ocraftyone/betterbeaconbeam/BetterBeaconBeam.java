package com.ocraftyone.betterbeaconbeam;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(BetterBeaconBeam.MODID)
@Mod.EventBusSubscriber
public class BetterBeaconBeam {
    public static final String MODID = "betterbeaconbeam";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public BetterBeaconBeam() {
    
    }
}