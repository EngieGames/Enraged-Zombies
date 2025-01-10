
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal8Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal8Renderer extends MobRenderer<EnragedNormal8Entity, Modelenragedzombie<EnragedNormal8Entity>> {
	public EnragedNormal8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal8Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal8.png");
	}
}
