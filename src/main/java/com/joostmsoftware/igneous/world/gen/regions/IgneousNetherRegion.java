package com.joostmsoftware.igneous.world.gen.regions;

import com.joostmsoftware.igneous.world.gen.biomes.nether.IgneousNetherBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class IgneousNetherRegion extends Region {
    public IgneousNetherRegion(ResourceLocation name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addBiome(mapper, Climate.parameters(0.4f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), IgneousNetherBiomes.HOT_SPRINGS);
        this.addBiome(mapper, Climate.parameters(0.4f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), IgneousNetherBiomes.LUSH_HOT_SPRINGS);
    }
}
