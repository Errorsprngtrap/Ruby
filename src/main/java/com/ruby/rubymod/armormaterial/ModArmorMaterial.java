package com.ruby.rubymod.armormaterial;

import com.google.common.collect.Maps;
import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.tags.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class ModArmorMaterial {
    private static ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(RubyMod.MOD_ID,"ruby"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(
            5, makeDefense(2, 5, 7, 2, 9), 18, SoundEvents.ARMOR_EQUIP_GENERIC, 1.0F, 0.0F, ModTags.Items.REPAIRS_RUBY_ARMOR, RUBY_KEY
    );

    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }

}
