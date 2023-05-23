package gim.bcfoundry.item.custom;

import gim.bcfoundry.particle.BCFParticles;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.logging.Level;

public class HKNItem extends SwordItem {

    public HKNItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    public static void spawnHKNParticles(LivingEntity player, ServerWorld serverWorld) {
        for(int i = 0; i < 360; i++) {
            if(i % 20 == 0) {
                /* Use spawnParticle instead of addParticle to send a packet from the server to the client to spawn the particles */
                serverWorld.spawnParticles(BCFParticles.HKN_SLASH_PARTICLE,
                        player.getX() + 0.5d, player.getY() + 1, player.getZ() + 0.5d, 5,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d, 0.2F);
            }
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity player, LivingEntity attacker) {
        ServerWorld serverWorld = (ServerWorld) attacker.world;
        spawnHKNParticles(player, serverWorld);

        return super.postHit(stack, player, attacker);
    }

}

