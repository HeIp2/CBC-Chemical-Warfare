package me.help2.chemicalwarfare;

import me.help2.chemicalwarfare.registry.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ChemicalWarfare {
    public static final String MOD_ID = "cbc_chemicalwarfare";
    public static final Logger LOGGER = LogManager.getLogger();
    public static void init() {
        // Initiate Registries
        ModItems.init();
        ModEntityTypes.init();
        ModParticles.init();
        ModEffects.init();
    }

}
