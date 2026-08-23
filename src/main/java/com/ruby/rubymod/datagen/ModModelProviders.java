package com.ruby.rubymod.datagen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import com.ruby.rubymod.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
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

        itemModels.generateFlatItem(ModItems.TEST_HELMET.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TEST_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TEST_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TEST_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);

        //blocks
        blockModels.createTrivialCube(ModBlocks.RUBY_BLOCK.get());
    }
}
