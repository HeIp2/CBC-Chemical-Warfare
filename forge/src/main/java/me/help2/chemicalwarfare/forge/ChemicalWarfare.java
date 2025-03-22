package me.help2.chemicalwarfare.forge;

import dev.architectury.platform.forge.EventBuses;
import me.help2.chemicalwarfare.registry.RegistryUtils;
import me.help2.chemicalwarfare.registry.forge.RegistryUtilsImpl;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(me.help2.chemicalwarfare.ChemicalWarfare.MOD_ID)
public final class ChemicalWarfare {
    public ChemicalWarfare() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(me.help2.chemicalwarfare.ChemicalWarfare.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        me.help2.chemicalwarfare.ChemicalWarfare.init();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryUtilsImpl.BLOCKS.register(bus);
        RegistryUtilsImpl.ITEMS.register(bus);
        RegistryUtilsImpl.ENTITIES.register(bus);
        RegistryUtilsImpl.STATUS_EFFECTS.register(bus);
        RegistryUtilsImpl.PARTICLE_TYPES.register(bus);
    }
}
