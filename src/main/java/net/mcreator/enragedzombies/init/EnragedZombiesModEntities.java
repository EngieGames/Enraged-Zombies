
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enragedzombies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.enragedzombies.entity.UncommonEntity;
import net.mcreator.enragedzombies.entity.RareEntity;
import net.mcreator.enragedzombies.entity.PEnragedSpeedEntity;
import net.mcreator.enragedzombies.entity.PEnragedNormalEntity;
import net.mcreator.enragedzombies.entity.PEnragedBoomEntity;
import net.mcreator.enragedzombies.entity.OEnragedSpeedEntity;
import net.mcreator.enragedzombies.entity.OEnragedNormalEntity;
import net.mcreator.enragedzombies.entity.OEnragedBoomEntity;
import net.mcreator.enragedzombies.entity.MythicEntity;
import net.mcreator.enragedzombies.entity.LegendaryEntity;
import net.mcreator.enragedzombies.entity.ExoticEntity;
import net.mcreator.enragedzombies.entity.EpicEntity;
import net.mcreator.enragedzombies.entity.EnragedSpeedEntity;
import net.mcreator.enragedzombies.entity.EnragedNormalEntity;
import net.mcreator.enragedzombies.entity.EnragedBoomEntity;
import net.mcreator.enragedzombies.entity.CommonEntity;
import net.mcreator.enragedzombies.entity.BEnragedSpeedEntity;
import net.mcreator.enragedzombies.entity.BEnragedNormalEntity;
import net.mcreator.enragedzombies.entity.BEnragedBoomEntity;
import net.mcreator.enragedzombies.EnragedZombiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnragedZombiesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EnragedZombiesMod.MODID);
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedBoomEntity>> ENRAGED_BOOM = register("enraged_boom",
			EntityType.Builder.<EnragedBoomEntity>of(EnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedBoomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BEnragedNormalEntity>> B_ENRAGED_NORMAL = register("b_enraged_normal",
			EntityType.Builder.<BEnragedNormalEntity>of(BEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BEnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendaryEntity>> LEGENDARY = register("legendary",
			EntityType.Builder.<LegendaryEntity>of(LegendaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<EpicEntity>> EPIC = register("epic",
			EntityType.Builder.<EpicEntity>of(EpicEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<RareEntity>> RARE = register("rare",
			EntityType.Builder.<RareEntity>of(RareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<UncommonEntity>> UNCOMMON = register("uncommon",
			EntityType.Builder.<UncommonEntity>of(UncommonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<CommonEntity>> COMMON = register("common",
			EntityType.Builder.<CommonEntity>of(CommonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<BEnragedBoomEntity>> B_ENRAGED_BOOM = register("b_enraged_boom",
			EntityType.Builder.<BEnragedBoomEntity>of(BEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BEnragedBoomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicEntity>> MYTHIC = register("mythic",
			EntityType.Builder.<MythicEntity>of(MythicEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ExoticEntity>> EXOTIC = register("exotic",
			EntityType.Builder.<ExoticEntity>of(ExoticEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<PEnragedNormalEntity>> P_ENRAGED_NORMAL = register("p_enraged_normal",
			EntityType.Builder.<PEnragedNormalEntity>of(PEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PEnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PEnragedBoomEntity>> P_ENRAGED_BOOM = register("p_enraged_boom",
			EntityType.Builder.<PEnragedBoomEntity>of(PEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PEnragedBoomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OEnragedNormalEntity>> O_ENRAGED_NORMAL = register("o_enraged_normal",
			EntityType.Builder.<OEnragedNormalEntity>of(OEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OEnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OEnragedBoomEntity>> O_ENRAGED_BOOM = register("o_enraged_boom",
			EntityType.Builder.<OEnragedBoomEntity>of(OEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OEnragedBoomEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BEnragedSpeedEntity>> B_ENRAGED_SPEED = register("b_enraged_speed",
			EntityType.Builder.<BEnragedSpeedEntity>of(BEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BEnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PEnragedSpeedEntity>> P_ENRAGED_SPEED = register("p_enraged_speed",
			EntityType.Builder.<PEnragedSpeedEntity>of(PEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PEnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OEnragedSpeedEntity>> O_ENRAGED_SPEED = register("o_enraged_speed",
			EntityType.Builder.<OEnragedSpeedEntity>of(OEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OEnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnragedSpeedEntity.init();
			EnragedNormalEntity.init();
			EnragedBoomEntity.init();
			BEnragedNormalEntity.init();
			LegendaryEntity.init();
			EpicEntity.init();
			RareEntity.init();
			UncommonEntity.init();
			CommonEntity.init();
			BEnragedBoomEntity.init();
			MythicEntity.init();
			ExoticEntity.init();
			PEnragedNormalEntity.init();
			PEnragedBoomEntity.init();
			OEnragedNormalEntity.init();
			OEnragedBoomEntity.init();
			BEnragedSpeedEntity.init();
			PEnragedSpeedEntity.init();
			OEnragedSpeedEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_BOOM.get(), EnragedBoomEntity.createAttributes().build());
		event.put(B_ENRAGED_NORMAL.get(), BEnragedNormalEntity.createAttributes().build());
		event.put(LEGENDARY.get(), LegendaryEntity.createAttributes().build());
		event.put(EPIC.get(), EpicEntity.createAttributes().build());
		event.put(RARE.get(), RareEntity.createAttributes().build());
		event.put(UNCOMMON.get(), UncommonEntity.createAttributes().build());
		event.put(COMMON.get(), CommonEntity.createAttributes().build());
		event.put(B_ENRAGED_BOOM.get(), BEnragedBoomEntity.createAttributes().build());
		event.put(MYTHIC.get(), MythicEntity.createAttributes().build());
		event.put(EXOTIC.get(), ExoticEntity.createAttributes().build());
		event.put(P_ENRAGED_NORMAL.get(), PEnragedNormalEntity.createAttributes().build());
		event.put(P_ENRAGED_BOOM.get(), PEnragedBoomEntity.createAttributes().build());
		event.put(O_ENRAGED_NORMAL.get(), OEnragedNormalEntity.createAttributes().build());
		event.put(O_ENRAGED_BOOM.get(), OEnragedBoomEntity.createAttributes().build());
		event.put(B_ENRAGED_SPEED.get(), BEnragedSpeedEntity.createAttributes().build());
		event.put(P_ENRAGED_SPEED.get(), PEnragedSpeedEntity.createAttributes().build());
		event.put(O_ENRAGED_SPEED.get(), OEnragedSpeedEntity.createAttributes().build());
	}
}
