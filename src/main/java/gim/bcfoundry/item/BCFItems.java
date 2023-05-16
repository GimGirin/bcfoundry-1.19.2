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
        // IP: DEMON SLAYER
    public static final Item HINOKAMI_KAGURA_NICHIRIN = registerItem("hinokami_kagura_nichirin",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2.6f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

        // IP: STAR WARS
    public static final Item SHII_CHO_LIGHTSABER = registerItem("shii_cho_lightsaber",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item MAKASHI_LIGHTSABER = registerItem("makashi_lightsaber",
            new SwordItem(ToolMaterials.NETHERITE, 6, -1.7f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

    // IP: KINGDOM HEARTS
    public static final Item KINGDOM_KEY_KEYBLADE = registerItem("kingdom_key_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item OATHKEEPER_KEYBLADE = registerItem("oathkeeper_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item OBLIVION_KEYBLADE = registerItem("oblivion_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item MASTERS_DEFENDER_KEYBLADE = registerItem("masters_defender_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item STORMFALL_KEYBLADE = registerItem("stormfall_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item LOST_MEMORY_KEYBLADE = registerItem("lost_memory_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item CHAOS_RIPPER_KEYBLADE = registerItem("chaos_ripper_keyblade",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));


    // INGREDIENTS
        // IP: DEMON SLAYER
    public static final Item SUNS_BLESSING = registerItem("suns_blessing",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));

    // IP: STAR WARS
    public static final Item SITH_HOLOCRON = registerItem("sith_holocron",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));
    public static final Item JEDI_HOLOCRON = registerItem("jedi_holocron",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));
    public static final Item KIT_FISTO_HOLO = registerItem("kit_fisto_holo",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));
    public static final Item DOOKU_HOLO = registerItem("dooku_holo",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));

    // IP: KINGDOM HEARTS
    public static final Item LUX = registerItem("lux",
            new Item(new FabricItemSettings().group(BCFGroup.BCF_MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterCombatFoundry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterCombatFoundry.LOGGER.debug("Registering Mod Items for " + BetterCombatFoundry.MOD_ID);
    }

}
