package com.kronosad.Minecraft.forge.zerox;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPig;
import net.minecraft.src.Item;
import net.minecraft.src.ItemAppleGold;
import net.minecraft.src.ItemSeeds;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class EventHookContainerClass {
	
	
	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public void onDeath(LivingDeathEvent event){
		World mcWorld = event.entity.worldObj;
		if(!mcWorld.isRemote){		
		System.out.println("Entity Died!");
		System.out.println("Entity: " + event.entity.toString());
			
		
			if(event.entity instanceof EntityPig){
			ItemStack stack = new ItemStack(Item.diamond, 1);
			EntityItem item = new EntityItem(mcWorld, event.entity.posX, event.entity.posY, event.entity.posZ, stack );
			item.entityDropItem(stack, (float)event.entity.posY);
			}
		}
	}
}
