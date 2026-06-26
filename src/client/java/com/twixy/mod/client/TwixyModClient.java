package com.twixy.mod.client;

import net.fabricmc.api.ClientModInitializer;

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
