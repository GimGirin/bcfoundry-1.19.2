package gim.bcfoundry.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import gim.bcfoundry.BetterCombatFoundry;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BCFParticles {
    public static final DefaultParticleType HKN_SLASH_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType HKN_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType KN_PARTICLE = FabricParticleTypes.simple();

    public static void  registerModParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(BetterCombatFoundry.MOD_ID,
                "hkn_slash_particle"), HKN_SLASH_PARTICLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(BetterCombatFoundry.MOD_ID,
                "hkn_particle"), HKN_PARTICLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(BetterCombatFoundry.MOD_ID,
                "kn_particle"), KN_PARTICLE);
    }
}
