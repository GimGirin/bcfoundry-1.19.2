package gim.bcfoundry;

import gim.bcfoundry.item.custom.HKNItem;
import gim.bcfoundry.particle.BCFParticles;
import gim.bcfoundry.particle.custom.HKNSlashParticle;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;

public class BCFClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterCombatClientEvents.ATTACK_HIT.register((player, attackHand, targets, cursorTarget) -> {
            ServerWorld serverWorld = (ServerWorld) player.world;
            // Add my logic responding to attack event. Note that this is client side only
            if (player.getActiveHand() == Hand.MAIN_HAND && attackHand.combo().current() == 1) {
                HKNItem.spawnHKNParticles(player, serverWorld);
            }

        });

        ParticleFactoryRegistry.getInstance().register(BCFParticles.HKN_SLASH_PARTICLE, HKNSlashParticle.Factory::new);


    }
}
