
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.OEnragedBoomEntity;
import net.mcreator.enragedzombies.client.model.Modelenraged_boom;

public class OEnragedBoomRenderer extends MobRenderer<OEnragedBoomEntity, Modelenraged_boom<OEnragedBoomEntity>> {
	public OEnragedBoomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_boom(context.bakeLayer(Modelenraged_boom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OEnragedBoomEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/orangeboom.png");
	}
}
