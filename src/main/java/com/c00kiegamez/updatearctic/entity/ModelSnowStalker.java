package com.c00kiegamez.updatearctic.entity;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSnowStalker extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer LeftFrontLeg;
	private final ModelRenderer LeftBackLeg;
	private final ModelRenderer RightFrontLeg;
	private final ModelRenderer RightBackLeg;
	private final ModelRenderer Tail;

	public ModelSnowStalker() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 10.0F, -21.0F);
		Head.cubeList.add(new ModelBox(Head, 34, 40, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 23, 40, -2.0F, 0.0F, -9.0F, 4, 2, 5, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -7.0F, -17.0F, -17.0F, 14, 10, 30, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, 0.0F, -20.0F, 6.0F, 0, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, 0.0F, -19.0F, 9.0F, 0, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 3, 0.0F, -20.0F, -5.0F, 0, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 0, 0.0F, -19.0F, -2.0F, 0, 2, 1, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 15, 11, 0.0F, -20.0F, -15.0F, 0, 3, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 4, 0, 0.0F, -19.0F, -12.0F, 0, 2, 1, 0.0F, false));

		LeftFrontLeg = new ModelRenderer(this);
		LeftFrontLeg.setRotationPoint(5.0F, 17.0F, -9.0F);
		LeftFrontLeg.cubeList.add(new ModelBox(LeftFrontLeg, 0, 14, -3.0F, 0.0F, -2.0F, 5, 7, 5, 0.0F, false));

		LeftBackLeg = new ModelRenderer(this);
		LeftBackLeg.setRotationPoint(5.0F, 17.0F, 9.0F);
		LeftBackLeg.cubeList.add(new ModelBox(LeftBackLeg, 49, 56, -3.0F, 0.0F, -2.0F, 5, 7, 5, 0.0F, false));

		RightFrontLeg = new ModelRenderer(this);
		RightFrontLeg.setRotationPoint(-5.0F, 17.0F, -8.0F);
		RightFrontLeg.cubeList.add(new ModelBox(RightFrontLeg, 29, 56, -2.0F, 0.0F, -3.0F, 5, 7, 5, 0.0F, false));

		RightBackLeg = new ModelRenderer(this);
		RightBackLeg.setRotationPoint(-5.0F, 17.0F, 10.0F);
		RightBackLeg.cubeList.add(new ModelBox(RightBackLeg, 0, 57, -2.0F, 0.0F, -3.0F, 5, 7, 5, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 0, 40, -3.0F, -13.0F, 13.0F, 6, 6, 11, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, -2.0F, -11.0F, 24.0F, 4, 4, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
		Body.render(f5);
		LeftFrontLeg.render(f5);
		LeftBackLeg.render(f5);
		RightFrontLeg.render(f5);
		RightBackLeg.render(f5);
		Tail.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	
	
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {

		this.LeftFrontLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f) * 0.6f * limbSwingAmount;
		this.LeftBackLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f) * 0.6f * limbSwingAmount;
		this.RightFrontLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f + (float)Math.PI) * 0.6f * limbSwingAmount;
		this.RightBackLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f + (float)Math.PI) * 0.6f * limbSwingAmount;
		this.Tail.rotateAngleY= MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 0.1f * limbSwingAmount;
		
		
		this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.Head.rotateAngleX = headPitch * 0.017453292F;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}