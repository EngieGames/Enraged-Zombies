
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enragedzombies.client.model.Modelenraged_boomH;
import net.mcreator.enragedzombies.client.model.Modelenraged_boom;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class EnragedZombiesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelenraged_boom.LAYER_LOCATION, Modelenraged_boom::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_boomH.LAYER_LOCATION, Modelenraged_boomH::createBodyLayer);
	}
}
