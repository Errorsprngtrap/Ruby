package com.ruby.rubymod.datagen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import com.ruby.rubymod.item.ModItems;
import com.ruby.rubymod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, RubyMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //here you put tags ect with tag add ect
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_STAIR.get())
                .add(ModBlocks.RUBY_CHAIN.get())
                .add(ModBlocks.RUBY_LANTERN.get())
        ;

        tag(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add(Blocks.OBSIDIAN)
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_STAIR.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_CHAIN.get())
                .add(ModBlocks.RUBY_LANTERN.get())
        ;

        tag(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_RUBY_TOOL)
        ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
        ;

        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK.get())
        ;

        tag(BlockTags.SLABS)
                .add(ModBlocks.RUBY_SLAB.get())
        ;

        tag(BlockTags.STAIRS)
                .add(ModBlocks.RUBY_STAIR.get())
        ;

        tag(BlockTags.CHAINS)
                .add(ModBlocks.RUBY_CHAIN.get())
        ;

        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_SLAB.get())
                .add(ModBlocks.RUBY_STAIR.get())
                .add(ModBlocks.RUBY_CHAIN.get())
                .add(ModBlocks.RUBY_LANTERN.get())
        ;

    }
}
