
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedSpeed6Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedSpeed6Renderer extends MobRenderer<EnragedSpeed6Entity, Modelenragedzombie<EnragedSpeed6Entity>> {
	public EnragedSpeed6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed6Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedspeed6.png");
	}
}
