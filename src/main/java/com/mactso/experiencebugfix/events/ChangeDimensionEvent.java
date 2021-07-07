package com.mactso.experiencebugfix.events;
import com.mactso.experiencebugfix.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;



@Mod.EventBusSubscriber(modid = Main.MODID )
public class ChangeDimensionEvent
{


	
	@SubscribeEvent
	public static void onChange( PlayerEvent.PlayerChangedDimensionEvent event)
	{

		EntityPlayer ep = event.player;
		if (ep instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP) ep;
			player.addExperienceLevel(0);
		}
	}
	
}
