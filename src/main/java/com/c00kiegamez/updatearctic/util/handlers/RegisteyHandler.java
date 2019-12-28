package com.c00kiegamez.updatearctic.util.handlers;

import com.c00kiegamez.updatearctic.Main;
import com.c00kiegamez.updatearctic.init.BiomeInit;
import com.c00kiegamez.updatearctic.init.BlockInit;
import com.c00kiegamez.updatearctic.init.EntityInit;
import com.c00kiegamez.updatearctic.init.ItemInit;
import com.c00kiegamez.updatearctic.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegisteyHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	
	
	@SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegister(ModelRegistryEvent event)
    {
 
        for(Item item : ItemInit.ITEMS)
        {
            Main.proxy.registerItemRenderer(item, 0, "inventory");
        }
       
        for(Block block : BlockInit.BLOCKS)
        {
            Main.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	

	
	public static void preInitRegistries()
	{
		
		BiomeInit.registerBiomes();
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
	
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
		
	}
	
	public static void postInitRegistries() 
	{
		
	}
}
