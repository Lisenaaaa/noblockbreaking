package net.zordlan.noblockbreaking;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;


public class NoBlockBreaking implements ModInitializer {
	@Override
	public void onInitialize() {
		AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
			return null;
		});
	}
}