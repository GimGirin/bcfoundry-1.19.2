package gim.bcfoundry;

import gim.bcfoundry.particle.custom.HKNSlashParticle;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;

public class BCFClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
//        BetterCombatClientEvents.ATTACK_HIT.register((player, attackHand, targets, cursorTarget) -> {
//            // Add my logic responding to attack event. Note that this is client side only
//
//
//        });

        ParticleFactoryRegistry.getInstance().register(BetterCombatFoundry.HKN_SLASH_PARTICLE, HKNSlashParticle.Factory::new);


    }
}
