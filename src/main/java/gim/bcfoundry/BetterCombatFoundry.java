package gim.bcfoundry;

import gim.bcfoundry.item.BCFItems;
import gim.bcfoundry.particle.BCFParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterCombatFoundry implements ModInitializer {

    public static final String MOD_ID = "bcfoundry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Identifier LIGHTSABER_SWING = new Identifier("bcfoundry","lightsaber_swing");
    public static SoundEvent LIGHTSABER_SWING_EVENT = new SoundEvent(LIGHTSABER_SWING);



    @Override
    public void onInitialize() {

        BCFItems.registerModItems();
        BCFParticles.registerModParticles();
        Registry.register(Registry.SOUND_EVENT, BetterCombatFoundry.LIGHTSABER_SWING, LIGHTSABER_SWING_EVENT);


    }
}