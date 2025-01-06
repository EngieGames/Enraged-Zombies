
package net.mcreator.enragedzombies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;
import net.mcreator.enragedzombies.init.EnragedZombiesModItems;

import java.util.List;

public class MythicSwordItem extends SwordItem {
	public MythicSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6096;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get()));
			}
		}, 3, -0.8f, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_UTILITY).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Mythic"));
	}
}
