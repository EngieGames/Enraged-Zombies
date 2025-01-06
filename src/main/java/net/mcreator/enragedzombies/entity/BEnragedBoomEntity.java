
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

import net.mcreator.enragedzombies.procedures.EnragedBoomEntityDiesProcedure;
import net.mcreator.enragedzombies.init.EnragedZombiesModEntities;

public class BEnragedBoomEntity extends Monster {
	public BEnragedBoomEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(EnragedZombiesModEntities.B_ENRAGED_BOOM.get(), world);
	}

	public BEnragedBoomEntity(EntityType<BEnragedBoomEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 15;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BEnragedBoomEntity.this.isInWater())
					BEnragedBoomEntity.this.setDeltaMovement(BEnragedBoomEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !BEnragedBoomEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BEnragedBoomEntity.this.getX();
					double dy = this.wantedY - BEnragedBoomEntity.this.getY();
					double dz = this.wantedZ - BEnragedBoomEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BEnragedBoomEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					BEnragedBoomEntity.this.setYRot(this.rotlerp(BEnragedBoomEntity.this.getYRot(), f, 10));
					BEnragedBoomEntity.this.yBodyRot = BEnragedBoomEntity.this.getYRot();
					BEnragedBoomEntity.this.yHeadRot = BEnragedBoomEntity.this.getYRot();
					if (BEnragedBoomEntity.this.isInWater()) {
						BEnragedBoomEntity.this.setSpeed((float) BEnragedBoomEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BEnragedBoomEntity.this.setXRot(this.rotlerp(BEnragedBoomEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BEnragedBoomEntity.this.getXRot() * (float) (Math.PI / 180.0));
						BEnragedBoomEntity.this.setZza(f3 * f1);
						BEnragedBoomEntity.this.setYya((float) (f1 * dy));
					} else {
						BEnragedBoomEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BEnragedBoomEntity.this.setSpeed(0);
					BEnragedBoomEntity.this.setYya(0);
					BEnragedBoomEntity.this.setZza(0);
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
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.drowned.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.drowned.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.drowned.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.drowned.death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		EnragedBoomEntityDiesProcedure.execute(this);
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
		SpawnPlacements.register(EnragedZombiesModEntities.B_ENRAGED_BOOM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.25);
		return builder;
	}
}
