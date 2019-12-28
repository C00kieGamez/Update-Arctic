package com.c00kiegamez.updatearctic.entity;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMoose extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer Head;
	private final ModelRenderer UpperHead;
	private final ModelRenderer Snout;
	private final ModelRenderer Shovel2;
	private final ModelRenderer Shovel1;
	private final ModelRenderer FrontLeftLeg;
	private final ModelRenderer FrontRightLeg;
	private final ModelRenderer BackLeftLeg;
	private final ModelRenderer BackRightLeg;

	public ModelMoose() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -24.0F, -11.0F, 12, 10, 23, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 63, 15, -4.0F, -23.0F, 12.0F, 8, 7, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 5.0F, -10.0F);
		setRotationAngle(Head, -0.5236F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 33, -3.0F, -5.5F, -12.4019F, 6, 7, 12, 0.0F, false));

		UpperHead = new ModelRenderer(this);
		UpperHead.setRotationPoint(0.0F, 17.0F, -1.0F);
		setRotationAngle(UpperHead, 0.6109F, 0.0F, 0.0F);
		Head.addChild(UpperHead);
		UpperHead.cubeList.add(new ModelBox(UpperHead, 36, 36, -4.0F, -25.7385F, -3.0114F, 8, 7, 7, 0.0F, false));

		Snout = new ModelRenderer(this);
		Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Snout, 0.0175F, 0.0F, 0.0F);
		UpperHead.addChild(Snout);
		Snout.cubeList.add(new ModelBox(Snout, 0, 0, -2.0F, -25.1864F, -8.0164F, 4, 6, 6, 0.0F, false));
		Snout.cubeList.add(new ModelBox(Snout, 0, 12, -1.0F, -23.1864F, -10.0164F, 2, 4, 2, 0.0F, false));

		Shovel2 = new ModelRenderer(this);
		Shovel2.setRotationPoint(0.0F, 2.0F, 0.0F);
		UpperHead.addChild(Shovel2);
		Shovel2.cubeList.add(new ModelBox(Shovel2, 24, 40, -7.0F, -27.7385F, 0.9886F, 3, 1, 2, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 63, 9, -9.0F, -28.7385F, -0.0114F, 3, 1, 4, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 16, 58, -11.0F, -29.7385F, -1.0114F, 3, 1, 6, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 47, 0, -13.0F, -30.7385F, -2.0114F, 3, 1, 8, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 18, 18, -11.0F, -31.7385F, -2.0114F, 1, 1, 1, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 18, 0, -13.0F, -32.7385F, -2.0114F, 1, 2, 1, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 14, 17, -13.0F, -32.7385F, -0.0114F, 1, 2, 1, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 14, 3, -13.0F, -32.7385F, 2.9886F, 1, 2, 1, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 4, 18, -11.0F, -31.7385F, 4.9886F, 1, 1, 1, 0.0F, false));
		Shovel2.cubeList.add(new ModelBox(Shovel2, 17, 12, -13.0F, -32.7385F, 4.9886F, 1, 2, 1, 0.0F, false));

		Shovel1 = new ModelRenderer(this);
		Shovel1.setRotationPoint(8.0F, -31.0F, -20.0F);
		setRotationAngle(Shovel1, 0.0F, 3.1416F, 0.0F);
		UpperHead.addChild(Shovel1);
		Shovel1.cubeList.add(new ModelBox(Shovel1, 14, 0, -5.0F, 0.2615F, -18.9886F, 1, 2, 1, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 36, 33, 1.0F, 5.2615F, -22.9886F, 3, 1, 2, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 16, 52, -1.0F, 4.2615F, -23.9886F, 3, 1, 4, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 24, 33, -3.0F, 3.2615F, -24.9886F, 3, 1, 6, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 0, 12, -5.0F, 2.2615F, -25.9886F, 3, 1, 8, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 0, 18, -3.0F, 1.2615F, -25.9886F, 1, 1, 1, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 14, 14, -5.0F, 0.2615F, -25.9886F, 1, 2, 1, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 0, 3, -5.0F, 0.2615F, -23.9886F, 1, 2, 1, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 0, 0, -5.0F, 0.2615F, -20.9886F, 1, 2, 1, 0.0F, false));
		Shovel1.cubeList.add(new ModelBox(Shovel1, 17, 16, -3.0F, 1.2615F, -18.9886F, 1, 1, 1, 0.0F, false));

		FrontLeftLeg = new ModelRenderer(this);
		FrontLeftLeg.setRotationPoint(5.0F, 8.0F, -8.0F);
		FrontLeftLeg.cubeList.add(new ModelBox(FrontLeftLeg, 61, 0, -2.0F, 13.0F, -2.0F, 4, 3, 4, 0.0F, false));
		FrontLeftLeg.cubeList.add(new ModelBox(FrontLeftLeg, 40, 64, -1.0F, 5.0F, -1.0F, 2, 8, 2, 0.0F, false));
		FrontLeftLeg.cubeList.add(new ModelBox(FrontLeftLeg, 48, 50, -2.0F, -5.0F, -2.0F, 4, 10, 4, 0.0F, false));

		FrontRightLeg = new ModelRenderer(this);
		FrontRightLeg.setRotationPoint(-5.0F, 8.0F, -8.0F);
		FrontRightLeg.cubeList.add(new ModelBox(FrontRightLeg, 59, 33, -2.0F, 13.0F, -2.0F, 4, 3, 4, 0.0F, false));
		FrontRightLeg.cubeList.add(new ModelBox(FrontRightLeg, 32, 50, -2.0F, -5.0F, -2.0F, 4, 10, 4, 0.0F, false));
		FrontRightLeg.cubeList.add(new ModelBox(FrontRightLeg, 32, 64, -1.0F, 5.0F, -1.0F, 2, 8, 2, 0.0F, false));

		BackLeftLeg = new ModelRenderer(this);
		BackLeftLeg.setRotationPoint(5.0F, 8.0F, 9.0F);
		BackLeftLeg.cubeList.add(new ModelBox(BackLeftLeg, 62, 46, -2.0F, 13.0F, -2.0F, 4, 3, 4, 0.0F, false));
		BackLeftLeg.cubeList.add(new ModelBox(BackLeftLeg, 48, 64, -1.0F, 5.0F, -1.0F, 2, 8, 2, 0.0F, false));
		BackLeftLeg.cubeList.add(new ModelBox(BackLeftLeg, 0, 52, -2.0F, -5.0F, -2.0F, 4, 10, 4, 0.0F, false));

		BackRightLeg = new ModelRenderer(this);
		BackRightLeg.setRotationPoint(-6.0F, 8.0F, 9.0F);
		BackRightLeg.cubeList.add(new ModelBox(BackRightLeg, 60, 60, -1.0F, 13.0F, -2.0F, 4, 3, 4, 0.0F, false));
		BackRightLeg.cubeList.add(new ModelBox(BackRightLeg, 0, 33, 0.0F, 5.0F, -1.0F, 2, 8, 2, 0.0F, false));
		BackRightLeg.cubeList.add(new ModelBox(BackRightLeg, 47, 9, -1.0F, -5.0F, -2.0F, 4, 10, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
		Head.render(f5);
		FrontLeftLeg.render(f5);
		FrontRightLeg.render(f5);
		BackLeftLeg.render(f5);
		BackRightLeg.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {

		this.FrontLeftLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f) * 0.6f * limbSwingAmount;
		this.BackLeftLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f) * 0.6f * limbSwingAmount;
		this.FrontRightLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f + (float)Math.PI) * 0.6f * limbSwingAmount;
		this.BackRightLeg.rotateAngleX= MathHelper.cos(limbSwing * 0.5662f + (float)Math.PI) * 0.6f * limbSwingAmount;
		
		
		this.Head.rotateAngleX = headPitch * 0.017453292F;
		
	}
}