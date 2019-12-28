package com.c00kiegamez.updatearctic.world.biomes.arcticplains;

import java.util.Random;

import com.c00kiegamez.updatearctic.entity.EntityArcticSpider;
import com.c00kiegamez.updatearctic.entity.EntitySnowStalker;

import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeGlacier extends Biome
{

	public BiomeGlacier() {
		super(new BiomeProperties("Glacier").setSnowEnabled().setBaseHeight(0.3f).setTemperature(-7.0f).setHeightVariation(0.2f));
		decorator = new BiomeDecoratorGlacier();
		this.topBlock = Blocks.ICE.getDefaultState();
		this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPolarBear.class, 100, 2, 5));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityArcticSpider.class, 100, 1, 3));
		//this.spawnableCreatureList.add(new SpawnListEntry(PingWing.class, 100, 2, 4));
	}
	

}
