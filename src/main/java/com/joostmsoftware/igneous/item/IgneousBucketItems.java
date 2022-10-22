package com.joostmsoftware.igneous.item;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.jxlib.registry.item.ItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

import static com.joostmsoftware.igneous.fluid.IgneousFluids.STILL_NETHER_WATER;

public class IgneousBucketItems {

    public static final Map<String, BucketItem> BUCKET_ITEMS = new HashMap<>();

    public static BucketItem NETHER_WATER_BUCKET = new BucketItem(STILL_NETHER_WATER, new FabricItemSettings().group(Igneous.GROUP).recipeRemainder(Items.BUCKET).maxCount(1));


    static {
        BUCKET_ITEMS.put("nether_water_bucket", NETHER_WATER_BUCKET);
    }

    public static void loadBucketsInRegistry() {
        BUCKET_ITEMS.forEach(ItemRegistry::registerBucketItem);
    }
}
