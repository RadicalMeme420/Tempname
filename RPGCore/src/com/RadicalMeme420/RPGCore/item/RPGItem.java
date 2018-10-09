package com.RadicalMeme420.RPGCore.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class RPGItem {

	private ItemTier tier;

	public RPGItem(ItemStack i) {
		setItemTier(i.getType());
	}

	public ItemTier getItemTier() {
		return this.tier;
	}

	private void setItemTier(Material material) {
		String materialName = material.toString();
		if (materialName.contains("WOOD") || materialName.contains("LEATHER")) {
			this.tier = ItemTier.COMMON;
		} else if (materialName.contains("STONE") || materialName.contains("CHAIN")) {
			this.tier = ItemTier.UNCOMMON;
		} else if (materialName.contains("IRON")) {
			this.tier = ItemTier.RARE;
		} else if (materialName.contains("DIAMOND")) {
			this.tier = ItemTier.EPIC;
		} else if (materialName.contains("GOLD")) {
			this.tier = ItemTier.LEGENDARY;
		} else {
			this.tier = ItemTier.TRASH;
		}
	}
}
