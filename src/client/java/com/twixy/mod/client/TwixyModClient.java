package com.twixy.mod.client;

import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

import com.twixy.mod.entity.ModEntities;
import com.twixy.mod.client.model.TwixyModel;
import com.twixy.mod.client.renderer.TwixyRenderer;

public class TwixyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TWIXY, TwixyRenderer::new);
EntityModelLayerRegistry.registerModelLayer(
    TwixyModel.LAYER_LOCATION,
    TwixyModel::getTexturedModelData
);
    }
}
