package com.ruby.rubymod.potion;

import com.ruby.rubymod.RubyMod;
import com.ruby.rubymod.effect.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotion {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(BuiltInRegistries.POTION, RubyMod.MOD_ID);

    public static final Holder<Potion> TEST_POTION = POTIONS.register(
            "test_potion",
            () -> new Potion("test_potion",new MobEffectInstance(ModEffects.TEST_EFFECT,100,0))
    );

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
