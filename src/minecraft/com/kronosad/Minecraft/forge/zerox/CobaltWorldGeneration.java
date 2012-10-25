package com.kronosad.Minecraft.forge.zerox;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class CobaltWorldGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		//System.out.println(world.provider.worldType);
		switch (world.provider.worldType){
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord = blockX + random.nextInt(16);
		  int Ycoord = random.nextInt(25);
		  int Zcoord = blockZ + random.nextInt(16);
		  System.out.println("Cobalt Ore At: " + "X: " + Xcoord + " Y: " + Ycoord + " Z: " + Zcoord);
		  (new WorldGenMinable(Zerox.cobaltOre.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
