
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal4Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal4Renderer extends MobRenderer<EnragedNormal4Entity, Modelenragedzombie<EnragedNormal4Entity>> {
	public EnragedNormal4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal4Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal4.png");
	}
}
