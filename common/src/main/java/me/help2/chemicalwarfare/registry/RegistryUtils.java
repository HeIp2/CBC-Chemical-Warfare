package me.help2.chemicalwarfare.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;

import java.util.function.Supplier;

public class RegistryUtils {
    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        throw new Error("Invalid function call");
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        throw new Error("Invalid function call");
    }

    @ExpectPlatform
    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String name, EntityType.EntityFactory<T> factory, SpawnGroup spawnGroup, float width, float height, int clientTrackingRange) {
        throw new Error("Invalid function call");

    }

    @ExpectPlatform
    public static <T extends StatusEffect> Supplier<T> registerStatusEffect(String name, Supplier<T> effect) {
        throw new Error("Invalid function call");
    }

    @ExpectPlatform
    public static <T extends ParticleType<ParticleEffect>> Supplier<T> registerParticle(String name, Supplier<T> type) {
        throw new Error("Invalid function call");
    }
}
