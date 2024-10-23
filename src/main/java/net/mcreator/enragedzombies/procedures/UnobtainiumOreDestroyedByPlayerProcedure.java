package net.mcreator.enragedzombies.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.enragedzombies.init.EnragedZombiesModItems;

import java.util.Random;
import java.util.Iterator;

public class UnobtainiumOreDestroyedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		if (Mth.nextInt(new Random(), 1, 9) == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_HELMET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_CHESTPLATE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_LEGGINGS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_BOOTS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_PICKAXE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_AXE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SHOVEL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(new Random(), 1, 9) == 9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_HOE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
