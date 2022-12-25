package io.github.anvilloystudio.minimods.mod.core.redstone.extra.items;

import io.github.anvilloystudio.minimods.api.mixins.ItemsMixin;

public class Items {
	public static void postInit() {
		ItemsMixin.invokeAdd(new RedstoneWrenchItem("Redstone Wrench"));
	}
}
