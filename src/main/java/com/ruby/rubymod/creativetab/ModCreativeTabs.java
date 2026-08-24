package com.ruby.rubymod.creativetab;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.block.ModBlocks;
import com.ruby.rubymod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MOD_ID);


    public static final Supplier<CreativeModeTab> RUBY_TAB = CREATIVE_MODE_TABS.register("ruby_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetabs.rubymod.ruby_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_SPEAR);

                        output.accept(ModItems.RUBY_HELMET);
                        output.accept(ModItems.RUBY_BOOTS);
                        output.accept(ModItems.RUBY_CHESTPLATE);
                        output.accept(ModItems.RUBY_LEGGINGS);

                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
