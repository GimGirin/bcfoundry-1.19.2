package gim.bcfoundry.entity.armor;

import gim.bcfoundry.item.custom.armor.TerraKeybladeArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class TerraKeybladeArmorRenderer extends GeoArmorRenderer<TerraKeybladeArmorItem> {
    public TerraKeybladeArmorRenderer() {
        super(new TerraKeybladeArmorModel());
        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
