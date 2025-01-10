
package net.mcreator.enragedzombies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.enragedzombies.entity.EnragedNormal6Entity;
import net.mcreator.enragedzombies.client.model.Modelenragedzombie;

public class EnragedNormal6Renderer extends MobRenderer<EnragedNormal6Entity, Modelenragedzombie<EnragedNormal6Entity>> {
	public EnragedNormal6Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal6Entity entity) {
		return new ResourceLocation("enraged_zombies:textures/entities/enragednormal6.png");
	}
}
