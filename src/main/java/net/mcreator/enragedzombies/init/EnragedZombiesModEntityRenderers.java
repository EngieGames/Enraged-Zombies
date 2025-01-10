
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.enragedzombies.client.renderer.UncommonEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.RareEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.MythicEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.LegendaryEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.ExoticEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.EpicEngieRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNTRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT9Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT8Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT7Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT6Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT5Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT4Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT3Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedTNT2Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeedRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed9Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed8Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed7Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed6Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed5Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed4Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed3Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedSpeed2Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormalRenderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal9Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal8Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal7Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal6Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal5Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal4Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal3Renderer;
import net.mcreator.enragedzombies.client.renderer.EnragedNormal2Renderer;
import net.mcreator.enragedzombies.client.renderer.CommonEngieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EnragedZombiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL.get(), EnragedNormalRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT.get(), EnragedTNTRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED.get(), EnragedSpeedRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_2.get(), EnragedNormal2Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_2.get(), EnragedTNT2Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_2.get(), EnragedSpeed2Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_3.get(), EnragedNormal3Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_3.get(), EnragedTNT3Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_3.get(), EnragedSpeed3Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_4.get(), EnragedNormal4Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_4.get(), EnragedTNT4Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_4.get(), EnragedSpeed4Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_5.get(), EnragedNormal5Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_5.get(), EnragedTNT5Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_5.get(), EnragedSpeed5Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_6.get(), EnragedNormal6Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_6.get(), EnragedTNT6Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_6.get(), EnragedSpeed6Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_7.get(), EnragedNormal7Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_7.get(), EnragedTNT7Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_7.get(), EnragedSpeed7Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_8.get(), EnragedNormal8Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_8.get(), EnragedTNT8Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_8.get(), EnragedSpeed8Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_NORMAL_9.get(), EnragedNormal9Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_TNT_9.get(), EnragedTNT9Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.ENRAGED_SPEED_9.get(), EnragedSpeed9Renderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.COMMON_ENGIE.get(), CommonEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.UNCOMMON_ENGIE.get(), UncommonEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.RARE_ENGIE.get(), RareEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.EPIC_ENGIE.get(), EpicEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.LEGENDARY_ENGIE.get(), LegendaryEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.MYTHIC_ENGIE.get(), MythicEngieRenderer::new);
		event.registerEntityRenderer(EnragedZombiesModEntities.EXOTIC_ENGIE.get(), ExoticEngieRenderer::new);
	}
}
