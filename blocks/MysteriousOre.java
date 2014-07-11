package com.TehHaloTree.halotechmod.blocks;

import com.TehHaloTree.halotechmod.halotech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class MysteriousOre extends Block
{
	public MysteriousOre(int id, Material par2Material)
	{
		super(id, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	@SideOnly(Side.CLIENT)        
	 public void registerIcons(IconRegister par1IconRegister)     
	 {         
		 this.blockIcon = 
	par1IconRegister.registerIcon(halotech.modid +":"+(this.getUnlocalizedName().substring(5)));
	 }

}
