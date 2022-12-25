package io.github.anvilloystudio.minimods.mod.core.redstone.extra.mixins;

import io.github.anvilloystudio.minimods.mod.core.redstone.extra.items.RedstoneWrenchItem;
import io.github.anvilloystudio.minimods.mod.core.redstone.tiles.RepeaterTile;
import minicraft.entity.Direction;
import minicraft.entity.mob.Player;
import minicraft.item.Item;
import minicraft.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RepeaterTile.class)
public class RepeaterTileMixin {
	@Inject(method = "interact(Lminicraft/level/Level;IILminicraft/entity/mob/Player;Lminicraft/item/Item;Lminicraft/entity/Direction;)Z", at = @At(value = "HEAD", remap = false), remap = false, cancellable = true)
	private void injectWrenchInteract(Level level, int xt, int yt, Player player, Item item, Direction attackDir, CallbackInfoReturnable<Boolean> cir) {
		if (item instanceof RedstoneWrenchItem) { // Rotating the tile.
			int data = level.getData(xt, yt);
			int dir = (data >> 4) & 3;
			level.setData(xt, yt, (((dir + 1) & 3) << 4) + (data & 0b1111));
			cir.setReturnValue(true);
		}
	}
}
