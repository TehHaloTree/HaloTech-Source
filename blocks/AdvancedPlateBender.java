package com.TehHaloTree.halotechmod.blocks;

import java.util.List;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.TehHaloTree.halotechmod.halotech;
import com.TehHaloTree.halotechmod.tile.TileEntityAdvancedPlateBender;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AdvancedPlateBender extends BlockContainer
{
	public AdvancedPlateBender(int id, Material par2Material)
	{
		super(id, par2Material);
		this.setCreativeTab(halotech.HaloTechCreativeTab);
		this.setHardness(3.0F);
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9){
		
		if(world.isRemote) return true;
		
		TileEntityAdvancedPlateBender te = (TileEntityAdvancedPlateBender) world.getBlockTileEntity(x,  y,  z);
		
		if(te != null){
			if(player.isSneaking()) te.energy = 0.0D;
			player.addChatMessage("Current Energy: " + te.energy);
			
			
		}
		
		return true;
	}
	
	public int damageDropped(int par1) {
		return par1; }
	
	@SideOnly(Side.CLIENT)

	private Icon[] icons;
	      
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	       icons = new Icon[5];
	            
	       for(int i = 0; i < icons.length; i++)
	       {
	        icons[i] = par1IconRegister.registerIcon(halotech.modid +":"+(this.getUnlocalizedName().substring(5)) + i);
	       }
	}
	
	@SideOnly(Side.CLIENT)

	public Icon getIcon(int par1, int par2)
	{
	       
	       switch(par1)
	            	 {
	            case 0:
	            	return icons[1];
	            case 1:
	            	return icons[2];
	            case 4:
	            	return icons[3];
	            default:
	            	return icons[4];
	            	 }
	             
	             
	       
	}

	
	@Override
	public TileEntity createNewTileEntity(World world) {
		return null;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int meta){
		return new TileEntityAdvancedPlateBender();
	}
}
