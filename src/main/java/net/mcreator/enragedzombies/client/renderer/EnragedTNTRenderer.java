
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedTNTEntity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedTNTRenderer extends MobRenderer<EnragedTNTEntity, Modelenragedzombie<EnragedTNTEntity>> {
	public EnragedTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNTEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragedboom.png");
	}
}
