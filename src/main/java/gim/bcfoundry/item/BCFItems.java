package gim.bcfoundry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import gim.bcfoundry.BetterCombatFoundry;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCFItems {

    // WEAPONS
    public static final Item HINOKAMI_KAGURA_NICHIRIN = registerItem("hinokami_kagura_nichirin",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2.6f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

    // INGREDIENTS
    public static final Item SUNS_BLESSING = registerItem("suns_blessing",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterCombatFoundry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterCombatFoundry.LOGGER.debug("Registering Mod Items for " + BetterCombatFoundry.MOD_ID);
    }

}
