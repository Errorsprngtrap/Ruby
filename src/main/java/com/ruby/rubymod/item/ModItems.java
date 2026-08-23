package com.ruby.rubymod.item;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.armormaterial.ModArmorMaterial;
import com.ruby.rubymod.toolmaterial.ModToolMaterial;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RubyMod.MOD_ID);

    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            properties ->  properties
    );

    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerSimpleItem(
            "ruby_sword",
            properties ->  properties.sword(ModToolMaterial.RUBY_MATERIAL,3.0F,-2.2F)
    );
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem(
            "ruby_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterial.RUBY_MATERIAL,1.0F,-2.4F))
    );
    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerItem(
            "ruby_shovel",
            properties -> new ShovelItem(ModToolMaterial.RUBY_MATERIAL,1.5F,-2.8F,properties)
    );
    public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerItem(
            "ruby_axe",
            properties -> new AxeItem(ModToolMaterial.RUBY_MATERIAL,5.5F,-2.9F,properties)
    );

    public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerItem(
            "ruby_hoe",
            properties -> new HoeItem(ModToolMaterial.RUBY_MATERIAL,-1.5F,-0.5F,properties)
    );

    public static final DeferredItem<Item> RUBY_SPEAR = ITEMS.registerItem(
            "ruby_spear",
            properties -> new Item(properties.spear(ModToolMaterial.RUBY_MATERIAL,1.0F,1.0F
            ,0.55F,2.75F,10.5F,6.75F,5.1F,11F,4.6F)
            )
    );

    public static final DeferredItem<Item> TEST_BOOTS = ITEMS.registerItem(
            "test_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.TEST_ARMOR_MATERIAL, ArmorType.BOOTS))
    );

    public static final DeferredItem<Item> TEST_HELMET = ITEMS.registerItem(
            "test_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.TEST_ARMOR_MATERIAL, ArmorType.HELMET))
    );

    public static final DeferredItem<Item> TEST_LEGGINGS = ITEMS.registerItem(
            "test_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.TEST_ARMOR_MATERIAL, ArmorType.LEGGINGS))
    );

    public static final DeferredItem<Item> TEST_CHESTPLATE = ITEMS.registerItem(
            "test_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterial.TEST_ARMOR_MATERIAL, ArmorType.CHESTPLATE))
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
