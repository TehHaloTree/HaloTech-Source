package com.TehHaloTree.halotechmod;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.enums.GT_Items;
import ic2.api.item.Items;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.Recipes;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;

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
	
	//CreativeTabs
	public static CreativeTabs HaloTechCreativeTab = new CreativeTab(CreativeTabs.getNextID(), "HaloTech Mod");
	
	//WorldGeneration
	EventManager eventmanager = new EventManager();
	
	//Recipes

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
	
	public static int EridiumOreID;
	public static int CitrineOreID;
	public static int RadiumOreID;
	public static int FluoriteOreID;
	public static int FluxOreID;
	public static int DarkOreID;
	public static int Element115OreID;
	public static int MysteriousOreID;
		//Machines
	public static Block AdvancedPlateBender;
	
	public static int AdvancedPlateBenderID;

	
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
	
	public static int EridiumDustID;
	public static int CitrineDustID;
	public static int RadiumDustID;
	public static int FluoriteDustID;
	public static int FluxDustID;
	public static int DarkDustID;
	public static int Element115DustID;
	public static int MysteriousDustID;
		//Ingots
	public static Item EridiumIngot;
	public static Item CitrineIngot;
	public static Item RadiumIngot;
	public static Item FluoriteIngot;
	public static Item FluxIngot;
	public static Item DarkIngot;
	public static Item Element115Ingot;
	public static Item MysteriousIngot;
	
	public static int EridiumIngotID;
	public static int CitrineIngotID;
	public static int RadiumIngotID;
	public static int FluoriteIngotID;
	public static int FluxIngotID;
	public static int DarkIngotID;
	public static int Element115IngotID;
	public static int MysteriousIngotID;

	
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		//Configuration
		Configuration config = new Configuration(new File("config/HaloTech.cfg"));
		
		//World Generator
		GameRegistry.registerWorldGenerator(eventmanager);
		
		config.load();
		//Blocks
		EridiumOreID = config.get("Blocks", "Eridium Ore", 500).getInt();
		CitrineOreID = config.get("Blocks", "Citrine Ore", 501).getInt();
		RadiumOreID = config.get("Blocks", "Radium Ore", 502).getInt();
		FluoriteOreID = config.get("Blocks", "Fluorite Ore", 503).getInt();
		FluxOreID = config.get("Blocks", "Flux Ore", 504).getInt();
		DarkOreID = config.get("Blocks", "Dark Ore", 505).getInt();
		Element115OreID = config.get("Blocks", "Element 115 Ore", 506).getInt();
		MysteriousOreID = config.get("Blocks", "Mysterious Ore", 507).getInt();
		
		//Machines
		AdvancedPlateBenderID = config.get("Machines", "Advanced Plate Bender", 508).getInt();
		
		//Items
		EridiumDustID = config.get("Dusts", "Eridium Dust", 5000).getInt();
		CitrineDustID = config.get("Dusts", "Citrine Dust", 5001).getInt();
		RadiumDustID = config.get("Dusts", "Radium Dust", 5002).getInt();
		FluoriteDustID = config.get("Dusts", "Fluorite Dust", 5003).getInt();
		FluxDustID = config.get("Dusts", "Flux Dust", 5004).getInt();
		DarkDustID = config.get("Dusts", "Dark Dust", 5005).getInt();
		Element115DustID = config.get("Dusts", "Element 115 Dust", 5006).getInt();
		MysteriousDustID = config.get("Dusts", "Mysterious Dust", 5007).getInt();
		
		EridiumIngotID = config.get("Ingots", "Eridium Ingot", 5008).getInt();
		CitrineIngotID = config.get("Ingots", "Citrine Ingot", 5009).getInt();
		RadiumIngotID = config.get("Ingots", "Radium Ingot", 5010).getInt();
		FluoriteIngotID = config.get("Ingots", "Fluorite Ingot", 5011).getInt();
		FluxIngotID = config.get("Ingots", "Flux Ingot", 5012).getInt();
		DarkIngotID = config.get("Ingots", "Dark Ingot", 5013).getInt();
		Element115IngotID = config.get("Ingots", "Element 115 Ingot", 5014).getInt();
		MysteriousIngotID = config.get("Ingots", "Mysterious Ingot", 5015).getInt();
		
		config.save();
		
		proxy.RenderInformation();
	
		//Block Registry
			//World Generation
				//Ore~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		EridiumOre = new EridiumOre(EridiumOreID, Material.rock).setUnlocalizedName("EridiumOre");
		GameRegistry.registerBlock(EridiumOre, modid+EridiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumOre, "Eridium Ore");
		
		CitrineOre = new CitrineOre(CitrineOreID, Material.rock).setUnlocalizedName("CitrineOre");
		GameRegistry.registerBlock(CitrineOre, modid+CitrineOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineOre, "Citrine Ore");
		
		RadiumOre = new RadiumOre(RadiumOreID, Material.rock).setUnlocalizedName("RadiumOre");
		GameRegistry.registerBlock(RadiumOre, modid+RadiumOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumOre, "Radium Ore");
		
		FluoriteOre = new FluoriteOre(FluoriteOreID, Material.rock).setUnlocalizedName("FluoriteOre");
		GameRegistry.registerBlock(FluoriteOre, modid+FluoriteOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteOre,  "FluoriteOre");
		
		FluxOre = new FluxOre(FluxOreID, Material.rock).setUnlocalizedName("FluxOre");
		GameRegistry.registerBlock(FluxOre, modid+FluxOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxOre, "Flux Ore");
		
		DarkOre = new DarkOre(DarkOreID, Material.rock).setUnlocalizedName("DarkOre");
		GameRegistry.registerBlock(DarkOre,  modid+DarkOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkOre, "Dark Ore");
		
		MysteriousOre = new MysteriousOre(MysteriousOreID, Material.rock).setUnlocalizedName("MysteriousOre");
		GameRegistry.registerBlock(MysteriousOre, modid+MysteriousOre.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousOre, "Mysterious Ore");
		
		Element115Ore = new Element115Ore(Element115OreID, Material.rock).setUnlocalizedName("Element115Ore");
		GameRegistry.registerBlock(Element115Ore, modid+Element115Ore.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Ore, "Element 115 Ore");
		
		//Machine Registry~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		AdvancedPlateBender = new AdvancedPlateBender(AdvancedPlateBenderID, Material.iron).setUnlocalizedName("AdvancedPlateBender");
		GameRegistry.registerBlock(AdvancedPlateBender, modid+AdvancedPlateBender.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(AdvancedPlateBender, "Advanced Plate Bender");
		
		//Item Registry
			//Dusts~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		EridiumDust = new EridiumDust(EridiumOreID).setUnlocalizedName("EridiumDust");
		GameRegistry.registerItem(EridiumDust, modid+EridiumDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumDust, "Eridium Dust");
		
		CitrineDust = new CitrineDust(CitrineDustID).setUnlocalizedName("CitrineDust");
		GameRegistry.registerItem(CitrineDust, modid+CitrineDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineDust, "Citrine Dust");
		
		RadiumDust = new RadiumDust(RadiumDustID).setUnlocalizedName("RadiumDust");
		GameRegistry.registerItem(RadiumDust, modid+RadiumDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumDust, "Radium Dust");
		
		FluoriteDust = new FluoriteDust(FluoriteDustID).setUnlocalizedName("FluoriteDust");
		GameRegistry.registerItem(FluoriteDust, modid+FluoriteDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteDust, "Fluorite Dust");
		
		Element115Dust = new Element115Dust(Element115DustID).setUnlocalizedName("Element115Dust");
		GameRegistry.registerItem(Element115Dust, modid+Element115Dust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Dust, "Element115 Dust");
		
		MysteriousDust = new MysteriousDust(MysteriousDustID).setUnlocalizedName("MysteriousDust");
		GameRegistry.registerItem(MysteriousDust, modid+MysteriousDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousDust, "Mysterious Dust");
		
		DarkDust = new DarkDust(DarkDustID).setUnlocalizedName("DarkDust");
		GameRegistry.registerItem(DarkDust, modid+DarkDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkDust, "Dark Dust");
		
		FluxDust = new FluxDust(FluxDustID).setUnlocalizedName("FluxDust");
		GameRegistry.registerItem(FluxDust, modid+FluxDust.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxDust, "Flux Dust");
			//Ingots~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		FluxIngot = new FluxIngot(FluxIngotID).setUnlocalizedName("FluxIngot");
		GameRegistry.registerItem(FluxIngot, modid+FluxIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluxIngot, "Flux Ingot");
		
		CitrineIngot = new CitrineIngot(CitrineIngotID).setUnlocalizedName("CitrineIngot");
		GameRegistry.registerItem(CitrineIngot, modid+CitrineIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(CitrineIngot, "Citrine Ingot");
		
		RadiumIngot = new RadiumIngot(RadiumIngotID).setUnlocalizedName("RadiumIngot");
		GameRegistry.registerItem(RadiumIngot, modid+RadiumIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(RadiumIngot, "Radium Ingot");
		
		FluoriteIngot = new FluoriteIngot(FluoriteIngotID).setUnlocalizedName("FluoriteIngot");
		GameRegistry.registerItem(FluoriteIngot, modid+FluoriteIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(FluoriteIngot, "Fluorite Ingot");
		
		Element115Ingot = new Element115Ingot(Element115IngotID).setUnlocalizedName("Element115Ingot");
		GameRegistry.registerItem(Element115Ingot, modid+Element115Ingot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(Element115Ingot, "Element 115 Ingot");
		
		MysteriousIngot = new MysteriousIngot(MysteriousIngotID).setUnlocalizedName("MysteriousIngot");
		GameRegistry.registerItem(MysteriousIngot, modid+MysteriousIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(MysteriousIngot, "Mysterious Ingot");
		
		DarkIngot = new DarkIngot(DarkIngotID).setUnlocalizedName("DarkIngot");
		GameRegistry.registerItem(DarkIngot, modid+DarkIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(DarkIngot, "Dark Ingot");
		
		EridiumIngot = new EridiumIngot(EridiumIngotID).setUnlocalizedName("EridiumIngot");
		GameRegistry.registerItem(EridiumIngot, modid+EridiumIngot.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(EridiumIngot, "Eridium Ingot");
		
		//Tile Entities~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		GameRegistry.registerTileEntity(TileEntityAdvancedPlateBender.class, "AdvancedPlateBenderTileEntity");
		//Recipes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		GameRegistry.addShapelessRecipe(new ItemStack(CitrineIngot), new Object[]{
			new ItemStack(RadiumIngot)
		});
		ItemStack iridiumPlate = Items.getItem("iridiumPlate");
		ItemStack datacontrolcircuit = GT_Items.getItem(GT_Items.Circuit_Data);
		ItemStack lapotroncrystal = Items.getItem("lapotronCrystal");
		ItemStack platebender = GregTech_API.getGregTechBlock(1, 1, bender);
		ItemStack electrumgear = GregTech_API.getGregTechItem(aIndex, aAmount, aMeta)
		
		
		GameRegistry.addRecipe(new ItemStack(AdvancedPlateBender), new Object[]{
			"zaz",
			"yxy",
			"zbz",
			'y', iridiumPlate, 'a', datacontrolcircuit, 'b', lapotroncrystal, 'z', electrumgear , 'x', platebender
		});
		GameRegistry.addSmelting(CitrineDust.itemID, new ItemStack(CitrineIngot, 1), 0.5F);
		GameRegistry.addSmelting(RadiumDust.itemID, new ItemStack(RadiumIngot, 1), 0.5F);
		GameRegistry.addSmelting(Element115Dust.itemID, new ItemStack(Element115Ingot, 1), 0.5F);
		GameRegistry.addSmelting(EridiumDust.itemID, new ItemStack(EridiumIngot, 1), 0.5F);
		GameRegistry.addSmelting(FluoriteDust.itemID, new ItemStack(FluoriteIngot, 1), 0.5F);
		GameRegistry.addSmelting(DarkDust.itemID, new ItemStack(DarkIngot, 1), 0.5F);
		GameRegistry.addSmelting(FluxDust.itemID, new ItemStack(FluxIngot, 1), 0.5F);
		GameRegistry.addSmelting(MysteriousDust.itemID, new ItemStack(MysteriousIngot, 1), 0.5F);
		
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(CitrineOre)), null, new ItemStack(CitrineDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(RadiumOre)), null, new ItemStack(RadiumDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(MysteriousOre)), null, new ItemStack(MysteriousDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(EridiumOre)), null, new ItemStack(EridiumDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(FluoriteOre)), null, new ItemStack(FluoriteDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(FluxOre)), null, new ItemStack(FluxDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(DarkOre)), null, new ItemStack(DarkDust, 2));
		Recipes.macerator.addRecipe(new RecipeInputItemStack(new ItemStack(Element115Ore)), null, new ItemStack(Element115Dust, 2));
		

		
	}
}