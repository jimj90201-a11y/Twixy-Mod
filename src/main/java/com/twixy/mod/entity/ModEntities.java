package com.twixy.mod.entity;

import com.twixy.mod.TwixyMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<TwixyEntity> TWIXY = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of("twixy-mod", "twixy")
        EntityType.Builder.create(TwixyEntity::new, SpawnGroup.CREATURE)
            .dimensions(0.6f, 0.7f)
            .build()
    );

    public static void register() {}
}
