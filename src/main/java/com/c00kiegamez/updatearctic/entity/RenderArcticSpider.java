package com.c00kiegamez.updatearctic.entity;

import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArcticSpider extends RenderLiving<EntityArcticSpider>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/arcticspidertexture.png");
	
	public RenderArcticSpider(RenderManager manager) {
		super(manager, new ModelArcticSpider(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityArcticSpider entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityArcticSpider entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
