package com.joostmsoftware.igneous.world.gen.biomes.nether;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.core.registry.IgneousBiomeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

public class IgneousNetherBiomes {

    public static final ResourceKey<Biome> HOT_SPRINGS = registerBiomeKey("hot_springs");
    public static final ResourceKey<Biome> LUSH_HOT_SPRINGS = registerBiomeKey("lush_hot_springs");

    private static ResourceKey<Biome> registerBiomeKey(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, Igneous.ID(name));
    }

    public static void loadNetherBiomes() {
        Igneous.LOGGER.info("Registering Biomes");
        // do first
        IgneousBiomeRegistry.registerBiome(HOT_SPRINGS, HotSpringsBiome.create());
        IgneousBiomeRegistry.registerBiome(LUSH_HOT_SPRINGS, LushedHotSpringsBiome.create());

        // do second
        IgneousBiomeRegistry.addNetherBiome(HOT_SPRINGS, Climate.parameters(0.4f, 0.2f, 0.0f, 0.0f,0.0f, 0.0f, 0.0f));
        IgneousBiomeRegistry.addNetherBiome(LUSH_HOT_SPRINGS, Climate.parameters(0.4f, 0.5f, 0.0f, 0.0f,0.0f, 0.0f, 0.0f));
    }
}
