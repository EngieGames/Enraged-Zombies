
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal2Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal2Renderer extends MobRenderer<EnragedNormal2Entity, Modelenragedzombie<EnragedNormal2Entity>> {
	public EnragedNormal2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal2Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal2.png");
	}
}