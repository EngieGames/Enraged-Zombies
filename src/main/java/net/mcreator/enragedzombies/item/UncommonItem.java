
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

public abstract class UncommonItem extends ArmorItem {
	public UncommonItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 7;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{1, 3, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_gold"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get()));
			}

			@Override
			public String getName() {
				return "uncommon";
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

	public static class Helmet extends UncommonItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/uncommonenraged__layer_1.png";
		}
	}

	public static class Chestplate extends UncommonItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/uncommonenraged__layer_1.png";
		}
	}

	public static class Leggings extends UncommonItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/uncommonenraged__layer_2.png";
		}
	}

	public static class Boots extends UncommonItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/uncommonenraged__layer_1.png";
		}
	}
}
