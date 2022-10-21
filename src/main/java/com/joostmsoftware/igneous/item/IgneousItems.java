package com.joostmsoftware.igneous.item;

import com.joostmsoftware.igneous.Igneous;
import com.joostmsoftware.igneous.util.registry.IgneousItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class IgneousItems {
    public static final Map<String, Item> ITEMS = new HashMap<>();

    public static final Item TEST = new Item(new FabricItemSettings().group(Igneous.GROUP));
    public static final Item ANOTHER_TEST = new Item(new FabricItemSettings().group(Igneous.GROUP));

    static {
        ITEMS.put("test", TEST);
        ITEMS.put("another_test", ANOTHER_TEST);
    }

    public static void loadItemsInRegistry() {
        ITEMS.forEach(IgneousItemRegistry::registerItem);
    }
}
