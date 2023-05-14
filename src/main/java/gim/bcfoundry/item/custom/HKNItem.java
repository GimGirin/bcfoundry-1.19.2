package gim.bcfoundry.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

import java.util.logging.Level;

public class HKNItem extends SwordItem {

    public HKNItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return super.postHit(stack, target, attacker);
    }

    public void spawnFire(ItemStack stack, LivingEntity target, LivingEntity attacker, World level) {
        if (attacker.isPlayer() && postHit(stack, attacker, target)) {
            level.addParticle(ParticleTypes.FLAME, attacker.getX(), attacker.getY(), attacker.getZ(), 0.5f, 0.5f, 0.5f);
        }
    }

}
