package com.joostmsoftware.igneous.core.registry;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.item.IgneousBlockItems;
import com.joostmsoftware.igneous.item.IgneousBucketItems;
import com.joostmsoftware.igneous.item.IgneousItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class IgneousItemRegistry {

    public static void registerItems() {
        IgneousItems.loadItemsInRegistry();
        IgneousBlockItems.loadBlockItemsInRegistry();
        IgneousBucketItems.loadBucketsInRegistry();
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, Igneous.ID(name), new BlockItem(block, new FabricItemSettings().group(Igneous.GROUP)));
    }

    public static void registerBucketItem(String name, BucketItem item) {
        Registry.register(Registry.ITEM, Igneous.ID(name), item);
    }

    public static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, Igneous.ID(name), item);
    }
}
