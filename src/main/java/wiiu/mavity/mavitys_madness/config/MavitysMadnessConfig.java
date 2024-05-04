package wiiu.mavity.mavitys_madness.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class MavitysMadnessConfig extends MidnightConfig {

    @Comment(category = "settings", centered = true) public static Comment comment_1;

    @Entry(category = "settings") public static boolean lol_boolean = true;

    @Comment(category = "appearance", centered = true) public static Comment comment_2;

    @Entry(category = "appearance") public static boolean showTooltips = true;

}
