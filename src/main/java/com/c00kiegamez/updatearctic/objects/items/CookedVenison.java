package com.c00kiegamez.updatearctic.objects.items;

import com.c00kiegamez.updatearctic.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CookedVenison extends ItemFood{

	
	
	public CookedVenison(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ItemInit.ITEMS.add(this);
	}
}
