
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enragedzombies.client.renderer.UncommonRenderer;
import net.mcreator.enragedzombies.client.renderer.RareRenderer;
import net.mcreator.enragedzombies.client.renderer.PEnragedSpeedRenderer;
import net.mcreator.enragedzombies.client.renderer.PEnragedNormalRenderer;
import net.mcreator.enragedzombies.client.renderer.PEnragedBoomRenderer;
import net.mcreator.enragedzombies.client.renderer.OEnragedSpeedRenderer;
import net.mcreator.enragedzombies.client.renderer.OEnragedNormalRenderer;
import net.mcreator.enragedzombies.client.renderer.OEnragedBoomRenderer;
import net.mcreator.enragedzombies.client.renderer.MythicRenderer;
import net.mcreator.enragedzombies.client.renderer.LegendaryRenderer;
import net.mcreator.enragedzombies.client.renderer.ExoticRenderer;
import net.mcreator.enragedzombies.client.renderer.EpicRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeedRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormalRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedBoomRenderer;
import net.mcreator.enragedzombies.client.renderer.CommonRenderer;
import net.mcreator.enragedzombies.client.renderer.BEnragedSpeedRenderer;
import net.mcreator.enragedzombies.client.renderer.BEnragedNormalRenderer;
import net.mcreator.enragedzombies.client.renderer.BEnragedBoomRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnragedZombiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED.get(), EnragedSpeedRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL.get(), EnragedNormalRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_BOOM.get(), EnragedBoomRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.B_ENRAGED_NORMAL.get(), BEnragedNormalRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.LEGENDARY.get(), LegendaryRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.EPIC.get(), EpicRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.RARE.get(), RareRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.UNCOMMON.get(), UncommonRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.COMMON.get(), CommonRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.B_ENRAGED_BOOM.get(), BEnragedBoomRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.MYTHIC.get(), MythicRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.EXOTIC.get(), ExoticRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.P_ENRAGED_NORMAL.get(), PEnragedNormalRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.P_ENRAGED_BOOM.get(), PEnragedBoomRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.O_ENRAGED_NORMAL.get(), OEnragedNormalRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.O_ENRAGED_BOOM.get(), OEnragedBoomRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.B_ENRAGED_SPEED.get(), BEnragedSpeedRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.P_ENRAGED_SPEED.get(), PEnragedSpeedRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.O_ENRAGED_SPEED.get(), OEnragedSpeedRenderer::new);
	}
}
