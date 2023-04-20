package net.earthcomputer.instaminabledeepslate;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> NETHERITE_INSTAMINABLE = TagKey.create(Registries.BLOCK, new ResourceLocation("instaminabledeepslate", "netherite_instaminable"));
}
