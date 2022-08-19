package arcadework.guns.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.WorldEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;

import java.util.Map;
import java.util.HashMap;

import arcadework.guns.GunsMod;

public class GlockRightclickedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onWorldLoad(WorldEvent.Load event) {
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GunsMod.LOGGER.warn("Failed to load dependency world for procedure GlockRightclicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack asdas = ItemStack.EMPTY;
		if (world instanceof ServerWorld)
			((ServerWorld) world).setDayTime((int) 1);
	}
}
