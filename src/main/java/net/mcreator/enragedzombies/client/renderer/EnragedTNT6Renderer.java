
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNT6Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNT6Renderer extends MobRenderer<EnragedTNT6Entity, Modelenragedzombie<EnragedTNT6Entity>> {
	public EnragedTNT6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT6Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom6.png");
	}
}
