package com.turtywurty.mod.tabs;

import com.turtywurty.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoStuffTab extends CreativeTabs{

	public MoStuffTab(String label) {
		super("mostufftab");
		this.setBackgroundImageName("mostuff.png");
	}

	@Override
	public ItemStack getTabIconItem() { 
		return new ItemStack(ItemInit.INGOT_URANIUM);
	}

}

