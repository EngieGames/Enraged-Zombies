
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal3Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal3Renderer extends MobRenderer<EnragedNormal3Entity, Modelenragedzombie<EnragedNormal3Entity>> {
	public EnragedNormal3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal3Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal3.png");
	}
}
