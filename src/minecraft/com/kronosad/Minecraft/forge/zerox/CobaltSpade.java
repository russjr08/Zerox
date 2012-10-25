package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;

public class CobaltSpade extends ItemSpade {

	public CobaltSpade(int itemID, EnumToolMaterial toolMaterial) {
		super(itemID, toolMaterial);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getTextureFile(){
		return "/ZeroxTools.png";
	}

}
