package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class CobaltIngot extends Item {
	public static int ItemID;
	protected CobaltIngot(int itemID) {
		super(itemID);
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
		ItemID = itemID;
		
	}
	
	public String getTextureFile(){
		return "/ZeroxItems.png";
	}

}
