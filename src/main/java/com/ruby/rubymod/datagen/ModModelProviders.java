package com.ruby.rubymod.datagen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import com.ruby.rubymod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;

public class ModModelProviders extends ModelProvider {

    public ModModelProviders(PackOutput output) {
        super(output, RubyMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        //items
        itemModels.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_SWORD.get(),ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_PICKAXE.get(),ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_SHOVEL.get(),ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HOE.get(),ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_AXE.get(),ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateSpear(ModItems.RUBY_SPEAR.get());

        itemModels.generateFlatItem(ModItems.RUBY_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);

        //blocks
        blockModels.family(ModBlocks.RUBY_BLOCK.get())
                .slab(ModBlocks.RUBY_SLAB.get())
                .stairs(ModBlocks.RUBY_STAIR.get())
        ;

        blockModels.createAxisAlignedPillarBlockCustomModel(ModBlocks.RUBY_CHAIN.get(),
                BlockModelGenerators.plainVariant(TexturedModel.CHAIN.create(ModBlocks.RUBY_CHAIN.get(), blockModels.modelOutput)));

        blockModels.createLantern(ModBlocks.RUBY_LANTERN.get());
         blockModels.createTrivialCube(ModBlocks.RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE.get());

    }
}
