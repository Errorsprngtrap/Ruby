package com.ruby.rubymod.worldgen;

import com.ruby.rubymod.RubyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> RUBY_ORE_COMMON_PLACED_KEY = registerKey("ruby_ore_common_placed_key");


    public static void bootstrap(BootstrapContext<PlacedFeature> bootstrapContext) {
        var configuredFeatures = bootstrapContext.lookup(Registries.CONFIGURED_FEATURE);

        register(bootstrapContext,RUBY_ORE_COMMON_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_COMMON_OVERWORLD_KEY),
                ModOrePlacements.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-30),VerticalAnchor.absolute(30))));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name){
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID,name));
    };

    private static  void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?,?>> configuration,
                                  List<PlacementModifier> modifiers) {
        context.register(key,new PlacedFeature(configuration,List.copyOf(modifiers))
        );
    }
}
