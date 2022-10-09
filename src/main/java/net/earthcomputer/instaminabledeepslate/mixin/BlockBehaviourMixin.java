package net.earthcomputer.instaminabledeepslate.mixin;

import net.earthcomputer.instaminabledeepslate.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(BlockBehaviour.class)
public class BlockBehaviourMixin {
    @ModifyVariable(method = "getDestroyProgress", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private BlockState setToStoneIfNetherite(BlockState state, BlockState state1, Player player, BlockGetter level, BlockPos pos) {
        if (player.getMainHandItem().is(Items.NETHERITE_PICKAXE) && state.is(ModTags.NETHERITE_INSTAMINABLE)) {
            return Blocks.STONE.defaultBlockState();
        }
        return state;
    }
}
