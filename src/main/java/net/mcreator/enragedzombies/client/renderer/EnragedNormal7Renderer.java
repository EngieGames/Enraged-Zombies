
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal7Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal7Renderer extends MobRenderer<EnragedNormal7Entity, Modelenragedzombie<EnragedNormal7Entity>> {
	public EnragedNormal7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal7Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal7.png");
	}
}
