package com.mactso.experiencebugfix;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Main.MODID, 
name = Main.NAME, 
version = Main.VERSION  
)
public class Main {

	public static final String NAME = "Experience Bug Fix";
	public static final String VERSION = "1.0.0.0";
	public static final String ACCEPTED_VERSIONS = "1.12.2";

	    public static final String MODID = "experiencebugfix"; 
	    
	    public Main()
	    {
	    	System.out.println(MODID + ": Registering Mod.");
	    }
	    
		@EventHandler
		public void preInit (FMLPreInitializationEvent event) {
		}    

}


