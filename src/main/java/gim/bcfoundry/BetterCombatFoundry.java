package gim.bcfoundry;

import gim.bcfoundry.item.BCFItems;
import gim.bcfoundry.particle.BCFParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterCombatFoundry implements ModInitializer {

    public static final String MOD_ID = "bcfoundry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final DefaultParticleType HKN_SLASH_PARTICLE = FabricParticleTypes.simple();


    @Override
    public void onInitialize() {

        BCFItems.registerModItems();
        BCFParticles.registerModParticles();

    }
}