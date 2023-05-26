package gim.bcfoundry.item.custom;

import gim.bcfoundry.item.BCFItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.example.registry.ItemRegistry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerraKeybladeArmorItem extends ArmorItem implements IAnimatable {
    private AnimationFactory factory = GeckoLibUtil.createFactory(this);

    public TerraKeybladeArmorItem(ArmorMaterial materialIn, EquipmentSlot slot, Item.Settings builder) {
        super(materialIn, slot, builder);
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        LivingEntity livingEntity = (LivingEntity)event.getExtraDataOfType(LivingEntity.class).get(0);
        event.getController().setAnimation((new AnimationBuilder()).addAnimation("idle", ILoopType.EDefaultLoopTypes.LOOP));
        if (livingEntity instanceof ArmorStandEntity) {
            return PlayState.CONTINUE;
        } else {
            List<Item> armorList = new ArrayList(4);
            EquipmentSlot[] var4 = EquipmentSlot.values();
            int var5 = var4.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                EquipmentSlot slot = var4[var6];
                if (slot.getType() == EquipmentSlot.Type.ARMOR && livingEntity.getEquippedStack(slot) != null) {
                    armorList.add(livingEntity.getEquippedStack(slot).getItem());
                }
            }

            boolean isWearingAll = armorList.containsAll(Arrays.asList
                    (BCFItems.TERRA_KEYBLADE_ARMOR_BOOTS,
                            BCFItems.TERRA_KEYBLADE_ARMOR_LEGGINGS,
                            BCFItems.TERRA_KEYBLADE_ARMOR_CHESTPLATE,
                            BCFItems.TERRA_KEYBLADE_ARMOR_HELMET));
            return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;
        }
    }

    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller", 20.0F, this::predicate));
    }

    public AnimationFactory getFactory() {
        return this.factory;
    }
}
