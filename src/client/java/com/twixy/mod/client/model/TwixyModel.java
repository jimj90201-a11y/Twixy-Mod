// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
package com.twixy.mod.client.model;

import net.minecraft.client.render.entity.model.ModelLayerLocation;
import net.minecraft.util.Identifier;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class TwixyModel extends EntityModel<Twixyntity> {
	private final ModelPart body;
	private final ModelPart belly;
	private final ModelPart head;
	private final ModelPart backLegL;
	private final ModelPart backLegR;
	private final ModelPart frontLegL;
	private final ModelPart frontLegR;
	private final ModelPart Tail;
	public TwixyModel(ModelPart root) {
		this.body = root.getChild("body");
		this.belly = this.body.getChild("belly");
		this.head = this.body.getChild("head");
		this.backLegL = this.body.getChild("backLegL");
		this.backLegR = this.body.getChild("backLegR");
		this.frontLegL = this.body.getChild("frontLegL");
		this.frontLegR = this.body.getChild("frontLegR");
		this.Tail = root.getChild("Tail");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 17.0F, 1.0F));

		ModelPartData belly = body.addChild("belly", ModelPartBuilder.create().uv(15, -3).cuboid(-4.0F, -8.0F, -2.0F, 8.0F, 16.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, -1).cuboid(-1.5F, -3.0F, -4.0F, 5.0F, 5.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-0.5F, -1.0156F, -5.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -3.0F, -10.0F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(6, 9).cuboid(2.0F, -13.0F, -10.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 9).cuboid(-1.0F, -13.0F, -10.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 9.0F, 9.0F, 0.0436F, 0.0F, 0.0F));

		ModelPartData backLegL = body.addChild("backLegL", ModelPartBuilder.create().uv(7, 12).cuboid(-1.0F, -6.0F, -2.0F, 3.0F, 12.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(1.1F, 1.0F, 6.0F));

		ModelPartData backLegR = body.addChild("backLegR", ModelPartBuilder.create().uv(6, 12).cuboid(-2.0F, -6.0F, -2.0F, 3.0F, 12.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.1F, 1.0F, 6.0F));

		ModelPartData frontLegL = body.addChild("frontLegL", ModelPartBuilder.create().uv(38, -2).cuboid(-1.0F, -4.2F, -1.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.2F, -3.0F, -5.0F));

		ModelPartData frontLegR = body.addChild("frontLegR", ModelPartBuilder.create().uv(37, -2).cuboid(-3.0F, -4.2F, -1.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.2F, -3.0F, -5.0F));

		ModelPartData Tail = modelPartData.addChild("Tail", ModelPartBuilder.create().uv(-10, -10).cuboid(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 13.0F, 13.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}
	@Override
	public void setAngles(TwixyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		Tail.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	public static final ModelLayerLocation LAYER_LOCATION =
        new ModelLayerLocation(
                Identifier.of("twixy-mod", "twixy"),
                "main"
        );
}
