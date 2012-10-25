package com.kronosad.Minecraft.forge.zerox;

import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class BlockCobaltOre extends Block {

	public BlockCobaltOre(int blockID, int textureID, Material material) {
		super(blockID, textureID, material);
	}

	@Override
	public String getTextureFile() {
		return "/ZeroxBlocks.png";
	}
	
}
