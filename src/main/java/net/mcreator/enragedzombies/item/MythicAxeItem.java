
package net.mcreator.enragedzombies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;

public class MythicAxeItem extends AxeItem {
	public MythicAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2032;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
	}
}
