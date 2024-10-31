package net.mcreator.enragedzombies.procedures;

import net.minecraft.world.entity.Entity;

public class EnragedBoomEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon minecraft:tnt ~ ~ ~ {Fuse:0}");
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p enraged_zombies:enraged_coin 1");
		}
	}
}
