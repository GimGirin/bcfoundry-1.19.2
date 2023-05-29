package gim.bcfoundry.item;

import gim.bcfoundry.item.custom.weapons.keyblade.aqua_keys.BrightcrestKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.aqua_keys.MastersDefenderKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.aqua_keys.StormfallKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.okp_obv_keys.OathkeeperKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.okp_obv_keys.OblivionKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.sora_keys.FenrirKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.sora_keys.ShootingStarKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.sora_keys.TwoBecomeOneKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.terra_keys.ChaosRipperKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.terra_keys.EndsOfTheEarthKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.ventus_keys.LostMemoryKeybladeItem;
import gim.bcfoundry.item.custom.weapons.keyblade.ventus_keys.WaywardWindKeybladeItem;
import gim.bcfoundry.item.custom.weapons.lightsaber.MakashiLightsaberItem;
import gim.bcfoundry.item.custom.weapons.lightsaber.ShiiChoLightsaberItem;
import gim.bcfoundry.item.custom.weapons.nichirin.HinokamiKaguraNichirinItem;
import gim.bcfoundry.item.custom.weapons.keyblade.sora_keys.KingdomKeyKeybladeItem;
import gim.bcfoundry.item.custom.armor.TerraKeybladeArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import gim.bcfoundry.BetterCombatFoundry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BCFItems {

    // WEAPONS
        // IP: DEMON SLAYER
    public static final Item HINOKAMI_KAGURA_NICHIRIN = registerItem("hinokami_kagura_nichirin",
            new HinokamiKaguraNichirinItem(ToolMaterials.NETHERITE, 5, -2.6f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

        // IP: STAR WARS
    public static final Item SHII_CHO_LIGHTSABER = registerItem("shii_cho_lightsaber",
            new ShiiChoLightsaberItem(ToolMaterials.NETHERITE, 6, -2f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item MAKASHI_LIGHTSABER = registerItem("makashi_lightsaber",
            new MakashiLightsaberItem(ToolMaterials.NETHERITE, 6, -1.7f,
                                 // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

    // IP: KINGDOM HEARTS
        // SORA KEY
    public static final Item KINGDOM_KEY_KEYBLADE = registerItem("kingdom_key_keyblade",
            new KingdomKeyKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item FENRIR_KEYBLADE = registerItem("fenrir_keyblade",
            new FenrirKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item SHOOTING_STAR_KEYBLADE = registerItem("shooting_star_keyblade",
            new ShootingStarKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item TWO_BECOME_ONE_KEYBLADE = registerItem("two_become_one_keyblade",
            new TwoBecomeOneKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
        // OO KEY
    public static final Item OATHKEEPER_KEYBLADE = registerItem("oathkeeper_keyblade",
            new OathkeeperKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item OBLIVION_KEYBLADE = registerItem("oblivion_keyblade",
            new OblivionKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    // TERRA KEY
    public static final Item CHAOS_RIPPER_KEYBLADE = registerItem("chaos_ripper_keyblade",
            new ChaosRipperKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item ENDS_OF_THE_EARTH_KEYBLADE = registerItem("ends_of_the_earth_keyblade",
            new EndsOfTheEarthKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    // AQUA KEY
    public static final Item MASTERS_DEFENDER_KEYBLADE = registerItem("masters_defender_keyblade",
            new MastersDefenderKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item STORMFALL_KEYBLADE = registerItem("stormfall_keyblade",
            new StormfallKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item BRIGHTCREST_KEYBLADE = registerItem("brightcrest_keyblade",
            new BrightcrestKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
        // VENTUS KEY
    public static final Item LOST_MEMORY_KEYBLADE = registerItem("lost_memory_keyblade",
            new LostMemoryKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));
    public static final Item WAYWARD_WIND_KEYBLADE = registerItem("wayward_wind_keyblade",
            new WaywardWindKeybladeItem(ToolMaterials.NETHERITE, 7, -2.8f,
                    // tool tier, // #+4 = weapon dmg, // #+4 = atk spd
                    new FabricItemSettings().group(BCFGroup.BCF_WEAPON).maxCount(1)));

    // ARMOR
        // IP: KINGDOM HEARTS
    public static final Item TERRA_KEYBLADE_ARMOR_BOOTS = registerItem("terra_keyblade_armor_boots",
            new TerraKeybladeArmorItem(BCFArmorMaterials.KEYBLADE_ARMOR, EquipmentSlot.FEET,
                    new FabricItemSettings().group(BCFGroup.BCF_ARMOR)));
    public static final Item TERRA_KEYBLADE_ARMOR_LEGGINGS = registerItem("terra_keyblade_armor_leggings",
            new TerraKeybladeArmorItem(BCFArmorMaterials.KEYBLADE_ARMOR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(BCFGroup.BCF_ARMOR)));
    public static final Item TERRA_KEYBLADE_ARMOR_CHESTPLATE = registerItem("terra_keyblade_armor_chestplate",
            new TerraKeybladeArmorItem(BCFArmorMaterials.KEYBLADE_ARMOR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(BCFGroup.BCF_ARMOR)));
    public static final Item TERRA_KEYBLADE_ARMOR_HELMET = registerItem("terra_keyblade_armor_helmet",
            new TerraKeybladeArmorItem(BCFArmorMaterials.KEYBLADE_ARMOR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(BCFGroup.BCF_ARMOR)));


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
