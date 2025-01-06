
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.enragedzombies.block.UnobtainiumOreBlock;
import net.mcreator.enragedzombies.block.DeepslateUnobtainiumOreBlock;
import net.mcreator.enragedzombies.EnragedZombiesMod;

public class EnragedZombiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EnragedZombiesMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_UNOBTAINIUM_ORE = REGISTRY.register("deepslate_unobtainium_ore", () -> new DeepslateUnobtainiumOreBlock());
	public static final RegistryObject<Block> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", () -> new UnobtainiumOreBlock());
}
