package gim.bcfoundry;

import gim.bcfoundry.entity.armor.TerraKeybladeArmorRenderer;
import gim.bcfoundry.item.BCFItems;
import gim.bcfoundry.particle.BCFParticles;
import gim.bcfoundry.particle.custom.HKNParticle;
import gim.bcfoundry.particle.custom.HKNSlashParticle;
import gim.bcfoundry.particle.custom.KNParticle;
import net.bettercombat.api.ComboState;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.Particle;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BCFClient implements ClientModInitializer {
    public static ComboState combo;
    @Override
    public void onInitializeClient() {
        BetterCombatClientEvents.ATTACK_HIT.register((player, attackHand, targets, cursorTarget) -> {
            combo = attackHand.combo();
//
//
//            ServerWorld world = (ServerWorld) player.world;
//
//            if (player.world.isClient && world != null) {
//                HKNItem.spawnHKNParticlesClient(player, world);
//                System.out.println("I run on the client");
//            }

        });

        GeoArmorRenderer.registerArmorRenderer(new TerraKeybladeArmorRenderer(),
                BCFItems.TERRA_KEYBLADE_ARMOR_BOOTS,
                BCFItems.TERRA_KEYBLADE_ARMOR_LEGGINGS,
                BCFItems.TERRA_KEYBLADE_ARMOR_CHESTPLATE,
                BCFItems.TERRA_KEYBLADE_ARMOR_HELMET);

        ParticleFactoryRegistry.getInstance().register(BCFParticles.HKN_SLASH_PARTICLE, HKNSlashParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(BCFParticles.HKN_PARTICLE, HKNParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(BCFParticles.KN_PARTICLE, KNParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticleTypes.CLOUD, KNParticle.Factory::new);


    }
}
