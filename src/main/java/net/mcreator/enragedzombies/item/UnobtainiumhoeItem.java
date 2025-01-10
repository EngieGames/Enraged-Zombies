
package net.mcreator.enragedzombies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;

public class UnobtainiumhoeItem extends HoeItem {
	public UnobtainiumhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5080;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 0, -0f, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
	}
}
