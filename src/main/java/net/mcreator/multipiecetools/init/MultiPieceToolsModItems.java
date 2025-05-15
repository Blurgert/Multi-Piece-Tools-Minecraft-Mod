
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.multipiecetools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.multipiecetools.item.StoneHandleItem;
import net.mcreator.multipiecetools.item.NetheriteHandleItem;
import net.mcreator.multipiecetools.item.IronHandleItem;
import net.mcreator.multipiecetools.item.GoldHandleItem;
import net.mcreator.multipiecetools.item.EmeraldHandleItem;
import net.mcreator.multipiecetools.item.DiamondHandleItem;
import net.mcreator.multipiecetools.item.CopperHandleItem;
import net.mcreator.multipiecetools.item.AmethystHandleItem;
import net.mcreator.multipiecetools.MultiPieceToolsMod;

public class MultiPieceToolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MultiPieceToolsMod.MODID);
	public static final RegistryObject<Item> STONE_HANDLE = REGISTRY.register("stone_handle", () -> new StoneHandleItem());
	public static final RegistryObject<Item> IRON_HANDLE = REGISTRY.register("iron_handle", () -> new IronHandleItem());
	public static final RegistryObject<Item> GOLD_HANDLE = REGISTRY.register("gold_handle", () -> new GoldHandleItem());
	public static final RegistryObject<Item> AMETHYST_HANDLE = REGISTRY.register("amethyst_handle", () -> new AmethystHandleItem());
	public static final RegistryObject<Item> DIAMOND_HANDLE = REGISTRY.register("diamond_handle", () -> new DiamondHandleItem());
	public static final RegistryObject<Item> EMERALD_HANDLE = REGISTRY.register("emerald_handle", () -> new EmeraldHandleItem());
	public static final RegistryObject<Item> COPPER_HANDLE = REGISTRY.register("copper_handle", () -> new CopperHandleItem());
	public static final RegistryObject<Item> NETHERITE_HANDLE = REGISTRY.register("netherite_handle", () -> new NetheriteHandleItem());
}
