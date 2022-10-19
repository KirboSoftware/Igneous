package com.joostmsoftware.igneous.world.biomes.nether;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.util.registry.IgneousBiomeRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
public class IgneousNetherBiomes {

    public static final RegistryKey<Biome> HOT_SPRINGS = registerBiomeKey("hot_springs");
    public static final RegistryKey<Biome> LUSH_HOT_SPRINGS = registerBiomeKey("lush_hot_springs");

    private static RegistryKey<Biome> registerBiomeKey(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, Igneous.ID(name));
    }

    public static void loadNetherBiomes() {
        Igneous.LOGGER.info("Registering Biomes");
        // do first
        IgneousBiomeRegistry.registerBiome(HOT_SPRINGS, HotSpringsBiome.create());
        IgneousBiomeRegistry.registerBiome(LUSH_HOT_SPRINGS, LushedHotSpringsBiome.create());

        // do second
        IgneousBiomeRegistry.addNetherBiome(HOT_SPRINGS, MultiNoiseUtil.createNoiseHypercube(0.4f, 0.2f, 0.0f, 0.0f,0.0f, 0.0f, 0.0f));
        IgneousBiomeRegistry.addNetherBiome(LUSH_HOT_SPRINGS, MultiNoiseUtil.createNoiseHypercube(0.4f, 0.5f, 0.0f, 0.0f,0.0f, 0.0f, 0.0f));
    }
}
