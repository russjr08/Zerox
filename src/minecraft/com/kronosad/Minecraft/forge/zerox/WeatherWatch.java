package com.kronosad.Minecraft.forge.zerox;


import net.minecraft.src.*;

public class WeatherWatch extends Item {
    public WeatherWatch(int itemID){
         super(itemID);
         maxStackSize = 1;
         setMaxDamage(1);
    }



    @Override
    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
        player.addChatMessage("Don't drop me :(");
        return true;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
        if(!world.isRemote){
    	world.toggleRain();
        System.out.println("Rain toggled!");
        world.setWorldTime(0);
        player.addChatMessage("Used?");
        
        }
     return item;
    }

}
