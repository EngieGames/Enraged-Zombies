
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNT4Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNT4Renderer extends MobRenderer<EnragedTNT4Entity, Modelenragedzombie<EnragedTNT4Entity>> {
	public EnragedTNT4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT4Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom4.png");
	}
}
