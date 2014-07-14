package com.TehHaloTree.halotechmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
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
import com.TehHaloTree.halotechmod.items.CitrineIngot;
import com.TehHaloTree.halotechmod.items.DarkDust;
import com.TehHaloTree.halotechmod.items.DarkIngot;
import com.TehHaloTree.halotechmod.items.Element115Dust;
import com.TehHaloTree.halotechmod.items.Element115Ingot;
import com.TehHaloTree.halotechmod.items.EridiumDust;
import com.TehHaloTree.halotechmod.items.EridiumIngot;
import com.TehHaloTree.halotechmod.items.FluoriteDust;
import com.TehHaloTree.halotechmod.items.FluoriteIngot;
import com.TehHaloTree.halotechmod.items.FluxDust;
import com.TehHaloTree.halotechmod.items.FluxIngot;
import com.TehHaloTree.halotechmod.items.MysteriousDust;
import com.TehHaloTree.halotechmod.items.MysteriousIngot;
import com.TehHaloTree.halotechmod.items.RadiumDust;
import com.TehHaloTree.halotechmod.items.RadiumIngot;
import com.TehHaloTree.halotechmod.lib.References;
import com.TehHaloTree.halotechmod.proxy.ProxyCommon;
import com.TehHaloTree.halotechmod.tile.TileEntityAdvancedPlateBender;
import com.TehHaloTree.halotechmod.worldgeneration.EventManager;

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
	EventManager eventmanager = new EventManager();

	//Blocks
		//Ore
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
		//Ingots
	public static Item EridiumIngot;
	public static Item CitrineIngot;
	public static Item RadiumIngot;
	public static Item FluoriteIngot;
	public static Item FluxIngot;
	public static Item DarkIngot;
	public static Item Element115Ingot;
	public static Item MysteriousIngot;
	
	//CreativeTabs
	 public static CreativeTabs HaloTechCreativeTab = new CreativeTab(CreativeTabs.getNextID(), "HaloTech");

	
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.RenderInformation();
		
		//World Generator
		GameRegistry.registerWorldGenerator(eventmanager);
	
		//Block Registry
			//Ore~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
		
		//Machine Registry~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		AdvancedPlateBender = new AdvancedPlateBender(508, Material.iron).setUnlocalizedName("AdvancedPlateBender");
		GameRegistry.registerBlock(AdvancedPlateBender, modid+AdvancedPlateBender.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(AdvancedPlateBender, "Advanced Plate Bender");
		
		//Item Registry
			//Dusts~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
		LanguageRegistry.addName(Element115Dust, "Element 115 Dust");
		MysteriousDust = new MysteriousDust(5005).setUnlocalizedName("MysteriousDust");
		GameRegistry.registerItem(MysteriousDust, modid+MysteriousDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousDust, "Mysterious Dust");
		DarkDust = new DarkDust(5006).setUnlocalizedName("DarkDust");
		GameRegistry.registerItem(DarkDust, modid+DarkDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkDust, "Dark Dust");
		FluxDust = new FluxDust(5007).setUnlocalizedName("FluxDust");
		GameRegistry.registerItem(FluxDust, modid+FluxDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxDust, "Flux Dust");
			//Ingots~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		FluxIngot = new FluxIngot(5008).setUnlocalizedName("FluxIngot");
		GameRegistry.registerItem(FluxIngot, modid+FluxIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxIngot, "Flux Ingot");
		CitrineIngot = new CitrineIngot(5009).setUnlocalizedName("CitrineIngot");
		GameRegistry.registerItem(CitrineIngot, modid+CitrineIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineIngot, "Citrine Ingot");
		RadiumIngot = new RadiumIngot(5010).setUnlocalizedName("RadiumIngot");
		GameRegistry.registerItem(RadiumIngot, modid+RadiumIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumIngot, "Radium Ingot");
		FluoriteIngot = new FluoriteIngot(5011).setUnlocalizedName("FluoriteIngot");
		GameRegistry.registerItem(FluoriteIngot, modid+FluoriteIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteIngot, "Fluorite Ingot");
		Element115Ingot = new Element115Ingot(5012).setUnlocalizedName("Element115Ingot");
		GameRegistry.registerItem(Element115Ingot, modid+Element115Ingot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Ingot, "Element 115 Ingot");
		MysteriousIngot = new MysteriousIngot(5013).setUnlocalizedName("MysteriousIngot");
		GameRegistry.registerItem(MysteriousIngot, modid+MysteriousIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousIngot, "Mysterious Ingot");
		DarkIngot = new DarkIngot(5014).setUnlocalizedName("DarkIngot");
		GameRegistry.registerItem(DarkIngot, modid+DarkIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkIngot, "Dark Ingot");
		EridiumIngot = new EridiumIngot(5015).setUnlocalizedName("EridiumIngot");
		GameRegistry.registerItem(EridiumIngot, modid+EridiumIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumIngot, "Eridium Ingot");
		
		//Tile Entities~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		GameRegistry.registerTileEntity(TileEntityAdvancedPlateBender.class, "AdvancedPlateBenderTileEntity");

		
	}
}