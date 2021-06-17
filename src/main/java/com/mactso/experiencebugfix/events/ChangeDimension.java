package com.mactso.experiencebugfix.events;


import com.mactso.experiencebugfix.Main;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
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
		PlayerEntity ep = event.getPlayer();
		if (ep instanceof ServerPlayerEntity)
		{
			ServerPlayerEntity player = (ServerPlayerEntity) ep;
			player.setExperienceLevels(player.experienceLevel);
		}
	}
}
