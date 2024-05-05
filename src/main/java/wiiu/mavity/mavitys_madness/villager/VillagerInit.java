package wiiu.mavity.mavitys_madness.villager;

import com.google.common.collect.ImmutableSet;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;

import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.*;
import net.minecraft.sound.*;
import net.minecraft.util.Identifier;
import net.minecraft.village.*;
import net.minecraft.world.poi.*;

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

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerInit.NUCLEAR_ENGINEER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7), // This adds the input
                            new ItemStack(Items.STICK, 5), // This adds the input
                            new ItemStack(Items.APPLE, 2)/* This adds the output*/, 6, 2, 0.02f
                    ));
                });
    }
}