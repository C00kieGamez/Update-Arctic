package com.c00kiegamez.updatearctic.entity;

import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMoose extends RenderLiving<EntityMoose>
{

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/moosetexture.png");
	
	public RenderMoose(RenderManager manager) {
		super(manager, new ModelMoose(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityMoose entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityMoose entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
