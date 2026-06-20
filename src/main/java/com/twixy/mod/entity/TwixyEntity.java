package com.twixy.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class TwixyEntity extends CatEntity {

    public TwixyEntity(EntityType<? extends CatEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.TWIXY_MEOW;
    }
}
