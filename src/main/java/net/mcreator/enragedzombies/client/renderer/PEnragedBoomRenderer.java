
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.PEnragedBoomEntity;
import net.mcreator.enragedzombies.client.model.Modelenraged_boom;

public class PEnragedBoomRenderer extends MobRenderer<PEnragedBoomEntity, Modelenraged_boom<PEnragedBoomEntity>> {
	public PEnragedBoomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_boom(context.bakeLayer(Modelenraged_boom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PEnragedBoomEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/purpleboom.png");
	}
}
