package com.twixy.mod;

import net.fabricmc.api.ModInitializer;

import com.twixy.mod.entity.ModEntities;
import com.twixy.mod.item.ModItems;
import com.twixy.mod.sound.ModSounds;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.passive.CatEntity;

public class TwixyMod implements ModInitializer {

    @Override
    public void onInitialize() {

        ModEntities.register();
        ModItems.register();
        ModSounds.register();

        FabricDefaultAttributeRegistry.register(
                ModEntities.TWIXY,
                CatEntity.createCatAttributes()
        );

        System.out.println("Twixy Mod Loaded!");
    }
}
