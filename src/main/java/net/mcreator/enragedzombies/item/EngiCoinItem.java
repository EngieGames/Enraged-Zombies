
package net.mcreator.enragedzombies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;

import java.util.List;

public class EngiCoinItem extends Item {
	public EngiCoinItem() {
		super(new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Get a lot of these to be a show off."));
	}
}
