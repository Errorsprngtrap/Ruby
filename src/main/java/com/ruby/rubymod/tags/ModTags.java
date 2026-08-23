package com.ruby.rubymod.tags;

import com.ruby.rubymod.RubyMod;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class  Items{
        //create tag example just below
        public static final TagKey<Item> REPAIRS_RUBY_ARMOR = createTag("repairs_ruby_armor");


        //that shit create the tags
        private static TagKey<Item> createTag(String name){
            return ItemTags.create(Identifier.fromNamespaceAndPath(RubyMod.MOD_ID,name));
        }
    }

    public static class  Blocks{
        //create tag example just below
        public static final TagKey<Block> NEEDS_TEST_TOOL = createTag("need_test_tool");
        public static final TagKey<Block> INCORRECT_FOR_TEST_TOOL = createTag("incorrect_for_test_tool");


        //that shit create the tags
        private static TagKey<Block> createTag(String name){
            return BlockTags.create(Identifier.fromNamespaceAndPath(RubyMod.MOD_ID,name));
        }
    }

}