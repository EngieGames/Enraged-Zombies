
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

import net.mcreator.enragedzombies.item.UnobtainiumSwordItem;
import net.mcreator.enragedzombies.item.UnobtainiumShovelItem;
import net.mcreator.enragedzombies.item.UnobtainiumPickaxeItem;
import net.mcreator.enragedzombies.item.UnobtainiumHoeItem;
import net.mcreator.enragedzombies.item.UnobtainiumEnragedItem;
import net.mcreator.enragedzombies.item.UnobtainiumAxeItem;
import net.mcreator.enragedzombies.item.UncommonSwordItem;
import net.mcreator.enragedzombies.item.UncommonShovelItem;
import net.mcreator.enragedzombies.item.UncommonPickaxeItem;
import net.mcreator.enragedzombies.item.UncommonHoeItem;
import net.mcreator.enragedzombies.item.UncommonEnragedItem;
import net.mcreator.enragedzombies.item.UncommonAxeItem;
import net.mcreator.enragedzombies.item.RareSwordItem;
import net.mcreator.enragedzombies.item.RareShovelItem;
import net.mcreator.enragedzombies.item.RarePickaxeItem;
import net.mcreator.enragedzombies.item.RareHoeItem;
import net.mcreator.enragedzombies.item.RareEnragedItem;
import net.mcreator.enragedzombies.item.RareAxeItem;
import net.mcreator.enragedzombies.item.MythicSwordItem;
import net.mcreator.enragedzombies.item.MythicShovelItem;
import net.mcreator.enragedzombies.item.MythicPickaxeItem;
import net.mcreator.enragedzombies.item.MythicHoeItem;
import net.mcreator.enragedzombies.item.MythicEnragedItem;
import net.mcreator.enragedzombies.item.MythicAxeItem;
import net.mcreator.enragedzombies.item.LegendarySwordItem;
import net.mcreator.enragedzombies.item.LegendaryShovelItem;
import net.mcreator.enragedzombies.item.LegendaryPickaxeItem;
import net.mcreator.enragedzombies.item.LegendaryHoeItem;
import net.mcreator.enragedzombies.item.LegendaryEnragedItem;
import net.mcreator.enragedzombies.item.LegendaryAxeItem;
import net.mcreator.enragedzombies.item.ExoticSwordItem;
import net.mcreator.enragedzombies.item.ExoticShovelItem;
import net.mcreator.enragedzombies.item.ExoticPickaxeItem;
import net.mcreator.enragedzombies.item.ExoticHoeItem;
import net.mcreator.enragedzombies.item.ExoticEnragedItem;
import net.mcreator.enragedzombies.item.ExoticAxeItem;
import net.mcreator.enragedzombies.item.EpicSwordItem;
import net.mcreator.enragedzombies.item.EpicShovelItem;
import net.mcreator.enragedzombies.item.EpicPickaxeItem;
import net.mcreator.enragedzombies.item.EpicHoeItem;
import net.mcreator.enragedzombies.item.EpicEnragedItem;
import net.mcreator.enragedzombies.item.EpicAxeItem;
import net.mcreator.enragedzombies.item.EngiCoinItem;
import net.mcreator.enragedzombies.item.CommonSwordItem;
import net.mcreator.enragedzombies.item.CommonShovelItem;
import net.mcreator.enragedzombies.item.CommonPickaxeItem;
import net.mcreator.enragedzombies.item.CommonHoeItem;
import net.mcreator.enragedzombies.item.CommonEnragedItem;
import net.mcreator.enragedzombies.item.CommonAxeItem;
import net.mcreator.enragedzombies.EnragedZombiesMod;

public class EnragedZombiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EnragedZombiesMod.MODID);
	public static final RegistryObject<Item> ENRAGED_SPEED_SPAWN_EGG = REGISTRY.register("enraged_speed_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_SPEED, -10682368, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> ENRAGED_NORMAL_SPAWN_EGG = REGISTRY.register("enraged_normal_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_NORMAL, -10682368, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> ENRAGED_COIN = REGISTRY.register("enraged_coin", () -> new EngiCoinItem());
	public static final RegistryObject<Item> ENRAGED_BOOM_SPAWN_EGG = REGISTRY.register("enraged_boom_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.ENRAGED_BOOM, -10682368, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> B_ENRAGED_NORMAL_SPAWN_EGG = REGISTRY.register("b_enraged_normal_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.B_ENRAGED_NORMAL, -14933617, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> RARE_ENRAGED_HELMET = REGISTRY.register("rare_enraged_helmet", () -> new RareEnragedItem.Helmet());
	public static final RegistryObject<Item> RARE_ENRAGED_CHESTPLATE = REGISTRY.register("rare_enraged_chestplate", () -> new RareEnragedItem.Chestplate());
	public static final RegistryObject<Item> RARE_ENRAGED_LEGGINGS = REGISTRY.register("rare_enraged_leggings", () -> new RareEnragedItem.Leggings());
	public static final RegistryObject<Item> RARE_ENRAGED_BOOTS = REGISTRY.register("rare_enraged_boots", () -> new RareEnragedItem.Boots());
	public static final RegistryObject<Item> EPIC_ENRAGED_HELMET = REGISTRY.register("epic_enraged_helmet", () -> new EpicEnragedItem.Helmet());
	public static final RegistryObject<Item> EPIC_ENRAGED_CHESTPLATE = REGISTRY.register("epic_enraged_chestplate", () -> new EpicEnragedItem.Chestplate());
	public static final RegistryObject<Item> EPIC_ENRAGED_LEGGINGS = REGISTRY.register("epic_enraged_leggings", () -> new EpicEnragedItem.Leggings());
	public static final RegistryObject<Item> EPIC_ENRAGED_BOOTS = REGISTRY.register("epic_enraged_boots", () -> new EpicEnragedItem.Boots());
	public static final RegistryObject<Item> LEGENDARY_ENRAGED_HELMET = REGISTRY.register("legendary_enraged_helmet", () -> new LegendaryEnragedItem.Helmet());
	public static final RegistryObject<Item> LEGENDARY_ENRAGED_CHESTPLATE = REGISTRY.register("legendary_enraged_chestplate", () -> new LegendaryEnragedItem.Chestplate());
	public static final RegistryObject<Item> LEGENDARY_ENRAGED_LEGGINGS = REGISTRY.register("legendary_enraged_leggings", () -> new LegendaryEnragedItem.Leggings());
	public static final RegistryObject<Item> LEGENDARY_ENRAGED_BOOTS = REGISTRY.register("legendary_enraged_boots", () -> new LegendaryEnragedItem.Boots());
	public static final RegistryObject<Item> COMMON_ENRAGED_HELMET = REGISTRY.register("common_enraged_helmet", () -> new CommonEnragedItem.Helmet());
	public static final RegistryObject<Item> COMMON_ENRAGED_CHESTPLATE = REGISTRY.register("common_enraged_chestplate", () -> new CommonEnragedItem.Chestplate());
	public static final RegistryObject<Item> COMMON_ENRAGED_LEGGINGS = REGISTRY.register("common_enraged_leggings", () -> new CommonEnragedItem.Leggings());
	public static final RegistryObject<Item> COMMON_ENRAGED_BOOTS = REGISTRY.register("common_enraged_boots", () -> new CommonEnragedItem.Boots());
	public static final RegistryObject<Item> COMMON_SWORD = REGISTRY.register("common_sword", () -> new CommonSwordItem());
	public static final RegistryObject<Item> COMMON_PICKAXE = REGISTRY.register("common_pickaxe", () -> new CommonPickaxeItem());
	public static final RegistryObject<Item> COMMON_AXE = REGISTRY.register("common_axe", () -> new CommonAxeItem());
	public static final RegistryObject<Item> COMMON_SHOVEL = REGISTRY.register("common_shovel", () -> new CommonShovelItem());
	public static final RegistryObject<Item> COMMON_HOE = REGISTRY.register("common_hoe", () -> new CommonHoeItem());
	public static final RegistryObject<Item> UNCOMMON_SWORD = REGISTRY.register("uncommon_sword", () -> new UncommonSwordItem());
	public static final RegistryObject<Item> UNCOMMON_PICKAXE = REGISTRY.register("uncommon_pickaxe", () -> new UncommonPickaxeItem());
	public static final RegistryObject<Item> UNCOMMON_AXE = REGISTRY.register("uncommon_axe", () -> new UncommonAxeItem());
	public static final RegistryObject<Item> UNCOMMON_SHOVEL = REGISTRY.register("uncommon_shovel", () -> new UncommonShovelItem());
	public static final RegistryObject<Item> UNCOMMON_HOE = REGISTRY.register("uncommon_hoe", () -> new UncommonHoeItem());
	public static final RegistryObject<Item> UNCOMMON_ENRAGED_HELMET = REGISTRY.register("uncommon_enraged_helmet", () -> new UncommonEnragedItem.Helmet());
	public static final RegistryObject<Item> UNCOMMON_ENRAGED_CHESTPLATE = REGISTRY.register("uncommon_enraged_chestplate", () -> new UncommonEnragedItem.Chestplate());
	public static final RegistryObject<Item> UNCOMMON_ENRAGED_LEGGINGS = REGISTRY.register("uncommon_enraged_leggings", () -> new UncommonEnragedItem.Leggings());
	public static final RegistryObject<Item> UNCOMMON_ENRAGED_BOOTS = REGISTRY.register("uncommon_enraged_boots", () -> new UncommonEnragedItem.Boots());
	public static final RegistryObject<Item> RARE_SWORD = REGISTRY.register("rare_sword", () -> new RareSwordItem());
	public static final RegistryObject<Item> RARE_PICKAXE = REGISTRY.register("rare_pickaxe", () -> new RarePickaxeItem());
	public static final RegistryObject<Item> RARE_AXE = REGISTRY.register("rare_axe", () -> new RareAxeItem());
	public static final RegistryObject<Item> RARE_SHOVEL = REGISTRY.register("rare_shovel", () -> new RareShovelItem());
	public static final RegistryObject<Item> RARE_HOE = REGISTRY.register("rare_hoe", () -> new RareHoeItem());
	public static final RegistryObject<Item> EPIC_SWORD = REGISTRY.register("epic_sword", () -> new EpicSwordItem());
	public static final RegistryObject<Item> EPIC_PICKAXE = REGISTRY.register("epic_pickaxe", () -> new EpicPickaxeItem());
	public static final RegistryObject<Item> EPIC_AXE = REGISTRY.register("epic_axe", () -> new EpicAxeItem());
	public static final RegistryObject<Item> EPIC_SHOVEL = REGISTRY.register("epic_shovel", () -> new EpicShovelItem());
	public static final RegistryObject<Item> EPIC_HOE = REGISTRY.register("epic_hoe", () -> new EpicHoeItem());
	public static final RegistryObject<Item> LEGENDARY_SWORD = REGISTRY.register("legendary_sword", () -> new LegendarySwordItem());
	public static final RegistryObject<Item> LEGENDARY_PICKAXE = REGISTRY.register("legendary_pickaxe", () -> new LegendaryPickaxeItem());
	public static final RegistryObject<Item> LEGENDARY_AXE = REGISTRY.register("legendary_axe", () -> new LegendaryAxeItem());
	public static final RegistryObject<Item> LEGENDARY_SHOVEL = REGISTRY.register("legendary_shovel", () -> new LegendaryShovelItem());
	public static final RegistryObject<Item> LEGENDARY_HOE = REGISTRY.register("legendary_hoe", () -> new LegendaryHoeItem());
	public static final RegistryObject<Item> LEGENDARY_SPAWN_EGG = REGISTRY.register("legendary_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.LEGENDARY, -33504, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EPIC_SPAWN_EGG = REGISTRY.register("epic_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.EPIC, -12058470, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RARE_SPAWN_EGG = REGISTRY.register("rare_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.RARE, -13090319, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> UNCOMMON_SPAWN_EGG = REGISTRY.register("uncommon_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.UNCOMMON, -16541184, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> COMMON_SPAWN_EGG = REGISTRY.register("common_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.COMMON, -6908266, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> B_ENRAGED_BOOM_SPAWN_EGG = REGISTRY.register("b_enraged_boom_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.B_ENRAGED_BOOM, -14933617, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> MYTHIC_SWORD = REGISTRY.register("mythic_sword", () -> new MythicSwordItem());
	public static final RegistryObject<Item> MYTHIC_PICKAXE = REGISTRY.register("mythic_pickaxe", () -> new MythicPickaxeItem());
	public static final RegistryObject<Item> MYTHIC_AXE = REGISTRY.register("mythic_axe", () -> new MythicAxeItem());
	public static final RegistryObject<Item> MYTHIC_SHOVEL = REGISTRY.register("mythic_shovel", () -> new MythicShovelItem());
	public static final RegistryObject<Item> MYTHIC_HOE = REGISTRY.register("mythic_hoe", () -> new MythicHoeItem());
	public static final RegistryObject<Item> MYTHIC_ENRAGED_HELMET = REGISTRY.register("mythic_enraged_helmet", () -> new MythicEnragedItem.Helmet());
	public static final RegistryObject<Item> MYTHIC_ENRAGED_CHESTPLATE = REGISTRY.register("mythic_enraged_chestplate", () -> new MythicEnragedItem.Chestplate());
	public static final RegistryObject<Item> MYTHIC_ENRAGED_LEGGINGS = REGISTRY.register("mythic_enraged_leggings", () -> new MythicEnragedItem.Leggings());
	public static final RegistryObject<Item> MYTHIC_ENRAGED_BOOTS = REGISTRY.register("mythic_enraged_boots", () -> new MythicEnragedItem.Boots());
	public static final RegistryObject<Item> EXOTIC_ENRAGED_HELMET = REGISTRY.register("exotic_enraged_helmet", () -> new ExoticEnragedItem.Helmet());
	public static final RegistryObject<Item> EXOTIC_ENRAGED_CHESTPLATE = REGISTRY.register("exotic_enraged_chestplate", () -> new ExoticEnragedItem.Chestplate());
	public static final RegistryObject<Item> EXOTIC_ENRAGED_LEGGINGS = REGISTRY.register("exotic_enraged_leggings", () -> new ExoticEnragedItem.Leggings());
	public static final RegistryObject<Item> EXOTIC_ENRAGED_BOOTS = REGISTRY.register("exotic_enraged_boots", () -> new ExoticEnragedItem.Boots());
	public static final RegistryObject<Item> EXOTIC_SWORD = REGISTRY.register("exotic_sword", () -> new ExoticSwordItem());
	public static final RegistryObject<Item> EXOTIC_PICKAXE = REGISTRY.register("exotic_pickaxe", () -> new ExoticPickaxeItem());
	public static final RegistryObject<Item> EXOTIC_AXE = REGISTRY.register("exotic_axe", () -> new ExoticAxeItem());
	public static final RegistryObject<Item> EXOTIC_SHOVEL = REGISTRY.register("exotic_shovel", () -> new ExoticShovelItem());
	public static final RegistryObject<Item> EXOTIC_HOE = REGISTRY.register("exotic_hoe", () -> new ExoticHoeItem());
	public static final RegistryObject<Item> MYTHIC_SPAWN_EGG = REGISTRY.register("mythic_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.MYTHIC, -1310945, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> EXOTIC_SPAWN_EGG = REGISTRY.register("exotic_spawn_egg", () -> new ForgeSpawnEggItem(EnragedZombiesModEntities.EXOTIC, -14680117, -1522381, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> P_ENRAGED_NORMAL_SPAWN_EGG = REGISTRY.register("p_enraged_normal_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.P_ENRAGED_NORMAL, -13696931, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> P_ENRAGED_BOOM_SPAWN_EGG = REGISTRY.register("p_enraged_boom_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.P_ENRAGED_BOOM, -13696931, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> O_ENRAGED_NORMAL_SPAWN_EGG = REGISTRY.register("o_enraged_normal_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.O_ENRAGED_NORMAL, -16777216, -4627689, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> O_ENRAGED_BOOM_SPAWN_EGG = REGISTRY.register("o_enraged_boom_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.O_ENRAGED_BOOM, -16777216, -4627689, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> UNOBTAINIUM_ENRAGED_HELMET = REGISTRY.register("unobtainium_enraged_helmet", () -> new UnobtainiumEnragedItem.Helmet());
	public static final RegistryObject<Item> UNOBTAINIUM_ENRAGED_CHESTPLATE = REGISTRY.register("unobtainium_enraged_chestplate", () -> new UnobtainiumEnragedItem.Chestplate());
	public static final RegistryObject<Item> UNOBTAINIUM_ENRAGED_LEGGINGS = REGISTRY.register("unobtainium_enraged_leggings", () -> new UnobtainiumEnragedItem.Leggings());
	public static final RegistryObject<Item> UNOBTAINIUM_ENRAGED_BOOTS = REGISTRY.register("unobtainium_enraged_boots", () -> new UnobtainiumEnragedItem.Boots());
	public static final RegistryObject<Item> UNOBTAINIUM_SWORD = REGISTRY.register("unobtainium_sword", () -> new UnobtainiumSwordItem());
	public static final RegistryObject<Item> UNOBTAINIUM_PICKAXE = REGISTRY.register("unobtainium_pickaxe", () -> new UnobtainiumPickaxeItem());
	public static final RegistryObject<Item> UNOBTAINIUM_AXE = REGISTRY.register("unobtainium_axe", () -> new UnobtainiumAxeItem());
	public static final RegistryObject<Item> UNOBTAINIUM_SHOVEL = REGISTRY.register("unobtainium_shovel", () -> new UnobtainiumShovelItem());
	public static final RegistryObject<Item> UNOBTAINIUM_HOE = REGISTRY.register("unobtainium_hoe", () -> new UnobtainiumHoeItem());
	public static final RegistryObject<Item> DEEPSLATE_UNOBTAINIUM_ORE = block(EnragedZombiesModBlocks.DEEPSLATE_UNOBTAINIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> UNOBTAINIUM_ORE = block(EnragedZombiesModBlocks.UNOBTAINIUM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> B_ENRAGED_SPEED_SPAWN_EGG = REGISTRY.register("b_enraged_speed_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.B_ENRAGED_SPEED, -14933617, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> P_ENRAGED_SPEED_SPAWN_EGG = REGISTRY.register("p_enraged_speed_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.P_ENRAGED_SPEED, -13696931, -16777216, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));
	public static final RegistryObject<Item> O_ENRAGED_SPEED_SPAWN_EGG = REGISTRY.register("o_enraged_speed_spawn_egg",
			() -> new ForgeSpawnEggItem(EnragedZombiesModEntities.O_ENRAGED_SPEED, -16777216, -4627689, new Item.Properties().tab(EnragedZombiesModTabs.TAB_ENRAGED_ZOMBIES)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
