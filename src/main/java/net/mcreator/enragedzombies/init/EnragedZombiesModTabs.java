
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EnragedZombiesModTabs {
	public static CreativeModeTab TAB_MOBS;
	public static CreativeModeTab TAB_ARMOR_AND_TOOLS;

	public static void load() {
		TAB_MOBS = new CreativeModeTab("tabmobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnragedZombiesModItems.ENRAGED_ZOMBIES_TAB_ICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ARMOR_AND_TOOLS = new CreativeModeTab("tabarmor_and_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(EnragedZombiesModItems.ENRAGED_ZOMBIES_TAB_ICON_2.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
