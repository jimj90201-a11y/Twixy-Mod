package com.twixy.mod.client;

import com.twixy.mod.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.CatEntityRenderer;

public class TwixyModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.TWIXY, CatEntityRenderer::new);

    }
}
