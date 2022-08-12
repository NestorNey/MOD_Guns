package arcadework.guns.models.item;

import net.minecraft.util.ResourceLocation;
import arcadework.guns.item.GlockWeponItem.ItemRanged;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GlockModel extends AnimatedGeoModel<ItemRanged> {
	@Override
	public ResourceLocation getModelLocation(ItemRanged object) {
		return new ResourceLocation("guns:geo/glock.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ItemRanged object) {
		return new ResourceLocation("guns:textures/items/glock_main.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(ItemRanged animatable) {
		return new ResourceLocation("guns:animations/weapon_glock.animation.json");
	}
}