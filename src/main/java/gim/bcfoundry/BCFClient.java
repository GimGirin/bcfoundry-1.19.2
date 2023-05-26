package gim.bcfoundry;

import gim.bcfoundry.entity.armor.TerraKeybladeArmorRenderer;
import gim.bcfoundry.item.BCFItems;
import gim.bcfoundry.item.custom.HKNItem;
import gim.bcfoundry.particle.BCFParticles;
import gim.bcfoundry.particle.custom.HKNSlashParticle;
import net.bettercombat.api.ComboState;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
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


    }
}
