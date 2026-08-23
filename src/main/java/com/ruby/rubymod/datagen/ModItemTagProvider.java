package com.ruby.rubymod.datagen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.item.ModItems;
import com.ruby.rubymod.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, RubyMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //do add tag do teh same as block so tag .add ect
        tag(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.RUBY_AXE.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD.get());

        tag(ItemTags.HOES)
                .add(ModItems.RUBY_HOE.get());

        tag(ItemTags.SPEARS)
                .add(ModItems.RUBY_SPEAR.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.TEST_CHESTPLATE.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.TEST_BOOTS.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.TEST_LEGGINGS.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.TEST_HELMET.get());

        tag(ModTags.Items.REPAIRS_RUBY_ARMOR)
                .add(ModItems.RUBY.get());

    }
}
