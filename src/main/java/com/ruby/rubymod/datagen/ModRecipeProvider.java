package com.ruby.rubymod.datagen;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import com.ruby.rubymod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider,recipeOutput);
        }

        @Override
        public String getName() {
            return "Template Mod Recipes";
        }
    }
    @Override
    protected void buildRecipes() {

        shaped(RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK.get())
                .pattern("RR")
                .pattern("RR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby_block", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        slab(RecipeCategory.DECORATIONS,ModBlocks.RUBY_SLAB.get(),ModBlocks.RUBY_BLOCK);
        stairBuilder(ModBlocks.RUBY_STAIR.get(),Ingredient.of(ModBlocks.RUBY_BLOCK.get()))
                .group("ruby")
                .unlockedBy("ruby_block", has(ModBlocks.RUBY_BLOCK.get()))
                .save(output);
        ;

        shaped(RecipeCategory.DECORATIONS, ModBlocks.RUBY_CHAIN.get())
                .pattern("N")
                .pattern("R")
                .pattern("N")
                .define('R', ModItems.RUBY.get())
                .define('N', ModItems.RUBY_NUGGET.get())
                .unlockedBy("ruby_block", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.DECORATIONS, ModBlocks.RUBY_LANTERN.get())
                .pattern("RRR")
                .pattern("RLR")
                .pattern("RRR")
                .define('L', Items.TORCH)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby_block", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        buttonBuilder(ModBlocks.RUBY_BUTTON.get(),Ingredient.of(ModBlocks.RUBY_BLOCK.get()))
                .group("ruby")
                .unlockedBy("ruby_block", has(ModBlocks.RUBY_BLOCK.get()))
                .save(output);

        pressurePlateBuilder(RecipeCategory.DECORATIONS,ModBlocks.RUBY_PRESSURE_PLATE.get(),Ingredient.of(ModBlocks.RUBY_BLOCK.get()))
                .group("ruby")
                .unlockedBy("ruby_block", has(ModBlocks.RUBY_BLOCK.get()))
                .save(output);

        shapeless(RecipeCategory.MISC,ModItems.RUBY.get(),4)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .group("ruby")
                .unlockedBy("ruby_block", has(ModBlocks.RUBY_BLOCK.get()))
                .save(output)
        ;

        shapeless(RecipeCategory.MISC,ModItems.RUBY.get())
                .requires(ModItems.RUBY_NUGGET.get(),9)
                .group("ruby")
                .unlockedBy("ruby_nuggets", has(ModItems.RUBY_NUGGET.get()))
                .save(output,"ruby_to_nuggets")
        ;

        shapeless(RecipeCategory.MISC,ModItems.RUBY_NUGGET.get(),9)
                .requires(ModItems.RUBY.get())
                .group("ruby")
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .save(output,"nugget_ruby_to_ruby")
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SWORD.get())
                .pattern("R")
                .pattern("R")
                .pattern("T")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_PICKAXE.get())
                .pattern("RRR")
                .pattern(" T ")
                .pattern(" T ")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SHOVEL.get())
                .pattern("R")
                .pattern("T")
                .pattern("T")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_AXE.get())
                .pattern("RR")
                .pattern("TR")
                .pattern("T ")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_HOE.get())
                .pattern("RR")
                .pattern("T ")
                .pattern("T ")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_SPEAR.get())
                .pattern("  R")
                .pattern(" T ")
                .pattern("T  ")
                .define('T', Items.STICK)
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET.get())
                .pattern("RRR")
                .pattern("R R")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE.get())
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS.get())
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS.get())
                .pattern("R R")
                .pattern("R R")
                .define('R', ModItems.RUBY.get())
                .unlockedBy("ruby", has(ModItems.RUBY.get()))
                .group("ruby")
                .save(output);
        ;
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables, RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result, float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike item : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(item), craftingCategory, cookingCategory, result, experience, cookingTime, factory)
                    .group(group)
                    .unlockedBy(getHasName(item), this.has(item))
                    .save(this.output, RubyMod.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(item));
        }
    }
}
