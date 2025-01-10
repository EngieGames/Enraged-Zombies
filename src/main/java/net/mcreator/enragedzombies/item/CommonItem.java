
package net.mcreator.enragedzombies.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.enragedzombies.init.EnragedZombiesModTabs;
import net.mcreator.enragedzombies.init.EnragedZombiesModItems;

public abstract class CommonItem extends ArmorItem {
	public CommonItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 5;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 2, 3, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get()));
			}

			@Override
			public String getName() {
				return "common";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CommonItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/commonenraged__layer_1.png";
		}
	}

	public static class Chestplate extends CommonItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/commonenraged__layer_1.png";
		}
	}

	public static class Leggings extends CommonItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/commonenraged__layer_2.png";
		}
	}

	public static class Boots extends CommonItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/commonenraged__layer_1.png";
		}
	}
}
