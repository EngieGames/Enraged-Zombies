
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNT2Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNT2Renderer extends MobRenderer<EnragedTNT2Entity, Modelenragedzombie<EnragedTNT2Entity>> {
	public EnragedTNT2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT2Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom2.png");
	}
}
