package me.help2.chemicalwarfare.registry;

import me.help2.chemicalwarfare.item.custom.Debug;
import me.help2.chemicalwarfare.weapontype.phosphorus.PhosphorusItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import java.util.function.Supplier;

public class ModItems {
    public static void init() {}
    public static final Supplier<Item> DEBUG = RegistryUtils.registerItem("debug", () -> new Debug(new Item.Settings().rarity(Rarity.RARE)));
    public static final Supplier<Item> PHOSPHORUS_CHUNK = RegistryUtils.registerItem("phosphorus_chunk", () -> new PhosphorusItem(new Item.Settings()));
}
