package me.help2.chemicalwarfare.registry;

import me.help2.chemicalwarfare.weapontype.phosphorus.PhosphorusDamaged;
import net.minecraft.entity.effect.StatusEffect;

import java.util.function.Supplier;

public class ModEffects {
    public static void init() {}
    public static final Supplier<StatusEffect> PHOSPHORUS_DAMAGED = RegistryUtils.registerStatusEffect("phosphorus_damaged", PhosphorusDamaged::new);

}
