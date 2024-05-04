package wiiu.mavity.mavitys_madness.villager;

import com.google.common.collect.ImmutableSet;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

import wiiu.mavity.mavitys_madness.MavitysMadness;

public class VillagerInit {

    public static final RegistryKey<PointOfInterestType> NUCLEAR_ENGINEER_POI_KEY = registerPointOfInterestKey("nuclear_engineer_poi");

    public static final PointOfInterestType NUCLEAR_ENGINEER_POI = registerPointOfInterest("nuclear_engineer_poi", Blocks.BEDROCK);

    public static final VillagerProfession NUCLEAR_ENGINEER = registerProfession("nuclear_engineer", NUCLEAR_ENGINEER_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(MavitysMadness.MOD_ID, name),
                new VillagerProfession(name, entry -> true, entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
    }

    private static PointOfInterestType registerPointOfInterest(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MavitysMadness.MOD_ID, name),1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPointOfInterestKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(MavitysMadness.MOD_ID, name));
    }

    public static void registerMavitysMadnessVillagers() {
        MavitysMadness.LOGGER.info(MavitysMadness.NAME + " has registered its' villagers.");
    }
}