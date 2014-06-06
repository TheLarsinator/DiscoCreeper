package com.dcm.core;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.dcm.EntityDiscoCreeper;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod (modid = "dcm",name = "DiscoCreeper", version = "version")

public class DiscoCreeper 
{
	public static String modid = "dcm";	
	@SidedProxy(clientSide = "com.dcm.core.DiscoCreeperClient",serverSide = "com.dcm.core.DiscoCreeperProxy")
	public static DiscoCreeperProxy proxy;
	@Instance("DiscoCreeper")
	public static DiscoCreeper instance;	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		 proxy.registerSound();		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	
		
		EntityRegistry.registerGlobalEntityID(EntityDiscoCreeper.class, "DiscoCreeper", EntityRegistry.findGlobalUniqueEntityId(), 0xFF7A0D, 0x0DFF15);
        EntityRegistry.addSpawn(EntityDiscoCreeper.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		proxy.registerRenderInformation();

	}
}
