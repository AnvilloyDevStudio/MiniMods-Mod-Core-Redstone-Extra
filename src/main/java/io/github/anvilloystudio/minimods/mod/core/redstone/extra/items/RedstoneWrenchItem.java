package io.github.anvilloystudio.minimods.mod.core.redstone.extra.items;

import io.github.anvilloystudio.minimods.api.GraphicComp;
import minicraft.gfx.Sprite;
import minicraft.item.Item;

import java.io.IOException;

public class RedstoneWrenchItem extends Item {
	private static final Sprite sprite;

	static {
		try {
			sprite = GraphicComp.getSpriteFromSheet(1, 1,
				GraphicComp.getSpriteSheetFromInputStream(RedstoneWrenchItem.class.getResourceAsStream("/assets/textures/items/redstone_wrench.png")));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public RedstoneWrenchItem(String name) {
		super(name, sprite);
	}

	@Override
	public RedstoneWrenchItem clone() {
		return new RedstoneWrenchItem(getName());
	}
}
