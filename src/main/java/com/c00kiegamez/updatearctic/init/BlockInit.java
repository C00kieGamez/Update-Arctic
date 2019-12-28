package com.c00kiegamez.updatearctic.init;

import java.util.ArrayList;
import java.util.List;

import com.c00kiegamez.updatearctic.objects.blocks.BlockCampfire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block CAMPFIRE = new BlockCampfire("campfire", Material.WOOD);
	
	
}
