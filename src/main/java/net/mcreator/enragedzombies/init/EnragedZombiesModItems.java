
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.enragedzombies.item.UnobtainiumhoeItem;
import net.mcreator.enragedzombies.item.UnobtainiumSwordItem;
import net.mcreator.enragedzombies.item.UnobtainiumShovelItem;
import net.mcreator.enragedzombies.item.UnobtainiumPickaxeItem;
import net.mcreator.enragedzombies.item.UnobtainiumItem;
import net.mcreator.enragedzombies.item.UnobtainiumAxeItem;
import net.mcreator.enragedzombies.item.UncommonSwordItem;
import net.mcreator.enragedzombies.item.UncommonShovelItem;
import net.mcreator.enragedzombies.item.UncommonPickaxeItem;
import net.mcreator.enragedzombies.item.UncommonItem;
import net.mcreator.enragedzombies.item.UncommonHoeItem;
import net.mcreator.enragedzombies.item.UncommonAxeItem;
import net.mcreator.enragedzombies.item.RareSwordItem;
import net.mcreator.enragedzombies.item.RareShovelItem;
import net.mcreator.enragedzombies.item.RarePickaxeItem;
import net.mcreator.enragedzombies.item.RareItem;
import net.mcreator.enragedzombies.item.RareHoeItem;
import net.mcreator.enragedzombies.item.RareAxeItem;
import net.mcreator.enragedzombies.item.MythicSwordItem;
import net.mcreator.enragedzombies.item.MythicShovelItem;
import net.mcreator.enragedzombies.item.MythicPickaxeItem;
import net.mcreator.enragedzombies.item.MythicItem;
import net.mcreator.enragedzombies.item.MythicHoeItem;
import net.mcreator.enragedzombies.item.MythicAxeItem;
import net.mcreator.enragedzombies.item.LegendarySwordItem;
import net.mcreator.enragedzombies.item.LegendaryShovelItem;
import net.mcreator.enragedzombies.item.LegendaryPickaxeItem;
import net.mcreator.enragedzombies.item.LegendaryItem;
import net.mcreator.enragedzombies.item.LegendaryHoeItem;
import net.mcreator.enragedzombies.item.LegendaryAxeItem;
import net.mcreator.enragedzombies.item.ExoticSwordItem;
import net.mcreator.enragedzombies.item.ExoticShovelItem;
import net.mcreator.enragedzombies.item.ExoticPickaxeItem;
import net.mcreator.enragedzombies.item.ExoticItem;
import net.mcreator.enragedzombies.item.ExoticHoeItem;
import net.mcreator.enragedzombies.item.ExoticAxeItem;
import net.mcreator.enragedzombies.item.EpicSwordItem;
import net.mcreator.enragedzombies.item.EpicShovelItem;
import net.mcreator.enragedzombies.item.EpicPickaxeItem;
import net.mcreator.enragedzombies.item.EpicItem;
import net.mcreator.enragedzombies.item.EpicHoeItem;
import net.mcreator.enragedzombies.item.EpicAxeItem;
import net.mcreator.enragedzombies.item.EnragedZombiesTabIconItem;
import net.mcreator.enragedzombies.item.EnragedZombiesTabIcon2Item;
import net.mcreator.enragedzombies.item.EngiCoinItem;
import net.mcreator.enragedzombies.item.CommonSwordItem;
import net.mcreator.enragedzombies.item.CommonShovelItem;
import net.mcreator.enragedzombies.item.CommonPickaxeItem;
import net.mcreator.enragedzombies.item.CommonItem;
import net.mcreator.enragedzombies.item.CommonHoeItem;
import net.mcreator.enragedzombies.item.CommonAxeItem;
import net.mcreator.enragedzombies.EnragedZombiesMod;

public class EnragedZombiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnragedZombiesMod.MODID);
	public static final RegistryObject<Item> DEEPSLATE_UNOBTAINIUM_ORE = block(EnragedZombiesModBlocks.DEEPSLATE_UNOBTAINIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> UNOBTAINIUM_ORE = block(EnragedZombiesModBlocks.UNOBTAINIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENRAGED_NORMAL_SPAWN_EGG = REGISTRY.register("enraged_normal_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_NORMAL, -16358652, -7405568, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENRAGED_TNT_SPAWN_EGG = REGISTRY.register("enraged_tnt_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_TNT, -2412774, -7405568, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENRAGED_SPEED_SPAWN_EGG = REGISTRY.register("enraged_speed_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_SPEED, -16489688, -7405568, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> COMMON_ENGIE_SPAWN_EGG = REGISTRY.register("common_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.COMMON_ENGIE, -4310213, -5395027, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> UNCOMMON_ENGIE_SPAWN_EGG = REGISTRY.register("uncommon_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.UNCOMMON_ENGIE, -4310213, -10551437, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> RARE_ENGIE_SPAWN_EGG = REGISTRY.register("rare_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.RARE_ENGIE, -4310213, -10591233, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> EPIC_ENGIE_SPAWN_EGG = REGISTRY.register("epic_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.EPIC_ENGIE, -4310213, -2138369, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> LEGENDARY_ENGIE_SPAWN_EGG = REGISTRY.register("legendary_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.LEGENDARY_ENGIE, -4310213, -22178, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> MYTHIC_ENGIE_SPAWN_EGG = REGISTRY.register("mythic_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.MYTHIC_ENGIE, -4310213, -2162893, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> EXOTIC_ENGIE_SPAWN_EGG = REGISTRY.register("exotic_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.EXOTIC_ENGIE, -4310213, -11534368, new Item.Properties().tab(EnragedZombiesModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> COMMON_HELMET = REGISTRY.register("common_helmet", () -> new CommonItem.Helmet());
	public static final RegistryObject<Item> COMMON_CHESTPLATE = REGISTRY.register("common_chestplate", () -> new CommonItem.Chestplate());
	public static final RegistryObject<Item> COMMON_LEGGINGS = REGISTRY.register("common_leggings", () -> new CommonItem.Leggings());
	public static final RegistryObject<Item> COMMON_BOOTS = REGISTRY.register("common_boots", () -> new CommonItem.Boots());
	public static final RegistryObject<Item> COMMON_SWORD = REGISTRY.register("common_sword", () -> new CommonSwordItem());
	public static final RegistryObject<Item> COMMON_PICKAXE = REGISTRY.register("common_pickaxe", () -> new CommonPickaxeItem());
	public static final RegistryObject<Item> COMMON_AXE = REGISTRY.register("common_axe", () -> new CommonAxeItem());
	public static final RegistryObject<Item> COMMON_SHOVEL = REGISTRY.register("common_shovel", () -> new CommonShovelItem());
	public static final RegistryObject<Item> COMMON_HOE = REGISTRY.register("common_hoe", () -> new CommonHoeItem());
	public static final RegistryObject<Item> UNCOMMON_HELMET = REGISTRY.register("uncommon_helmet", () -> new UncommonItem.Helmet());
	public static final RegistryObject<Item> UNCOMMON_CHESTPLATE = REGISTRY.register("uncommon_chestplate", () -> new UncommonItem.Chestplate());
	public static final RegistryObject<Item> UNCOMMON_LEGGINGS = REGISTRY.register("uncommon_leggings", () -> new UncommonItem.Leggings());
	public static final RegistryObject<Item> UNCOMMON_BOOTS = REGISTRY.register("uncommon_boots", () -> new UncommonItem.Boots());
	public static final RegistryObject<Item> UNCOMMON_SWORD = REGISTRY.register("uncommon_sword", () -> new UncommonSwordItem());
	public static final RegistryObject<Item> UNCOMMON_PICKAXE = REGISTRY.register("uncommon_pickaxe", () -> new UncommonPickaxeItem());
	public static final RegistryObject<Item> UNCOMMON_AXE = REGISTRY.register("uncommon_axe", () -> new UncommonAxeItem());
	public static final RegistryObject<Item> UNCOMMON_SHOVEL = REGISTRY.register("uncommon_shovel", () -> new UncommonShovelItem());
	public static final RegistryObject<Item> UNCOMMON_HOE = REGISTRY.register("uncommon_hoe", () -> new UncommonHoeItem());
	public static final RegistryObject<Item> RARE_HELMET = REGISTRY.register("rare_helmet", () -> new RareItem.Helmet());
	public static final RegistryObject<Item> RARE_CHESTPLATE = REGISTRY.register("rare_chestplate", () -> new RareItem.Chestplate());
	public static final RegistryObject<Item> RARE_LEGGINGS = REGISTRY.register("rare_leggings", () -> new RareItem.Leggings());
	public static final RegistryObject<Item> RARE_BOOTS = REGISTRY.register("rare_boots", () -> new RareItem.Boots());
	public static final RegistryObject<Item> RARE_SWORD = REGISTRY.register("rare_sword", () -> new RareSwordItem());
	public static final RegistryObject<Item> RARE_PICKAXE = REGISTRY.register("rare_pickaxe", () -> new RarePickaxeItem());
	public static final RegistryObject<Item> RARE_AXE = REGISTRY.register("rare_axe", () -> new RareAxeItem());
	public static final RegistryObject<Item> RARE_SHOVEL = REGISTRY.register("rare_shovel", () -> new RareShovelItem());
	public static final RegistryObject<Item> RARE_HOE = REGISTRY.register("rare_hoe", () -> new RareHoeItem());
	public static final RegistryObject<Item> EPIC_HELMET = REGISTRY.register("epic_helmet", () -> new EpicItem.Helmet());
	public static final RegistryObject<Item> EPIC_CHESTPLATE = REGISTRY.register("epic_chestplate", () -> new EpicItem.Chestplate());
	public static final RegistryObject<Item> EPIC_LEGGINGS = REGISTRY.register("epic_leggings", () -> new EpicItem.Leggings());
	public static final RegistryObject<Item> EPIC_BOOTS = REGISTRY.register("epic_boots", () -> new EpicItem.Boots());
	public static final RegistryObject<Item> EPIC_SWORD = REGISTRY.register("epic_sword", () -> new EpicSwordItem());
	public static final RegistryObject<Item> EPIC_PICKAXE = REGISTRY.register("epic_pickaxe", () -> new EpicPickaxeItem());
	public static final RegistryObject<Item> EPIC_AXE = REGISTRY.register("epic_axe", () -> new EpicAxeItem());
	public static final RegistryObject<Item> EPIC_SHOVEL = REGISTRY.register("epic_shovel", () -> new EpicShovelItem());
	public static final RegistryObject<Item> EPIC_HOE = REGISTRY.register("epic_hoe", () -> new EpicHoeItem());
	public static final RegistryObject<Item> LEGENDARY_HELMET = REGISTRY.register("legendary_helmet", () -> new LegendaryItem.Helmet());
	public static final RegistryObject<Item> LEGENDARY_CHESTPLATE = REGISTRY.register("legendary_chestplate", () -> new LegendaryItem.Chestplate());
	public static final RegistryObject<Item> LEGENDARY_LEGGINGS = REGISTRY.register("legendary_leggings", () -> new LegendaryItem.Leggings());
	public static final RegistryObject<Item> LEGENDARY_BOOTS = REGISTRY.register("legendary_boots", () -> new LegendaryItem.Boots());
	public static final RegistryObject<Item> LEGENDARY_SWORD = REGISTRY.register("legendary_sword", () -> new LegendarySwordItem());
	public static final RegistryObject<Item> LEGENDARY_PICKAXE = REGISTRY.register("legendary_pickaxe", () -> new LegendaryPickaxeItem());
	public static final RegistryObject<Item> LEGENDARY_AXE = REGISTRY.register("legendary_axe", () -> new LegendaryAxeItem());
	public static final RegistryObject<Item> LEGENDARY_SHOVEL = REGISTRY.register("legendary_shovel", () -> new LegendaryShovelItem());
	public static final RegistryObject<Item> LEGENDARY_HOE = REGISTRY.register("legendary_hoe", () -> new LegendaryHoeItem());
	public static final RegistryObject<Item> MYTHIC_HELMET = REGISTRY.register("mythic_helmet", () -> new MythicItem.Helmet());
	public static final RegistryObject<Item> MYTHIC_CHESTPLATE = REGISTRY.register("mythic_chestplate", () -> new MythicItem.Chestplate());
	public static final RegistryObject<Item> MYTHIC_LEGGINGS = REGISTRY.register("mythic_leggings", () -> new MythicItem.Leggings());
	public static final RegistryObject<Item> MYTHIC_BOOTS = REGISTRY.register("mythic_boots", () -> new MythicItem.Boots());
	public static final RegistryObject<Item> MYTHIC_SWORD = REGISTRY.register("mythic_sword", () -> new MythicSwordItem());
	public static final RegistryObject<Item> MYTHIC_PICKAXE = REGISTRY.register("mythic_pickaxe", () -> new MythicPickaxeItem());
	public static final RegistryObject<Item> MYTHIC_AXE = REGISTRY.register("mythic_axe", () -> new MythicAxeItem());
	public static final RegistryObject<Item> MYTHIC_SHOVEL = REGISTRY.register("mythic_shovel", () -> new MythicShovelItem());
	public static final RegistryObject<Item> MYTHIC_HOE = REGISTRY.register("mythic_hoe", () -> new MythicHoeItem());
	public static final RegistryObject<Item> EXOTIC_HELMET = REGISTRY.register("exotic_helmet", () -> new ExoticItem.Helmet());
	public static final RegistryObject<Item> EXOTIC_CHESTPLATE = REGISTRY.register("exotic_chestplate", () -> new ExoticItem.Chestplate());
	public static final RegistryObject<Item> EXOTIC_LEGGINGS = REGISTRY.register("exotic_leggings", () -> new ExoticItem.Leggings());
	public static final RegistryObject<Item> EXOTIC_BOOTS = REGISTRY.register("exotic_boots", () -> new ExoticItem.Boots());
	public static final RegistryObject<Item> EXOTIC_SWORD = REGISTRY.register("exotic_sword", () -> new ExoticSwordItem());
	public static final RegistryObject<Item> EXOTIC_PICKAXE = REGISTRY.register("exotic_pickaxe", () -> new ExoticPickaxeItem());
	public static final RegistryObject<Item> EXOTIC_AXE = REGISTRY.register("exotic_axe", () -> new ExoticAxeItem());
	public static final RegistryObject<Item> EXOTIC_SHOVEL = REGISTRY.register("exotic_shovel", () -> new ExoticShovelItem());
	public static final RegistryObject<Item> EXOTIC_HOE = REGISTRY.register("exotic_hoe", () -> new ExoticHoeItem());
	public static final RegistryObject<Item> UNOBTAINIUM_HELMET = REGISTRY.register("unobtainium_helmet", () -> new UnobtainiumItem.Helmet());
	public static final RegistryObject<Item> UNOBTAINIUM_CHESTPLATE = REGISTRY.register("unobtainium_chestplate", () -> new UnobtainiumItem.Chestplate());
	public static final RegistryObject<Item> UNOBTAINIUM_LEGGINGS = REGISTRY.register("unobtainium_leggings", () -> new UnobtainiumItem.Leggings());
	public static final RegistryObject<Item> UNOBTAINIUM_BOOTS = REGISTRY.register("unobtainium_boots", () -> new UnobtainiumItem.Boots());
	public static final RegistryObject<Item> UNOBTAINIUM_SWORD = REGISTRY.register("unobtainium_sword", () -> new UnobtainiumSwordItem());
	public static final RegistryObject<Item> UNOBTAINIUM_PICKAXE = REGISTRY.register("unobtainium_pickaxe", () -> new UnobtainiumPickaxeItem());
	public static final RegistryObject<Item> UNOBTAINIUM_AXE = REGISTRY.register("unobtainium_axe", () -> new UnobtainiumAxeItem());
	public static final RegistryObject<Item> UNOBTAINIUM_SHOVEL = REGISTRY.register("unobtainium_shovel", () -> new UnobtainiumShovelItem());
	public static final RegistryObject<Item> UNOBTAINIUMHOE = REGISTRY.register("unobtainiumhoe", () -> new UnobtainiumhoeItem());
	public static final RegistryObject<Item> ENRAGED_COIN = REGISTRY.register("enraged_coin", () -> new EngiCoinItem());
	public static final RegistryObject<Item> ENRAGED_ZOMBIES_TAB_ICON = REGISTRY.register("enraged_zombies_tab_icon", () -> new EnragedZombiesTabIconItem());
	public static final RegistryObject<Item> ENRAGED_ZOMBIES_TAB_ICON_2 = REGISTRY.register("enraged_zombies_tab_icon_2", () -> new EnragedZombiesTabIcon2Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
