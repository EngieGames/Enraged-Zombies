
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNT5Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNT5Renderer extends MobRenderer<EnragedTNT5Entity, Modelenragedzombie<EnragedTNT5Entity>> {
	public EnragedTNT5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT5Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom5.png");
	}
}
