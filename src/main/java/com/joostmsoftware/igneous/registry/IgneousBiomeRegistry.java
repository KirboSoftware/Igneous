package com.joostmsoftware.igneous.registry;

import com.joostmsoftware.igneous.world.gen.biomes.nether.IgneousNetherBiomes;
import net.fabricmc.fabric.api.biome.v1.NetherBiomes;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

public class IgneousBiomeRegistry {

    public static void registerBiomes() {
        IgneousNetherBiomes.loadNetherBiomes();
    }

    public static void addNetherBiome(ResourceKey<Biome> biomeKey, Climate.ParameterPoint climate) {
        NetherBiomes.addNetherBiome(biomeKey, climate);
    }

    public static void registerBiome(ResourceKey<Biome> key, Biome biome) {
        BuiltinRegistries.register(BuiltinRegistries.BIOME, key.location(), biome);
    }
}
