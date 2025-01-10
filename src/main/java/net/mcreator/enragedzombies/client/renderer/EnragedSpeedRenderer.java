
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedSpeedEntity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedSpeedRenderer extends MobRenderer<EnragedSpeedEntity, Modelenragedzombie<EnragedSpeedEntity>> {
	public EnragedSpeedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeedEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedspeed.png");
	}
}
