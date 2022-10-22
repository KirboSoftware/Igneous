package com.joostmsoftware.igneous.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class IgneousPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> NETHER_FLOWERS = PlacedFeatures.register("nether_flowers_placed",
            IgneousConfiguredFeatures.NETHER_FLOWERS,
            RarityFilterPlacementModifier.of(4),
            SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
            BiomePlacementModifier.of()
    );
}
