package wiiu.mavity.mavitys_madness;

import eu.midnightdust.lib.config.MidnightConfig;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.mavitys_madness.block.BlockInit;
import wiiu.mavity.mavitys_madness.config.MavitysMadnessConfig;
import wiiu.mavity.mavitys_madness.item.ItemInit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavitysMadness implements ModInitializer {

	public static final String MOD_ID = "mavitys_madness";

	public static final String NAME = "Mavity's Madness";

    public static final Logger LOGGER = LoggerFactory.getLogger(MavitysMadness.NAME);

	@Override
	public void onInitialize() {

		// Logger and Initializing Classes
		MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' main class.");
		MavitysMadnessClient.registerMavitysMadnessClient();
		BlockInit.registerMavitysMadnessBlocks();
		ItemInit.registerMavitysMadnessItems();

		// Config
		MidnightConfig.init(MavitysMadness.MOD_ID, MavitysMadnessConfig.class);

	}
}