package gim.bcfoundry.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import gim.bcfoundry.BetterCombatFoundry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BCFGroup {
    public static final ItemGroup BCF_WEAPON = FabricItemGroupBuilder.build(
            new Identifier(BetterCombatFoundry.MOD_ID, "bcf_weapon"), () -> new ItemStack(BCFItems.HINOKAMI_KAGURA_NICHIRIN));

    public static final ItemGroup BCF_MISC = FabricItemGroupBuilder.build(
            new Identifier(BetterCombatFoundry.MOD_ID, "bcf_misc"), () -> new ItemStack(BCFItems.SUNS_BLESSING));

}
