
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

public abstract class ExoticItem extends ArmorItem {
	public ExoticItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 42;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{7, 10, 12, 7}[slot.getIndex()];
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
				return "exotic";
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

	public static class Helmet extends ExoticItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/exoticenraged__layer_1.png";
		}
	}

	public static class Chestplate extends ExoticItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/exoticenraged__layer_1.png";
		}
	}

	public static class Leggings extends ExoticItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/exoticenraged__layer_2.png";
		}
	}

	public static class Boots extends ExoticItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ARMOR_AND_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "enraged_zombies:textures/models/armor/exoticenraged__layer_1.png";
		}
	}
}
