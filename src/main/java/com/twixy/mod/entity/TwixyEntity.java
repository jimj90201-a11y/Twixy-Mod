package com.twixy.mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;
import com.twixy.mod.sound.ModSounds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

import com.twixy.mod.entity.ModEntities;
import com.twixy.mod.client.renderer.TwixyRenderer;
import com.twixy.mod.client.model.TwixyModel;

public class TwixyEntity extends CatEntity {

    public TwixyEntity(EntityType<? extends CatEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.TWIXY_MEOW;
    }
}
