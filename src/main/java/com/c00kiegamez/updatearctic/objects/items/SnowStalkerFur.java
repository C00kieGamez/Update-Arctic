package com.c00kiegamez.updatearctic.objects.items;

import com.c00kiegamez.updatearctic.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SnowStalkerFur extends Item{

	public SnowStalkerFur(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
}
