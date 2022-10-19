package com.joostmsoftware.igneous;

import com.joostmsoftware.igneous.core.registry.IgneousBiomeRegistry;
import com.joostmsoftware.igneous.core.registry.IgneousBlockRegistry;
import com.joostmsoftware.igneous.core.registry.IgneousFluidRegistry;
import com.joostmsoftware.igneous.core.registry.IgneousItemRegistry;
import com.joostmsoftware.igneous.world.gen.regions.IgneousNetherRegion;
import com.joostmsoftware.igneous.world.surface.nether.IgneousNetherSurfaceRuleData;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class Igneous implements ModInitializer, TerraBlenderApi {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Igneous");

	private static final String MOD_ID = "igneous";

	public static ResourceLocation ID(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

	public static CreativeModeTab GROUP = FabricItemGroupBuilder.build(ID("group"), ()-> new ItemStack(Items.WARPED_NYLIUM));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// do first
		IgneousBiomeRegistry.registerBiomes();

		IgneousFluidRegistry.registerFluids();
		IgneousItemRegistry.registerItems();
		IgneousBlockRegistry.registerBlocks();

		LOGGER.info("Loaded all registries from " + MOD_ID);
	}

	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new IgneousNetherRegion(ID("nether"), 1));

		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, MOD_ID, IgneousNetherSurfaceRuleData.makeNetherRules());
	}
}
