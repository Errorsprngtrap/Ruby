package com.ruby.rubymod.event;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.item.ModItems;
import com.ruby.rubymod.potion.ModPotion;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = RubyMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
    }
}
