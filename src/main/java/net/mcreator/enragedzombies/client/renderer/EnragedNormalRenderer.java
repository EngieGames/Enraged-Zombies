
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormalEntity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormalRenderer extends MobRenderer<EnragedNormalEntity, Modelenragedzombie<EnragedNormalEntity>> {
	public EnragedNormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormalEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal.png");
	}
}
