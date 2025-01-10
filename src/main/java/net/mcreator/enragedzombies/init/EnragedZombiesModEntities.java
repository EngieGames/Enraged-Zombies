
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

import net.mcreator.enragedzombies.entity.UncommonEngieEntity;
import net.mcreator.enragedzombies.entity.RareEngieEntity;
import net.mcreator.enragedzombies.entity.MythicEngieEntity;
import net.mcreator.enragedzombies.entity.LegendaryEngieEntity;
import net.mcreator.enragedzombies.entity.ExoticEngieEntity;
import net.mcreator.enragedzombies.entity.EpicEngieEntity;
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
import net.mcreator.enragedzombies.entity.CommonEngieEntity;
import net.mcreator.enragedzombies.EnragedZombiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EnragedZombiesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EnragedZombiesMod.MODID);
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNTEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal2Entity>> ENRAGED_NORMAL_2 = register("enraged_normal_2",
			EntityType.Builder.<EnragedNormal2Entity>of(EnragedNormal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT2Entity>> ENRAGED_TNT_2 = register("enraged_tnt_2",
			EntityType.Builder.<EnragedTNT2Entity>of(EnragedTNT2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed2Entity>> ENRAGED_SPEED_2 = register("enraged_speed_2",
			EntityType.Builder.<EnragedSpeed2Entity>of(EnragedSpeed2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal3Entity>> ENRAGED_NORMAL_3 = register("enraged_normal_3",
			EntityType.Builder.<EnragedNormal3Entity>of(EnragedNormal3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT3Entity>> ENRAGED_TNT_3 = register("enraged_tnt_3",
			EntityType.Builder.<EnragedTNT3Entity>of(EnragedTNT3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed3Entity>> ENRAGED_SPEED_3 = register("enraged_speed_3",
			EntityType.Builder.<EnragedSpeed3Entity>of(EnragedSpeed3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal4Entity>> ENRAGED_NORMAL_4 = register("enraged_normal_4",
			EntityType.Builder.<EnragedNormal4Entity>of(EnragedNormal4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT4Entity>> ENRAGED_TNT_4 = register("enraged_tnt_4",
			EntityType.Builder.<EnragedTNT4Entity>of(EnragedTNT4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed4Entity>> ENRAGED_SPEED_4 = register("enraged_speed_4",
			EntityType.Builder.<EnragedSpeed4Entity>of(EnragedSpeed4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal5Entity>> ENRAGED_NORMAL_5 = register("enraged_normal_5",
			EntityType.Builder.<EnragedNormal5Entity>of(EnragedNormal5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT5Entity>> ENRAGED_TNT_5 = register("enraged_tnt_5",
			EntityType.Builder.<EnragedTNT5Entity>of(EnragedTNT5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed5Entity>> ENRAGED_SPEED_5 = register("enraged_speed_5",
			EntityType.Builder.<EnragedSpeed5Entity>of(EnragedSpeed5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal6Entity>> ENRAGED_NORMAL_6 = register("enraged_normal_6",
			EntityType.Builder.<EnragedNormal6Entity>of(EnragedNormal6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT6Entity>> ENRAGED_TNT_6 = register("enraged_tnt_6",
			EntityType.Builder.<EnragedTNT6Entity>of(EnragedTNT6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed6Entity>> ENRAGED_SPEED_6 = register("enraged_speed_6",
			EntityType.Builder.<EnragedSpeed6Entity>of(EnragedSpeed6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal7Entity>> ENRAGED_NORMAL_7 = register("enraged_normal_7",
			EntityType.Builder.<EnragedNormal7Entity>of(EnragedNormal7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT7Entity>> ENRAGED_TNT_7 = register("enraged_tnt_7",
			EntityType.Builder.<EnragedTNT7Entity>of(EnragedTNT7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed7Entity>> ENRAGED_SPEED_7 = register("enraged_speed_7",
			EntityType.Builder.<EnragedSpeed7Entity>of(EnragedSpeed7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal8Entity>> ENRAGED_NORMAL_8 = register("enraged_normal_8",
			EntityType.Builder.<EnragedNormal8Entity>of(EnragedNormal8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT8Entity>> ENRAGED_TNT_8 = register("enraged_tnt_8",
			EntityType.Builder.<EnragedTNT8Entity>of(EnragedTNT8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed8Entity>> ENRAGED_SPEED_8 = register("enraged_speed_8",
			EntityType.Builder.<EnragedSpeed8Entity>of(EnragedSpeed8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal9Entity>> ENRAGED_NORMAL_9 = register("enraged_normal_9",
			EntityType.Builder.<EnragedNormal9Entity>of(EnragedNormal9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT9Entity>> ENRAGED_TNT_9 = register("enraged_tnt_9",
			EntityType.Builder.<EnragedTNT9Entity>of(EnragedTNT9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed9Entity>> ENRAGED_SPEED_9 = register("enraged_speed_9",
			EntityType.Builder.<EnragedSpeed9Entity>of(EnragedSpeed9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEngieEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EnragedNormalEntity.init();
			EnragedTNTEntity.init();
			EnragedSpeedEntity.init();
			EnragedNormal2Entity.init();
			EnragedTNT2Entity.init();
			EnragedSpeed2Entity.init();
			EnragedNormal3Entity.init();
			EnragedTNT3Entity.init();
			EnragedSpeed3Entity.init();
			EnragedNormal4Entity.init();
			EnragedTNT4Entity.init();
			EnragedSpeed4Entity.init();
			EnragedNormal5Entity.init();
			EnragedTNT5Entity.init();
			EnragedSpeed5Entity.init();
			EnragedNormal6Entity.init();
			EnragedTNT6Entity.init();
			EnragedSpeed6Entity.init();
			EnragedNormal7Entity.init();
			EnragedTNT7Entity.init();
			EnragedSpeed7Entity.init();
			EnragedNormal8Entity.init();
			EnragedTNT8Entity.init();
			EnragedSpeed8Entity.init();
			EnragedNormal9Entity.init();
			EnragedTNT9Entity.init();
			EnragedSpeed9Entity.init();
			CommonEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_TNT.get(), EnragedTNTEntity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL_2.get(), EnragedNormal2Entity.createAttributes().build());
		event.put(ENRAGED_TNT_2.get(), EnragedTNT2Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_2.get(), EnragedSpeed2Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_3.get(), EnragedNormal3Entity.createAttributes().build());
		event.put(ENRAGED_TNT_3.get(), EnragedTNT3Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_3.get(), EnragedSpeed3Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_4.get(), EnragedNormal4Entity.createAttributes().build());
		event.put(ENRAGED_TNT_4.get(), EnragedTNT4Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_4.get(), EnragedSpeed4Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_5.get(), EnragedNormal5Entity.createAttributes().build());
		event.put(ENRAGED_TNT_5.get(), EnragedTNT5Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_5.get(), EnragedSpeed5Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_6.get(), EnragedNormal6Entity.createAttributes().build());
		event.put(ENRAGED_TNT_6.get(), EnragedTNT6Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_6.get(), EnragedSpeed6Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_7.get(), EnragedNormal7Entity.createAttributes().build());
		event.put(ENRAGED_TNT_7.get(), EnragedTNT7Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_7.get(), EnragedSpeed7Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_8.get(), EnragedNormal8Entity.createAttributes().build());
		event.put(ENRAGED_TNT_8.get(), EnragedTNT8Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_8.get(), EnragedSpeed8Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_9.get(), EnragedNormal9Entity.createAttributes().build());
		event.put(ENRAGED_TNT_9.get(), EnragedTNT9Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_9.get(), EnragedSpeed9Entity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
	}
}
