
package net.mcreator.enragedzombies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;

public class ExoticAxeItem extends AxeItem {
	public ExoticAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4064;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
	}
}
