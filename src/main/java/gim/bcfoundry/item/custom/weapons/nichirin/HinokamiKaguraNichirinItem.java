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

public class HinokamiKaguraNichirinItem extends SwordItem {

    public HinokamiKaguraNichirinItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


//    public static void spawnHKNParticlesClient(LivingEntity player, ServerWorld serverWorld) {
//        for(int i = 0; i < 360; i++) {
//            if(i % 20 == 0) {
//                /* Use spawnParticle instead of addParticle to send a packet from the server to the client to spawn the particles */
//                serverWorld.spawnParticles(BCFParticles.HKN_SLASH_PARTICLE,
//                        player.getX() + 0.5d, player.getY() + 1, player.getZ() + 0.5d, 5,
//                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d, 0.2F);
//            }
//        }
//    }

    public static void spawnHKNParticlesServer(LivingEntity player, ServerWorld serverWorld, DefaultParticleType particleType) {
        for(int i = 0; i < 360; i++) {
            if(i % 20 == 0) {
                /* Use spawnParticle instead of addParticle to send a packet from the server to the client to spawn the particles */
                serverWorld.spawnParticles(particleType,
                        player.getX() + 0.5d, player.getY() + 1, player.getZ() + 0.5d, 5,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d, 0.2F);
            }
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        ServerWorld serverWorld = (ServerWorld) attacker.world;
        if (BCFClient.combo.current() == 1) {
            spawnHKNParticlesServer(target, serverWorld, BCFParticles.HKN_SLASH_PARTICLE);
        }
        else if (BCFClient.combo.current() == 2) {
            spawnHKNParticlesServer(target, serverWorld, ParticleTypes.CLOUD);
        }
        else if (BCFClient.combo.current() == 3) {
            spawnHKNParticlesServer(target, serverWorld, ParticleTypes.EXPLOSION);
        }
        else {
            spawnHKNParticlesServer(target, serverWorld, BCFParticles.HKN_SLASH_PARTICLE);
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

