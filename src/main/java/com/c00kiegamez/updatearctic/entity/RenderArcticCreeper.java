package com.c00kiegamez.updatearctic.entity;

import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArcticCreeper extends RenderLiving<EntityArcticCreeper>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/arcticcreepertexture.png");
	
	public RenderArcticCreeper(RenderManager manager) {
		super(manager, new ModelArcticCreeper(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityArcticCreeper entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityArcticCreeper entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
