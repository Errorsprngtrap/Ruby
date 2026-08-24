package com.ruby.rubymod.toolmaterial;

import com.ruby.rubymod.tags.ModTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterial {
    public static final ToolMaterial RUBY_MATERIAL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL,
            1000,
            7.0F,
            2.5F,
            20,
            ModTags.Items.REPAIRS_RUBY_ARMOR
    );


}
