package arcadework.guns.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;

import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.Minecraft;

import arcadework.guns.item.GlockWeponItem;
import arcadework.guns.item.GlockWeponItem.ItemRanged;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.client.renderer.model.RenderMaterial;

@OnlyIn(Dist.CLIENT)
public class GlockWeponRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlockWeponItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
	public static class GlockRenderer extends GeoItemRenderer<ItemRanged> {
		public GlockRenderer() {
			super(new GlockModel());
		}
	}
	public static class GlockModel extends AnimatedGeoModel<ItemRanged> {
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
}
