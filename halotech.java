package com.TehHaloTree.halotechmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

import com.TehHaloTree.halotechmod.blocks.AdvancedPlateBender;
import com.TehHaloTree.halotechmod.blocks.CitrineOre;
import com.TehHaloTree.halotechmod.blocks.DarkOre;
import com.TehHaloTree.halotechmod.blocks.Element115Ore;
import com.TehHaloTree.halotechmod.blocks.EridiumOre;
import com.TehHaloTree.halotechmod.blocks.FluoriteOre;
import com.TehHaloTree.halotechmod.blocks.FluxOre;
import com.TehHaloTree.halotechmod.blocks.MysteriousOre;
import com.TehHaloTree.halotechmod.blocks.RadiumOre;
import com.TehHaloTree.halotechmod.items.CitrineDust;
import com.TehHaloTree.halotechmod.items.DarkDust;
import com.TehHaloTree.halotechmod.items.Element115Dust;
import com.TehHaloTree.halotechmod.items.EridiumDust;
import com.TehHaloTree.halotechmod.items.FluoriteDust;
import com.TehHaloTree.halotechmod.items.FluxDust;
import com.TehHaloTree.halotechmod.items.MysteriousDust;
import com.TehHaloTree.halotechmod.items.RadiumDust;
import com.TehHaloTree.halotechmod.lib.References;
import com.TehHaloTree.halotechmod.proxy.ProxyCommon;
import com.TehHaloTree.halotechmod.tile.TileEntityAdvancedPlateBender;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)

public class halotech {
	
	@Instance(References.MODID)
	public static halotech modInstance;
	
	@EventHandler
	public void prinit(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().refreshResources();
		
		
	}
	
	@SidedProxy(clientSide = "com.TehHaloTree.halotechmod.proxy.ProxyClient", serverSide = "com.TehHaloTree.halotechmod.proxy.ProxyCommon")
	public static ProxyCommon proxy;
	
	public static final String modid = "HaloTech";
	
	//WorldGeneration

	//Blocks
		//World Generation
	public static Block EridiumOre;
	public static Block CitrineOre;
	public static Block RadiumOre;
	public static Block FluoriteOre;
	public static Block FluxOre;
	public static Block DarkOre;
	public static Block Element115Ore;
	public static Block MysteriousOre;
		//Machines
	public static Block AdvancedPlateBender;

	
	//Items
		//Dusts
	public static Item EridiumDust;
	public static Item CitrineDust;
	public static Item RadiumDust;
	public static Item FluoriteDust;
	public static Item FluxDust;
	public static Item DarkDust;
	public static Item Element115Dust;
	public static Item MysteriousDust;

	
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.RenderInformation();
	
		//Block Registry
			//World Generation
		EridiumOre = new EridiumOre(500, Material.rock).setUnlocalizedName("EridiumOre");
		GameRegistry.registerBlock(EridiumOre, modid+EridiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumOre, "Eridium Ore");
		CitrineOre = new CitrineOre(501, Material.rock).setUnlocalizedName("CitrineOre");
		GameRegistry.registerBlock(CitrineOre, modid+CitrineOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineOre, "Citrine Ore");
		RadiumOre = new RadiumOre(502, Material.rock).setUnlocalizedName("RadiumOre");
		GameRegistry.registerBlock(RadiumOre, modid+RadiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumOre, "Radium Ore");
		FluoriteOre = new FluoriteOre(503, Material.rock).setUnlocalizedName("FluoriteOre");
		GameRegistry.registerBlock(FluoriteOre, modid+FluoriteOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteOre,  "FluoriteOre");
		FluxOre = new FluxOre(504, Material.rock).setUnlocalizedName("FluxOre");
		GameRegistry.registerBlock(FluxOre, modid+FluxOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxOre, "Flux Ore");
		DarkOre = new DarkOre(505, Material.rock).setUnlocalizedName("DarkOre");
		GameRegistry.registerBlock(DarkOre,  modid+DarkOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkOre, "Dark Ore");
		MysteriousOre = new MysteriousOre(506, Material.rock).setUnlocalizedName("MysteriousOre");
		GameRegistry.registerBlock(MysteriousOre, modid+MysteriousOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousOre, "Mysterious Ore");
		Element115Ore = new Element115Ore(507, Material.rock).setUnlocalizedName("Element115Ore");
		GameRegistry.registerBlock(Element115Ore, modid+Element115Ore.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Ore, "Element 115 Ore");
		
		//Machine Registry
		AdvancedPlateBender = new AdvancedPlateBender(508, Material.iron).setUnlocalizedName("AdvancedPlateBender");
		GameRegistry.registerBlock(AdvancedPlateBender, modid+AdvancedPlateBender.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(AdvancedPlateBender, "Advanced Plate Bender");
		
		//Item Registry
			//Dusts
		EridiumDust = new EridiumDust(5000).setUnlocalizedName("EridiumDust");
		GameRegistry.registerItem(EridiumDust, modid+EridiumDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumDust, "Eridium Dust");
		CitrineDust = new CitrineDust(5001).setUnlocalizedName("CitrineDust");
		GameRegistry.registerItem(CitrineDust, modid+CitrineDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineDust, "Citrine Dust");
		RadiumDust = new RadiumDust(5002).setUnlocalizedName("RadiumDust");
		GameRegistry.registerItem(RadiumDust, modid+RadiumDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumDust, "Radium Dust");
		FluoriteDust = new FluoriteDust(5003).setUnlocalizedName("FluoriteDust");
		GameRegistry.registerItem(FluoriteDust, modid+FluoriteDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteDust, "Fluorite Dust");
		Element115Dust = new Element115Dust(5004).setUnlocalizedName("Element115Dust");
		GameRegistry.registerItem(Element115Dust, modid+Element115Dust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Dust, "Element115 Dust");
		MysteriousDust = new MysteriousDust(5005).setUnlocalizedName("MysteriousDust");
		GameRegistry.registerItem(MysteriousDust, modid+MysteriousDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousDust, "Mysterious Dust");
		DarkDust = new DarkDust(5006).setUnlocalizedName("DarkDust");
		GameRegistry.registerItem(DarkDust, modid+DarkDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkDust, "Dark Dust");
		FluxDust = new FluxDust(5007).setUnlocalizedName("FluxDust");
		GameRegistry.registerItem(FluxDust, modid+FluxDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxDust, "Flux Dust");
		
		//Tile Entities
		GameRegistry.registerTileEntity(TileEntityAdvancedPlateBender.class, "AdvancedPlateBenderTileEntity");

		
	}
}