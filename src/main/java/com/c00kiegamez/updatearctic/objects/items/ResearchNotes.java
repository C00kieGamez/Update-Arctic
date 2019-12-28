package com.c00kiegamez.updatearctic.objects.items;

import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.c00kiegamez.updatearctic.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ResearchNotes extends Item{

	public ResearchNotes(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ItemInit.ITEMS.add(this);
	}
	
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
        	tooltip.add("Snow Stalker Notes");
        	tooltip.add("Seems to be a passive creature, Very strong and is-");
        	
        }
        else
        {
            tooltip.add("The Top Of Some Old Ripped Research Notes, Hold " + "\u00A7e" + "Shift" + "\u00A77" + " To Read Them"); //"\u00A7e" is a color code
        }
    }
	
}
