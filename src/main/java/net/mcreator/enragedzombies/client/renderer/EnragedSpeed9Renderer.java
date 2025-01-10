
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedSpeed9Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedSpeed9Renderer extends MobRenderer<EnragedSpeed9Entity, Modelenragedzombie<EnragedSpeed9Entity>> {
	public EnragedSpeed9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed9Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedspeed9.png");
	}
}
