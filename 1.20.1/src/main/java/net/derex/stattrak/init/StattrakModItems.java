
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.derex.stattrak.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.derex.stattrak.item.StattrakTrackerItem;
import net.derex.stattrak.StattrakMod;

public class StattrakModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StattrakMod.MODID);
	public static final RegistryObject<Item> STATTRAK_TRACKER = REGISTRY.register("stattrak_tracker", () -> new StattrakTrackerItem());
}
