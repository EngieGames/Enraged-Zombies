
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.enragedzombies.entity.PEnragedSpeedEntity;

public class PEnragedSpeedRenderer extends HumanoidMobRenderer<PEnragedSpeedEntity, HumanoidModel<PEnragedSpeedEntity>> {
	public PEnragedSpeedRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(PEnragedSpeedEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/purple.png");
	}
}
