package gim.bcfoundry;

import net.bettercombat.api.client.BetterCombatClientEvents;
import net.fabricmc.api.ClientModInitializer;

public class BCFClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
//        BetterCombatClientEvents.ATTACK_HIT.register((player, attackHand, targets, cursorTarget) -> {
//            // Add my logic responding to attack event. Note that this is client side only
//
//
//        });

        /* Registers our particle client-side.
         * First argument is our particle's instance, created previously on ExampleMod.
         * Second argument is the particle's factory. The factory controls how the particle behaves.
         * In this example, we'll use FlameParticle's Factory. */

    }
}
