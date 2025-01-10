
package net.mcreator.enragedzombies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;

public class EpicAxeItem extends AxeItem {
	public EpicAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1016;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
	}
}
