package com.c00kiegamez.updatearctic.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeInit {
	
	public static void init() {
		GameRegistry.addSmelting(ItemInit.RawVenison, new ItemStack(ItemInit.CookedVenison, 1), 0.1f);
	}

}
