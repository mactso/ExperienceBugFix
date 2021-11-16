package com.mactso.experiencebugfix;

import com.mactso.experiencebugfix.events.FixXpHandler;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {
		// Register handler class.
		ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.register(new FixXpHandler());
	}
}
