package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.world.biomes.IgneousNetherBiomes;

public class IgneousBiomeRegistry {

    public static void registerBiomes() {
        Igneous.LOGGER.info("Registering all biomes");
        IgneousNetherBiomes.loadNetherBiomes();
    }
}
