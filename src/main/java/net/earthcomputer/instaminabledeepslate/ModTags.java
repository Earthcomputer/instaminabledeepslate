package net.earthcomputer.instaminabledeepslate;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> NETHERITE_INSTAMINABLE = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("instaminabledeepslate", "netherite_instaminable"));
}
