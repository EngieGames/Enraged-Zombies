
package net.mcreator.enragedzombies.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.enragedzombies.init.EnragedZombiesModItems;
import net.mcreator.enragedzombies.init.EnragedZombiesModEntities;

public class PEnragedNormalEntity extends Monster {
	public PEnragedNormalEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EnragedZombiesModEntities.P_ENRAGED_NORMAL.get(), world);
	}

	public PEnragedNormalEntity(EntityType<PEnragedNormalEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 5;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (PEnragedNormalEntity.this.isInWater())
					PEnragedNormalEntity.this.setDeltaMovement(PEnragedNormalEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !PEnragedNormalEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - PEnragedNormalEntity.this.getX();
					double dy = this.wantedY - PEnragedNormalEntity.this.getY();
					double dz = this.wantedZ - PEnragedNormalEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * PEnragedNormalEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					PEnragedNormalEntity.this.setYRot(this.rotlerp(PEnragedNormalEntity.this.getYRot(), f, 10));
					PEnragedNormalEntity.this.yBodyRot = PEnragedNormalEntity.this.getYRot();
					PEnragedNormalEntity.this.yHeadRot = PEnragedNormalEntity.this.getYRot();
					if (PEnragedNormalEntity.this.isInWater()) {
						PEnragedNormalEntity.this.setSpeed((float) PEnragedNormalEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						PEnragedNormalEntity.this.setXRot(this.rotlerp(PEnragedNormalEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(PEnragedNormalEntity.this.getXRot() * (float) (Math.PI / 180.0));
						PEnragedNormalEntity.this.setZza(f3 * f1);
						PEnragedNormalEntity.this.setYya((float) (f1 * dy));
					} else {
						PEnragedNormalEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					PEnragedNormalEntity.this.setSpeed(0);
					PEnragedNormalEntity.this.setYya(0);
					PEnragedNormalEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, CommonEntity.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, UncommonEntity.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, RareEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EpicEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LegendaryEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MythicEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ExoticEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Villager.class, false, false));
		this.goalSelector.addGoal(11, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(12, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(13, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(15, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(16, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(EnragedZombiesModItems.ENRAGED_COIN.get()));
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.husk.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.husk.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.husk.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.husk.death"));
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
		SpawnPlacements.register(EnragedZombiesModEntities.P_ENRAGED_NORMAL.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.25);
		return builder;
	}
}
