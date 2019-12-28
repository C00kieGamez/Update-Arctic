package com.c00kiegamez.updatearctic.entity;

import com.c00kiegamez.updatearctic.util.handlers.LootTableHandler;
import com.c00kiegamez.updatearctic.util.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import scala.util.Random;

public class EntitySnowStalker extends EntityCow{

	public EntitySnowStalker(World worldIn) {
		super(worldIn);
		this.setSize(1.3F, 1.4F);
	}
	
	@Override
	protected void initEntityAI() {
		 	this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
	        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(7, new EntityAILookIdle(this));
		
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
	}
	
	@Override
	public float getEyeHeight() {
		return 1.3F;
	}
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) {
		
		return new EntitySnowStalker(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		SoundEvent[] choices = {
    		    SoundsHandler.ENTITY_SNOWSTALKER_AMBIENT,
    		    SoundsHandler.ENTITY_SNOWSTALKER_AMBIENT2
    		};
    		return choices[new Random().nextInt(choices.length)];
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		SoundEvent[] choices = {
    		    SoundsHandler.ENTITY_SNOWSTALKER_HURT,
    		    SoundsHandler.ENTITY_SNOWSTALKER_HURT2
    		};
    		return choices[new Random().nextInt(choices.length)];
	}
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_SNOWSTALKER_DEATH;
	}

	@Override
	protected ResourceLocation getLootTable() {

		return LootTableHandler.SNOWSTALKER;
	}
}
