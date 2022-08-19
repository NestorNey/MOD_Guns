package arcadework.guns.item.renderer;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;

import arcadework.guns.item.GlockItem.ItemCustom;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@OnlyIn(Dist.CLIENT)
public class GlockRenderer {
	public static class GlockWeRenderer extends GeoItemRenderer<ItemCustom> {
		public GlockWeRenderer() {
			super(new GlockModel());
		}
	}
	public static class GlockModel extends AnimatedGeoModel<ItemCustom> {
		@Override
		public ResourceLocation getModelLocation(ItemCustom object) {
			return new ResourceLocation("guns:geo/glock.geo.json");
		}

		@Override
		public ResourceLocation getTextureLocation(ItemCustom object) {
			return new ResourceLocation("guns:textures/items/glock_main.png");
		}

		@Override
		public ResourceLocation getAnimationFileLocation(ItemCustom animatable) {
			return new ResourceLocation("guns:animations/weapon_glock.animation.json");
		}
	}
}
