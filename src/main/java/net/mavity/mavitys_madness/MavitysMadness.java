package net.mavity.mavitys_madness;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MavitysMadness implements ModInitializer {

	public static final String MOD_ID = "mavitys_madness";

	public static final String NAME = "Mavity's Madness";

    public static final Logger LOGGER = LoggerFactory.getLogger(MavitysMadness.NAME);

	@Override
	public void onInitialize() {

		MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' main class.");

	}
}