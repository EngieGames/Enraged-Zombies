package net.mcreator.enragedzombies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.enragedzombies.init.EnragedZombiesModEntities;
import net.mcreator.enragedzombies.entity.EnragedTNTEntity;
import net.mcreator.enragedzombies.entity.EnragedTNT9Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT8Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT7Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT6Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT5Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT4Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT3Entity;
import net.mcreator.enragedzombies.entity.EnragedTNT2Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeedEntity;
import net.mcreator.enragedzombies.entity.EnragedSpeed9Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed8Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed7Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed6Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed5Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed4Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed3Entity;
import net.mcreator.enragedzombies.entity.EnragedSpeed2Entity;
import net.mcreator.enragedzombies.entity.EnragedNormalEntity;
import net.mcreator.enragedzombies.entity.EnragedNormal9Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal8Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal7Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal6Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal5Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal4Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal3Entity;
import net.mcreator.enragedzombies.entity.EnragedNormal2Entity;

public class MutationChanceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (entity instanceof EnragedNormalEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal2Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal3Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal4Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal5Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal6Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal7Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal8Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal9Entity(EnragedZombiesModEntities.ENRAGED_NORMAL_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedTNTEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT2Entity(EnragedZombiesModEntities.ENRAGED_TNT_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT3Entity(EnragedZombiesModEntities.ENRAGED_TNT_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT4Entity(EnragedZombiesModEntities.ENRAGED_TNT_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT5Entity(EnragedZombiesModEntities.ENRAGED_TNT_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT6Entity(EnragedZombiesModEntities.ENRAGED_TNT_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT7Entity(EnragedZombiesModEntities.ENRAGED_TNT_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT8Entity(EnragedZombiesModEntities.ENRAGED_TNT_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT9Entity(EnragedZombiesModEntities.ENRAGED_TNT_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedSpeedEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed2Entity(EnragedZombiesModEntities.ENRAGED_SPEED_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed3Entity(EnragedZombiesModEntities.ENRAGED_SPEED_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed4Entity(EnragedZombiesModEntities.ENRAGED_SPEED_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed5Entity(EnragedZombiesModEntities.ENRAGED_SPEED_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed6Entity(EnragedZombiesModEntities.ENRAGED_SPEED_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed7Entity(EnragedZombiesModEntities.ENRAGED_SPEED_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed8Entity(EnragedZombiesModEntities.ENRAGED_SPEED_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed9Entity(EnragedZombiesModEntities.ENRAGED_SPEED_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
	}
}
