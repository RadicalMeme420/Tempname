package com.RadicalMeme420.RPGCore.item;

import org.bukkit.ChatColor;

public enum ItemTier {

	TRASH(ChatColor.WHITE), 
	COMMON(ChatColor.GRAY),
	UNCOMMON(ChatColor.GREEN),
	RARE(ChatColor.BLUE),
	EPIC(ChatColor.LIGHT_PURPLE),
	LEGENDARY(ChatColor.YELLOW);

	private ChatColor color;

	private ItemTier(ChatColor color) {
		this.color = color;
	}

	public ChatColor getColor() {
		return this.color;
	}
}
