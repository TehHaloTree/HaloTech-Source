package com.TehHaloTree.halotechmod;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
public class ItemAdvancedPlateBender extends ItemBlock
{
       public ItemAdvancedPlateBender(int par1)
       {
             super(par1);
             setHasSubtypes(true);
       }
      
       public String getUnlocalizedName(ItemStack itemstack)
       {
             String name = "";
             switch(itemstack.getItemDamage())
             {
                    case 0:
                    {
                           name = "world";
                           break;
                    }
                    case 1:
                    {
                           name = "nether";
                           break;
                    }
                    default: name = "broken";
             }
             return getUnlocalizedName() + "." + name;
       }
      
       public int getMetadata(int par1)
       {
             return par1;
       }
}