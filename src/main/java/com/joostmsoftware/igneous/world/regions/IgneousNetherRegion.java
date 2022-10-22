package com.joostmsoftware.igneous.world.regions;

import com.joostmsoftware.igneous.world.biomes.IgneousNetherBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class IgneousNetherRegion extends Region {
    public IgneousNetherRegion(Identifier identifier, int weight) {
        super(identifier, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addBiome(mapper, MultiNoiseUtil.createNoiseHypercube(0.4f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), IgneousNetherBiomes.HOT_SPRINGS);
        this.addBiome(mapper, MultiNoiseUtil.createNoiseHypercube(0.4f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), IgneousNetherBiomes.LUSH_HOT_SPRINGS);
    }
}
