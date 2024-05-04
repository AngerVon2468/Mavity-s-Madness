package wiiu.mavity.mavitys_madness.item;

import wiiu.mavity.mavitys_madness.MavitysMadness;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MavitysMadness.MOD_ID, name), item);
    }

    // Register Items Here

    public static void registerMavitysMadnessItems() {
        MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' items.");
    }

}
