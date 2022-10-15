package com.mactso.experiencebugfix.events;


import com.mactso.experiencebugfix.Main;

import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.FORGE)
public class ChangeDimension
{
	@SubscribeEvent
	public static void onChange(PlayerChangedDimensionEvent event)
	{
		Player ep = event.getEntity();
		if (ep instanceof ServerPlayer player)
		{
			player.setExperienceLevels(player.experienceLevel);
		}
	}
}
