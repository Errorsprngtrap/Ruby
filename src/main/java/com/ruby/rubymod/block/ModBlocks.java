package com.ruby.rubymod.block;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RubyMod.MOD_ID);

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock(
            "ruby_block",
            properties -> new Block(properties
                    .requiresCorrectToolForDrops().strength(4.5F,5.5F)
                    .sound(SoundType.METAL))
    );

    public static final DeferredBlock<Block> RUBY_ORE = registerBlock(
            "ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(1,6),properties
                    .requiresCorrectToolForDrops().strength(2.5F,2.5F))
    );

    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock(
            "deepslate_ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3,10),properties
                    .requiresCorrectToolForDrops().strength(3.5F,2.5F))
    );

    public static final DeferredBlock<Block> RUBY_SLAB = registerBlock(
            "ruby_slab",
            properties -> new SlabBlock(properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RUBY_STAIR = registerBlock(
            "ruby_stair",
            properties -> new StairBlock(ModBlocks.RUBY_BLOCK.get().defaultBlockState(),properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RUBY_CHAIN = registerBlock(
            "ruby_chain",
            properties -> new ChainBlock(properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RUBY_LANTERN = registerBlock(
            "ruby_lantern",
            properties -> new LanternBlock(properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RUBY_BUTTON = registerBlock(
            "ruby_button",
            properties -> new ButtonBlock(BlockSetType.IRON,60,properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    public static final DeferredBlock<Block> RUBY_PRESSURE_PLATE = registerBlock(
            "ruby_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,properties.requiresCorrectToolForDrops()
                    .strength(4.5F,5.5F).sound(SoundType.METAL)
            )
    );

    //Register Block Item
    private static  <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties,T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name,function);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    //Create an item for the block
    private static <T extends Block> void registerBlockItem(String name,DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name,properties -> new BlockItem(block.get(),properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
