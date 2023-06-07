package gim.bcfoundry.item.custom.weapons.nichirin;

import gim.bcfoundry.BCFClient;
import gim.bcfoundry.particle.BCFParticles;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
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

    public static void spawnKNParticlesServer(LivingEntity entity, ServerWorld serverWorld, DefaultParticleType particleType) {
        for(int i = 0; i < 360; i++) {
            if(i % 20 == 0) {
                /* Use spawnParticle instead of addParticle to send a packet from the server to the client to spawn the particles */
                serverWorld.spawnParticles(particleType,
                        entity.getX(), entity.getY() + 2, entity.getZ(), 20,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d, 0.2F);
            }
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld serverWorld = (ServerWorld) attacker.world;
        if (BCFClient.combo.current() == 1) {
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.HKN_PARTICLE);
        }
        else if (BCFClient.combo.current() == 2) {
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE);
        }
        else if (BCFClient.combo.current() == 3) {
            spawnKNParticlesServer(attacker, serverWorld, ParticleTypes.CLOUD);
        }
        else {
            spawnKNParticlesServer(attacker, serverWorld, BCFParticles.KN_PARTICLE);
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

