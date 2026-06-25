package com.twixy.mod.item;

import com.twixy.mod.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TWIXY_SPAWN_EGG = Registry.register(
        Registries.ITEM,
        Identifier.of("twixy-mod", "twixy_spawn_egg"),
        new SpawnEggItem(ModEntities.TWIXY, 0xaaaaaa, 0x555555, new Item.Settings())
    );

    public static void register() {}
}
