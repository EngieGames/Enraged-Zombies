
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EnragedZombiesModTabs {
	public static CreativeModeTab TAB_ENRAGED_UTILITY;
	public static CreativeModeTab TAB_ENRAGED_ZOMBIES;

	public static void load() {
		TAB_ENRAGED_UTILITY = new CreativeModeTab("tabenraged_utility") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnragedZombiesModItems.LEGENDARY_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ENRAGED_ZOMBIES = new CreativeModeTab("tabenraged_zombies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
