
package arcadework.guns.item;

import net.minecraft.client.Minecraft;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.network.PacketDistributor;

import net.minecraft.client.entity.player.ClientPlayerEntity;

import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import arcadework.guns.item.renderer.GlockRenderer.GlockWeRenderer;
import arcadework.guns.procedures.GlockRightclickedProcedure;
import arcadework.guns.itemgroup.GunsItemGroup;
import arcadework.guns.GunsModElements;

import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.SoundKeyframeEvent;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.network.GeckoLibNetwork;
import software.bernie.geckolib3.network.ISyncable;
import software.bernie.geckolib3.util.GeckoLibUtil;

@GunsModElements.ModElement.Tag
public class GlockItem extends GunsModElements.ModElement {
	@ObjectHolder("guns:glock")
	public static final Item block = null;

	public GlockItem(GunsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item implements IAnimatable, ISyncable {
		private static final String CONTROLLER = "Controller";
		private static final int ANIM_OPEN = 0;
		public AnimationFactory factory = new AnimationFactory(this);

		public ItemCustom() {
			super(new Item.Properties().group(GunsItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON).setISTER(() -> GlockWeRenderer::new));
			GeckoLibNetwork.registerSyncable(this);
			setRegistryName("glock");
		}
		
		private <P extends Item & IAnimatable> PlayState predicate(AnimationEvent<P> event) {
			return PlayState.CONTINUE;
		}

		@Override
		public void registerControllers(AnimationData data) {
			AnimationController<ItemCustom> controller = new AnimationController<ItemCustom>(this, CONTROLLER, 20, this::predicate);
			data.addAnimationController(controller);
		}
		
		@Override
		public AnimationFactory getFactory() {
			return this.factory;
		}
		
		@Override
		public void onAnimationSync(int id, int state) {
			if (state == ANIM_OPEN) {
				// Always use GeckoLibUtil to get AnimationControllers when you don't have
				// access to an AnimationEvent
				final AnimationController<?> controller = GeckoLibUtil.getControllerForID(this.factory, id, CONTROLLER);

				if (controller.getAnimationState() == AnimationState.Stopped) {
					// If you don't do this, the popup animation will only play once because the
					// animation will be cached.
					controller.markNeedsReload();
					// Set the animation to open the JackInTheBoxItem which will start playing music
					// and
					// eventually do the actual animation. Also sets it to not loop
					controller.setAnimation(new AnimationBuilder().addAnimation("glock.shot", false));
				}
			}
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean canHarvestBlock(BlockState state) {
			return true;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			if (world instanceof ServerWorld){
				final ItemStack stack = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				final int id = GeckoLibUtil.guaranteeIDForStack(stack, (ServerWorld) world);
				final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> entity);

				GeckoLibNetwork.syncAnimation(target, this, id, ANIM_OPEN);
			}
		
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			GlockRightclickedProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			
			return super.onItemRightClick(world, entity, hand);
		}
	}
}
