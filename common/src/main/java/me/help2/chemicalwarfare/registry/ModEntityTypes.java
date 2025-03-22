package me.help2.chemicalwarfare.registry;

import me.help2.chemicalwarfare.weapontype.phosphorus.PhosphorusProjectile;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import java.util.function.Supplier;

public class ModEntityTypes {
    public static void init() {}

    public static final Supplier<EntityType<PhosphorusProjectile>> PHOSPHORUS_PROJECTILE = RegistryUtils.registerEntityType("phosphorus_projectile", PhosphorusProjectile::new, SpawnGroup.MISC, 0.5F, 0.5F, 10);
}
