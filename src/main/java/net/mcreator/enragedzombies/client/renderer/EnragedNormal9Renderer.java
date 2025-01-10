
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal9Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal9Renderer extends MobRenderer<EnragedNormal9Entity, Modelenragedzombie<EnragedNormal9Entity>> {
	public EnragedNormal9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal9Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal9.png");
	}
}
