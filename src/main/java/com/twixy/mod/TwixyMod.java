package com.twixy.mod;

import net.fabricmc.api.ModInitializer;
import com.twixy.mod.entity.ModEntities;
import com.twixy.mod.item.ModItems;
import com.twixy.mod.sound.ModSounds;

public class TwixyMod implements ModInitializer {

    @Override
    public void onInitialize() {

        ModEntities.register();
        ModItems.register();
        ModSounds.register();

        System.out.println("Twixy Mod Loaded!");
    }
}
