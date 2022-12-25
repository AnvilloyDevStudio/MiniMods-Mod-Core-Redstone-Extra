package io.github.anvilloystudio.minimods.mod.core.redstone.extra;

import io.github.anvilloystudio.minimods.mod.core.redstone.extra.items.Items;

public class Main {
	public static void main(String[] args) {
		System.out.println("THIS JAR IS NOT PURPOSED TO BE EXECUTED DIRECTLY.");
	}

    public static void entry() {
		Items.postInit();
    }
}
