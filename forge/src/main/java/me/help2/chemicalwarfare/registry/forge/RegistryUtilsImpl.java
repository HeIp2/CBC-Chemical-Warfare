package me.help2.chemicalwarfare.registry.forge;

import me.help2.chemicalwarfare.ChemicalWarfare;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ChemicalWarfare.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryUtilsImpl {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemicalWarfare.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChemicalWarfare.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChemicalWarfare.MOD_ID);
    public static final DeferredRegister<StatusEffect> STATUS_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ChemicalWarfare.MOD_ID);
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ChemicalWarfare.MOD_ID);

    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        return BLOCKS.register(name,block);
    }

    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name,item);
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String name, EntityType.EntityFactory<T> factory, SpawnGroup spawnGroup, float width, float height, int clientTrackingRange) {
        return ENTITIES.register(name,() -> EntityType.Builder.create(factory,spawnGroup).setDimensions(width,height).build(name));
    }

    public static <T extends StatusEffect> Supplier<T> registerStatusEffect(String name, Supplier<T> effect) {
        return STATUS_EFFECTS.register(name,effect);
    }

    public static <T extends ParticleType<ParticleEffect>> Supplier<T> registerParticle(String name, Supplier<T> type) {
        return PARTICLE_TYPES.register(name,type);
    }
}
