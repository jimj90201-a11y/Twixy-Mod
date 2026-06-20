package com.twixy.mod.sound;

import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent TWIXY_MEOW = Registry.register(
        Registries.SOUND_EVENT,
        new Identifier("twixy-mod", "twixy_meow"),
        SoundEvent.of(new Identifier("twixy-mod", "twixy_meow"))
    );

    public static void register() {}
}
