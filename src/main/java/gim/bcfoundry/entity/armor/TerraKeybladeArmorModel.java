package gim.bcfoundry.entity.armor;

import gim.bcfoundry.BetterCombatFoundry;
import gim.bcfoundry.item.custom.armor.TerraKeybladeArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TerraKeybladeArmorModel extends AnimatedGeoModel<TerraKeybladeArmorItem> {
    @Override
    public Identifier getModelResource(TerraKeybladeArmorItem terraKeybladeArmorItem) {
        return new Identifier(BetterCombatFoundry.MOD_ID, "geo/terra_keyblade_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(TerraKeybladeArmorItem terraKeybladeArmorItem) {
        return new Identifier(BetterCombatFoundry.MOD_ID, "textures/models/armor/terra_keyblade_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(TerraKeybladeArmorItem terraKeybladeArmorItem) {
        return new Identifier(BetterCombatFoundry.MOD_ID, "animations/armor_animations.json");
    }
}
