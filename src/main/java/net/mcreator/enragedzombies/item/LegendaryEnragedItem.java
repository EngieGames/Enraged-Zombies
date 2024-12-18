
package net.mcreator.enragedzombies.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;
import net.mcreator.enragedzombies.init.EnragedZombiesModItems;

import java.util.List;

public abstract class LegendaryEnragedItem extends ArmorItem {
	public LegendaryEnragedItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 38;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 12, 14, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get()));
			}

			@Override
			public String getName() {
				return "legendary_enraged";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LegendaryEnragedItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_UTILITY).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Legendary"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/legendaryenraged__layer_1.png";
		}
	}

	public static class Chestplate extends LegendaryEnragedItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_UTILITY).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Legendary"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/legendaryenraged__layer_1.png";
		}
	}

	public static class Leggings extends LegendaryEnragedItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_UTILITY).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Legendary"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/legendaryenraged__layer_2.png";
		}
	}

	public static class Boots extends LegendaryEnragedItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_UTILITY).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("Legendary"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/legendaryenraged__layer_1.png";
		}
	}
}
