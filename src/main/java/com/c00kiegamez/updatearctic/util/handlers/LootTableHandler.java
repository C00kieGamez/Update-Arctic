package com.c00kiegamez.updatearctic.util.handlers;

import com.c00kiegamez.updatearctic.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {
	
	public static final ResourceLocation SNOWSTALKER = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "snowstalker"));
	public static final ResourceLocation MOOSE = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "moose"));

}
