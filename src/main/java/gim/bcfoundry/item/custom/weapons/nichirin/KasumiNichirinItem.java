package gim.bcfoundry.item.custom.weapons.nichirin;

import gim.bcfoundry.BCFClient;
import gim.bcfoundry.particle.BCFParticles;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class KasumiNichirinItem extends SwordItem {

    public KasumiNichirinItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public static void spawnKNParticlesServer(LivingEntity entity, ServerWorld serverWorld, DefaultParticleType particleType, int count, float spd) {
        for(int i = 0; i < 360; i++) {
            if(i % 20 == 0) {
                /* Use spawnParticle instead of addParticle to send a packet from the server to the client to spawn the particles */
                serverWorld.spawnParticles(particleType,
                        entity.getX(), entity.getY() + 2, entity.getZ(), count,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d, spd);
            }
        }
    }

    // It takes roughly less than 3 seconds to attack twice and roughly less than 4 to attack once, switch weapons, and attack again

    // COMBO SUMMARY
    /*
     Effectively, your first hit makes you invis and gives you mid spd if you aren't already invis
         You get low spd if you are invis (this is for when you swap and reset combo, keeping invis from prev combo)
     Your second hit will continue to give you invis and refresh your low spd
     Your third hit will now give you strength which applies on your next hit, but also invis and spd
         At this point you'd have to decide whether to swap off and back onto the weapon to reset your combo...
             This option will remove your strength buff after the next hit, but continue to refresh your invis and spd
         ... or to continue your combo, removing your invis and spd while keeping your strength
     Your hits after third until sixth will continue to refresh strength
     Your sixth will remove strength and give nothing
     */

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld serverWorld = (ServerWorld) attacker.world;
        if (attacker.hasStatusEffect(StatusEffects.INVISIBILITY)) {
            // Changes wtvr speed is active for speed 1 for one full swap when you already have invis
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 90, 0));
        }
        if (BCFClient.combo.current() == 1) {
            // Gives invis for one full swap and speed 2 for next hit
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 90, BCFClient.combo.current()-1));
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 60, 1));
        }
        else if (BCFClient.combo.current() == 2) {
            // Gives invis for one full swap
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 90, BCFClient.combo.current()-1));
        }
        else if (BCFClient.combo.current() == 3) {
            // Gives invis for one full swap
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 90, BCFClient.combo.current()-1));
        }
        else if (BCFClient.combo.current() == 4) {
            // Gives strength for next hit and invis for one full swap
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 0));
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 90, BCFClient.combo.current()-1));
        }
        else if (BCFClient.combo.current() == 5) {
            // Takes invis/speed and gives strength for next hit
            spawnKNParticlesServer(attacker, serverWorld, ParticleTypes.CLOUD, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 60, 0));
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 0, BCFClient.combo.current()-1));
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 99));
        }
        else if (BCFClient.combo.current() == 6) {
            // Takes away strength
            spawnKNParticlesServer(attacker, serverWorld, ParticleTypes.CLOUD, 30, 0.2f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, 99));
        }
        else if (BCFClient.combo.current() == 7) {
            // Gives invis/spd 2 for two full swaps
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE, 100, 0.4f);
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 180, BCFClient.combo.current()-1));
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 180, 1));
        }

        return super.postHit(stack, target, attacker);
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if ((Screen.hasShiftDown())) {
            tooltip.add(Text.literal("CREDITS").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "DEV: Jack Bagel").formatted(Formatting.YELLOW));
            tooltip.add(Text.literal( "MODEL: GimGirin").formatted(Formatting.AQUA));
            tooltip.add(Text.literal( "SOUNDS: Daedelus").formatted(Formatting.RED));
            tooltip.add(Text.literal( "ANIMATIONS: GimGirin").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("IP: Demon Slayer").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Sun breathing techniques").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Press Shift for more info").formatted(Formatting.YELLOW));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }


}

