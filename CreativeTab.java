package com.TehHaloTree.halotechmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.TehHaloTree.halotechmod.halotech;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class CreativeTab extends CreativeTabs {
	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
    public ItemStack getIconItemStack() {
        return new ItemStack(halotech.FluoriteDust, 1, 0);
}
	
    @Override
    @SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "HaloTech";
	}
}