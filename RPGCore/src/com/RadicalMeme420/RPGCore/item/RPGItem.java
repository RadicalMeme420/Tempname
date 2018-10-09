package com.RadicalMeme420.RPGCore.item;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.RadicalMeme420.RPGCore.combat.effect.CombatEffectType;
import com.RadicalMeme420.RPGCore.combat.effect.DotEffect;
import com.RadicalMeme420.RPGCore.combat.effect.InstantEffect;
import com.RadicalMeme420.RPGCore.item.attribute.FireAttribute;
import com.RadicalMeme420.RPGCore.item.attribute.SmiteAttribute;
import com.RadicalMeme420.RPGCore.item.attribute.WeaponAttribute;

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
	
	static class RPGItemUtil {
		
		static ArrayList<WeaponAttribute> getWeaponAttributes(ItemStack i) { // TODO
			ArrayList<WeaponAttribute> attributes = new ArrayList<WeaponAttribute>();
			attributes.add(new FireAttribute(new DotEffect(CombatEffectType.FIRE, 10, 100, 5)));
			attributes.add(new SmiteAttribute(new InstantEffect(CombatEffectType.SMITE, 20)));
			return attributes;
		}
		
		static double getDamage(ItemStack i) { // TODO
			return 0;
		}
	}
}
