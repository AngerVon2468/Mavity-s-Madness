package wiiu.mavity.mavitys_madness.item;

import wiiu.mavity.mavitys_madness.MavitysMadness;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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
