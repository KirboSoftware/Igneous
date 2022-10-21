package com.joostmsoftware.igneous.util.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.world.biomes.IgneousNetherBiomes;
import net.fabricmc.fabric.api.biome.v1.NetherBiomes;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;

public class IgneousBiomeRegistry {

    public static void registerBiomes() {
        Igneous.LOGGER.info("Registering all biomes");
        IgneousNetherBiomes.loadNetherBiomes();
    }

    public static void addNetherBiome(RegistryKey<Biome> biomeKey, MultiNoiseUtil.NoiseHypercube climate) {
        NetherBiomes.addNetherBiome(biomeKey, climate);
    }

    public static void registerBiome(RegistryKey<Biome> key, Biome biome) {
        BuiltinRegistries.add(BuiltinRegistries.BIOME, key.getValue(), biome);
    }
}
