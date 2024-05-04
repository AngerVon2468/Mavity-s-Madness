package wiiu.mavity.mavitys_madness;

import net.fabricmc.api.ClientModInitializer;

public class MavitysMadnessClient implements ClientModInitializer {

    public static void registerMavitysMadnessClient() {
        MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' client class.");
    }

    @Override
    public void onInitializeClient() {

    }
}
