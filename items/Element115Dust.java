package com.TehHaloTree.halotechmod.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.TehHaloTree.halotechmod.halotech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Element115Dust extends Item{

	public Element115Dust(int par1) {
		super(par1);
		setCreativeTab(halotech.HaloTechCreativeTab);
	}
	
	@SideOnly(Side.CLIENT) 
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(halotech.modid + ":" + (this.getUnlocalizedName().substring(5)));
	
	}

}