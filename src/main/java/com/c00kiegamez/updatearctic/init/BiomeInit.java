package com.c00kiegamez.updatearctic.init;

import com.c00kiegamez.updatearctic.world.biomes.arcticplains.BiomeArcticPlains;
import com.c00kiegamez.updatearctic.world.biomes.arcticplains.BiomeGlacier;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.common.BiomeDictionary.Type;;

public class BiomeInit 
{
	public static final Biome ARCTIC_PLAINS = new BiomeArcticPlains();
	public static final Biome GLACIER = new BiomeGlacier();
	public static void registerBiomes()
	{
		initBiome(ARCTIC_PLAINS, "Arctic Plains", BiomeType.ICY, Type.COLD, Type.SNOWY);
		initBiome(GLACIER, "Glacier", BiomeType.ICY, Type.COLD, Type.SNOWY, Type.WET, Type.WATER);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType bType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(bType, new BiomeEntry(biome, 50));
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}

}
