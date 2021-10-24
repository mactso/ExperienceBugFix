package com.mactso.experiencebugfix.events;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class FixXpHandler implements ServerEntityWorldChangeEvents.AfterPlayerChange {

	@Override
	public void afterChangeWorld(ServerPlayerEntity player, ServerWorld origin, ServerWorld destination) {
		player.addExperienceLevels(0);
		//System.out.println("fix XP");
		return;
	}

}
