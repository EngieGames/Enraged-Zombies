
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedSpeed4Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedSpeed4Renderer extends MobRenderer<EnragedSpeed4Entity, Modelenragedzombie<EnragedSpeed4Entity>> {
	public EnragedSpeed4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed4Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedspeed4.png");
	}
}
