package com.twixy.mod.client.renderer;

import com.twixy.mod.TwixyMod;
import com.twixy.mod.client.model.TwixyModel;
import com.twixy.mod.entity.custom.TwixyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TwixyRenderer extends MobEntityRenderer<TwixyEntity, TwixyModel> {

    public TwixyRenderer(EntityRendererFactory.Context context) {
        super(
                context,
                new TwixyModel(context.getPart(TwixyModel.LAYER_LOCATION)),
                0.5f
        );
    }

    @Override
    public Identifier getTexture(TwixyEntity entity) {
        return Identifier.of(TwixyMod.MOD_ID, "textures/entity/twixy.png");
    }
}
