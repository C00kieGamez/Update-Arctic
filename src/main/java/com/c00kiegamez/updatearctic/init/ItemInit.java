package com.c00kiegamez.updatearctic.init;

import java.util.ArrayList;
import java.util.List;

import com.c00kiegamez.updatearctic.objects.items.SnowStalkerFur;
import com.c00kiegamez.updatearctic.objects.items.armor.ArmorBase;
import com.c00kiegamez.updatearctic.util.Reference;
import com.c00kiegamez.updatearctic.objects.items.ResearchNotes;
import com.c00kiegamez.updatearctic.objects.items.ResearchNotes2;
import com.c00kiegamez.updatearctic.objects.items.RawVenison;
import com.c00kiegamez.updatearctic.objects.items.CookedVenison;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial ARMOR_MATERIAL_SNOWSTALKERFUR = EnumHelper.addArmorMaterial("armor_material_snowstalkerfur", Reference.MOD_ID + ":snowstalkerfur", 12, new int[] {1, 2, 3, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	
	public static final Item SnowStalkerFur = new SnowStalkerFur("snowstalkerfur");
	//public static final Item ResearchNotes = new ResearchNotes("researchnotes");
	//public static final Item ResearchNotes2 = new ResearchNotes2("researchnotes2");
	public static final Item RawVenison = new RawVenison("rawvenison", 2, 1f, true);
	public static final Item CookedVenison = new CookedVenison("cookedvenison", 9, 4f, true);
	
	
	
	
	public static final Item SnowStalkerFur_Helmet = new ArmorBase("snowstalkerfurhelmet", ARMOR_MATERIAL_SNOWSTALKERFUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item SnowStalkerFur_Chestplate = new ArmorBase("snowstalkerfurchestplate", ARMOR_MATERIAL_SNOWSTALKERFUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item SnowStalkerFur_Leggings = new ArmorBase("snowstalkerfurleggings", ARMOR_MATERIAL_SNOWSTALKERFUR, 2, EntityEquipmentSlot.LEGS);
	
	
	
}
