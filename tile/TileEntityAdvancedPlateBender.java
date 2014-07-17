package com.TehHaloTree.halotechmod.tile;

import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergySink;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;

public class TileEntityAdvancedPlateBender extends TileEntity implements IEnergySink, IInventory{
	
	public double energy = 0.0D;
	public double maxEnergy = 10000.0D;
	private boolean initialized;
	
	public void readFromNBT(NBTTagCompound nbttagcompound){
		super.readFromNBT(nbttagcompound);
		
		if(nbttagcompound.hasKey("energy")){
			this.energy = nbttagcompound.getDouble("energy");
		}
	}
	public void writeToNBT(NBTTagCompound nbttagcompound){
		super.readFromNBT(nbttagcompound);
		
		nbttagcompound.setDouble("energy", this.energy);
	}
	
	@Override
	public void updateEntity(){
		if(!initialized && worldObj != null){
			if(!worldObj.isRemote){
				EnergyTileLoadEvent loadEvent = new EnergyTileLoadEvent(this);
				MinecraftForge.EVENT_BUS.post(loadEvent);
			}
			initialized = true;
		}
	}
	
	@Override
	public void invalidate(){
		EnergyTileUnloadEvent unloadEvent = new EnergyTileUnloadEvent(this);
		MinecraftForge.EVENT_BUS.post(unloadEvent);
	}
	
	@Override
	public boolean acceptsEnergyFrom(TileEntity emitter,
			ForgeDirection direction){
		return true;
	}
	
	@Override
	public double demandedEnergyUnits(){
		return this.maxEnergy - this.energy;
	}
	
	@Override
	public double injectEnergyUnits(ForgeDirection directionFrom, double amount){
		if(this.energy >= this.maxEnergy) return amount;
		
		double openEnergy = this.maxEnergy - this.energy;
		
		if(openEnergy >= amount){
			this.energy += amount;
			return 0.0D;
		} else if (amount > openEnergy){
			this.energy = this.maxEnergy;
			return amount = openEnergy;
		}
		
		
		return 0;
	}
	
	@Override
	public int getMaxSafeInput(){
		return 512;
	}
	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ItemStack getStackInSlot(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemStack decrStackSize(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getInvName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isInvNameLocalized() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void openChest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeChest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		// TODO Auto-generated method stub
		return false;
	}

}
