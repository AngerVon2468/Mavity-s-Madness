package wiiu.mavity.mavitys_madness.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import wiiu.mavity.mavitys_madness.MavitysMadness;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class BlockInit {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MavitysMadness.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MavitysMadness.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }

    // Register Blocks Here
    public static final Block URANIUM = registerBlock("uranium", new Block(FabricBlockSettings.create()));

    public static void registerMavitysMadnessBlocks() {
        MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' blocks.");
    }
}
