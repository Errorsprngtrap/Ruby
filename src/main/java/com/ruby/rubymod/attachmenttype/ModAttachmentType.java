package com.ruby.rubymod.attachmenttype;

import com.ruby.rubymod.RubyMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModAttachmentType {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPE =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, RubyMod.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        ATTACHMENT_TYPE.register(eventBus);
    }
}
