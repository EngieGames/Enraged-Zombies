package net.mcreator.enragedzombies.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.enragedzombies.init.EnragedZombiesModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ArmorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNCOMMON_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.RARE_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
					&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.EPIC_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
					&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.LEGENDARY_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
					&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:legendary_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:legendary_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.MYTHIC_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
					&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
					&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:mythic_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:mythic_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.EXOTIC_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
					&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
					&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:exotic_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:exotic_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_HELMET.get())) : false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_CHESTPLATE.get())) : false) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_CHESTPLATE.get())) : false) {
					if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_BOOTS.get())) : false) {
						if ((entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
								&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_full_armor"))).isDone()) == false) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_full_armor"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
						if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SWORD.get())) : false) {
							if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_PICKAXE.get())) : false) {
								if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_AXE.get())) : false) {
									if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SHOVEL.get())) : false) {
										if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_HOE.get())) : false) {
											if ((entity instanceof ServerPlayer _plr35 && _plr35.level instanceof ServerLevel
													&& _plr35.getAdvancements().getOrStartProgress(_plr35.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_everything"))).isDone()) == false) {
												if (entity instanceof ServerPlayer _player) {
													Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_everything"));
													AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
													if (!_ap.isDone()) {
														Iterator _iterator = _ap.getRemainingCriteria().iterator();
														while (_iterator.hasNext())
															_player.getAdvancements().award(_adv, (String) _iterator.next());
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
					&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
					&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr44 && _plr44.level instanceof ServerLevel
					&& _plr44.getAdvancements().getOrStartProgress(_plr44.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_ENRAGED_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr47 && _plr47.level instanceof ServerLevel
					&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SWORD.get())) : false) {
			if ((entity instanceof ServerPlayer _plr50 && _plr50.level instanceof ServerLevel
					&& _plr50.getAdvancements().getOrStartProgress(_plr50.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_PICKAXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr53 && _plr53.level instanceof ServerLevel
					&& _plr53.getAdvancements().getOrStartProgress(_plr53.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_AXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr56 && _plr56.level instanceof ServerLevel
					&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_SHOVEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr59 && _plr59.level instanceof ServerLevel
					&& _plr59.getAdvancements().getOrStartProgress(_plr59.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(EnragedZombiesModItems.UNOBTAINIUM_HOE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr62 && _plr62.level instanceof ServerLevel
					&& _plr62.getAdvancements().getOrStartProgress(_plr62.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("enraged_zombies:unobtainium_gained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
	}
}
