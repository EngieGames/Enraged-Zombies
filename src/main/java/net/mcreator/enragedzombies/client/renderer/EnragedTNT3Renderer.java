
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNT3Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNT3Renderer extends MobRenderer<EnragedTNT3Entity, Modelenragedzombie<EnragedTNT3Entity>> {
	public EnragedTNT3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT3Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom3.png");
	}
}
