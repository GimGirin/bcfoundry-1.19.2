package gim.bcfoundry.item.custom;

import gim.bcfoundry.particle.BCFParticles;
import net.bettercombat.api.client.BetterCombatClientEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.logging.Level;

public class HKNItem extends SwordItem {

    public HKNItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public void spawnHKNParticles(ItemUsageContext pContext, BlockPos positionClicked) {
        for(int i = 0; i < 360; i++) {
            if(i % 20 == 0) {
                pContext.getWorld().addParticle(BCFParticles.HKN_SLASH_PARTICLE,
                        positionClicked.getX() + 0.5d, positionClicked.getY() + 1, positionClicked.getZ() + 0.5d,
                        Math.cos(i) * 0.25d, 0.15d, Math.sin(i) * 0.25d);
            }
        }
    }


}
