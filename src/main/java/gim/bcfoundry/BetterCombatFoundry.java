package gim.bcfoundry;

import gim.bcfoundry.item.BCFItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterCombatFoundry implements ModInitializer {

    public static final String MOD_ID = "bcfoundry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        BCFItems.registerModItems();

    }
}