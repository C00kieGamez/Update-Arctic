package com.c00kiegamez.updatearctic.util.handlers;

import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 

{
	public static SoundEvent ENTITY_SNOWSTALKER_AMBIENT, ENTITY_SNOWSTALKER_AMBIENT2, ENTITY_SNOWSTALKER_HURT, ENTITY_SNOWSTALKER_HURT2, ENTITY_SNOWSTALKER_DEATH;
	
	public static void registerSounds()
	{

		ENTITY_SNOWSTALKER_AMBIENT = registerSound("entity.Snowstalker.ambient");
		ENTITY_SNOWSTALKER_AMBIENT2 = registerSound("entity.Snowstalker.ambient2");
		ENTITY_SNOWSTALKER_HURT = registerSound("entity.Snowstalker.hurt");
		ENTITY_SNOWSTALKER_HURT2 = registerSound("entity.Snowstalker.hurt2");
		ENTITY_SNOWSTALKER_DEATH = registerSound("entity.Snowstalker.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}

