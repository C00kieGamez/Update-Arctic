package com.c00kiegamez.updatearctic.init;

import com.c00kiegamez.updatearctic.Main;
import com.c00kiegamez.updatearctic.entity.EntityArcticCreeper;
import com.c00kiegamez.updatearctic.entity.EntityArcticSpider;
import com.c00kiegamez.updatearctic.entity.EntityMoose;
import com.c00kiegamez.updatearctic.entity.EntitySnowStalker;
import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("snowstalker", EntitySnowStalker.class, Reference.ENTITY_SNOWSTALKER, 30, 16777215, 000000);
		registerEntity("arcticspider", EntityArcticSpider.class, Reference.ENTITY_ARCTICSPIDER, 30, 16777215, 000000);
		registerEntity("arcticcreeper", EntityArcticCreeper.class, Reference.ENTITY_ARCTICCREEPER, 30, 16777215, 000000);
		registerEntity("moose", EntityMoose.class, Reference.ENTITY_MOOSE, 30, 5454902, 6637352);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
