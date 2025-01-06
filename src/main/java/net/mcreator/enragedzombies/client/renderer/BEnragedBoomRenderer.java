
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.BEnragedBoomEntity;
import net.mcreator.enragedzombies.client.model.Modelenraged_boomH;

public class BEnragedBoomRenderer extends MobRenderer<BEnragedBoomEntity, Modelenraged_boomH<BEnragedBoomEntity>> {
	public BEnragedBoomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_boomH(context.bakeLayer(Modelenraged_boomH.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BEnragedBoomEntity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/blueboomh.png");
	}
}
