package com.c00kiegamez.updatearctic.util.handlers;

import com.c00kiegamez.updatearctic.entity.EntityArcticCreeper;
import com.c00kiegamez.updatearctic.entity.EntityArcticSpider;
import com.c00kiegamez.updatearctic.entity.EntityMoose;
import com.c00kiegamez.updatearctic.entity.EntitySnowStalker;
import com.c00kiegamez.updatearctic.entity.RenderArcticCreeper;
import com.c00kiegamez.updatearctic.entity.RenderArcticSpider;
import com.c00kiegamez.updatearctic.entity.RenderMoose;
import com.c00kiegamez.updatearctic.entity.RenderSnowStalker;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySnowStalker.class, new IRenderFactory<EntitySnowStalker>() 
		{
			@Override
			public Render<? super EntitySnowStalker> createRenderFor (RenderManager manager)
			{
				return new RenderSnowStalker(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityArcticSpider.class, new IRenderFactory<EntityArcticSpider>() 
		{
			@Override
			public Render<? super EntityArcticSpider> createRenderFor (RenderManager manager)
			{
				return new RenderArcticSpider(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityArcticCreeper.class, new IRenderFactory<EntityArcticCreeper>() 
		{
			@Override
			public Render<? super EntityArcticCreeper> createRenderFor (RenderManager manager)
			{
				return new RenderArcticCreeper(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMoose.class, new IRenderFactory<EntityMoose>() 
		{
			@Override
			public Render<? super EntityMoose> createRenderFor (RenderManager manager)
			{
				return new RenderMoose(manager);
			}
		});
		
	}

}
