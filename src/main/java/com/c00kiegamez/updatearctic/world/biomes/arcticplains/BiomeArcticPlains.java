package com.c00kiegamez.updatearctic.world.biomes.arcticplains;

import java.util.Random;

import com.c00kiegamez.updatearctic.entity.EntityArcticCreeper;
import com.c00kiegamez.updatearctic.entity.EntityArcticSpider;
import com.c00kiegamez.updatearctic.entity.EntitySnowStalker;

import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeArcticPlains extends Biome
{

	public BiomeArcticPlains() {
		super(new BiomeProperties("Arctic Plains").setSnowEnabled().setBaseHeight(0.1f).setTemperature(-5.0f).setHeightVariation(0.1f));
		decorator = new BiomeDecoratorArcticPlains();
		this.topBlock = Blocks.SNOW.getDefaultState();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 100, 2, 3));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPolarBear.class, 100, 2, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 100, 2, 8));
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySnowStalker.class, 100, 2, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityArcticSpider.class, 300, 1, 1));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityArcticCreeper.class, 300, 1, 1));
		Random rand = new Random();
	}
	
	
	

}
