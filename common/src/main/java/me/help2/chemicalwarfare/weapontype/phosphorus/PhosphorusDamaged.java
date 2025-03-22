package me.help2.chemicalwarfare.weapontype.phosphorus;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class PhosphorusDamaged extends StatusEffect {
    public PhosphorusDamaged() {
        super(StatusEffectCategory.HARMFUL,16777149);
    }

    @Override
    public void applyUpdateEffect(LivingEntity livingEntity, int amplifier) {
        livingEntity.removeStatusEffect(StatusEffects.ABSORPTION);
        livingEntity.removeStatusEffect(StatusEffects.REGENERATION);
        livingEntity.damage(livingEntity.getDamageSources().magic(), 0.5F);
        super.applyUpdateEffect(livingEntity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration%20==0;
    }
}