
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnragedZombiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelenragedzombie.LAYER_LOCATION, Modelenragedzombie::createBodyLayer);
	}
}
