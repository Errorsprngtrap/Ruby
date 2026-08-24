package com.ruby.rubymod.worldgen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_ORE_COMMON_OVERWORLD_KEY = registerKey("ruby_ore_common_overworld_key");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> bootstrapContext) {
        List<OreConfiguration.TargetBlockState> Ruby_OVERWORLD = List.of(
                OreConfiguration.target(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())
        );

        register(bootstrapContext,RUBY_ORE_COMMON_OVERWORLD_KEY,Feature.ORE,new OreConfiguration(Ruby_OVERWORLD,2));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID,name));
    };

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?,?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?,?>> key,F feature, FC configuration) {
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }
}
