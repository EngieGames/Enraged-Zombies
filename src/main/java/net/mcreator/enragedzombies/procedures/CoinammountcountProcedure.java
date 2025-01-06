package net.mcreator.enragedzombies.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.enragedzombies.network.EnragedZombiesModVariables;

public class CoinammountcountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(EnragedZombiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EnragedZombiesModVariables.PlayerVariables())).coincount);
	}
}
