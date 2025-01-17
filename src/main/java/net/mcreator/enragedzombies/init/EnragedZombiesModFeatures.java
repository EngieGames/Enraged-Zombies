
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.enragedzombies.world.features.ores.UnobtainiumOreFeature;
import net.mcreator.enragedzombies.EnragedZombiesMod;

@Mod.EventBusSubscriber
public class EnragedZombiesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EnragedZombiesMod.MODID);
	public static final RegistryObject<Feature<?>> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", UnobtainiumOreFeature::feature);
}
