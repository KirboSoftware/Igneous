package com.joostmsoftware.igneous.world.gen.biomes.nether;

import net.minecraft.client.sound.MusicType;
import net.minecraft.sound.BiomeAdditionsSound;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.MiscPlacedFeatures;

public class LushedHotSpringsBiome {

    public static Biome create() {
        SpawnSettings mobSpawnSettings = new SpawnSettings.Builder()
                .build();
        GenerationSettings.Builder builder = new GenerationSettings.Builder()
                .carver(GenerationStep.Carver.AIR, ConfiguredCarvers.NETHER_CAVE)
                .feature(GenerationStep.Feature.VEGETAL_DECORATION, MiscPlacedFeatures.SPRING_LAVA);
        DefaultBiomeFeatures.addNetherMineables(builder);

        return new Biome.Builder()
                .precipitation(Biome.Precipitation.NONE)
                .temperature(0.4f)
                .downfall(0.0f)
                .effects(new BiomeEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(3344392)
                        .skyColor(4444444)
                        .loopSound(SoundEvents.AMBIENT_WARPED_FOREST_LOOP)
                        .moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_WARPED_FOREST_MOOD, 6000, 8, 2.0))
                        .additionsSound(new BiomeAdditionsSound(SoundEvents.AMBIENT_WARPED_FOREST_ADDITIONS, 0.0111))
                        .music(MusicType.createIngameMusic(SoundEvents.AMBIENT_WARPED_FOREST_MOOD))
                        .build()
                )
                .spawnSettings(mobSpawnSettings)
                .generationSettings(builder.build())
                .build();
    }
}
