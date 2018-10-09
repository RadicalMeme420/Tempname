package com.RadicalMeme420.RPGCore.item;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

import com.RadicalMeme420.RPGCore.item.attribute.DOTAttribute;
import com.RadicalMeme420.RPGCore.item.attribute.InstantAttribute;
import com.RadicalMeme420.RPGCore.item.attribute.WeaponAttribute;

public class RPGWeapon extends RPGItem {

	private double damage;

	private ArrayList<WeaponAttribute> attributes;

	public RPGWeapon(ItemStack i) {
		super(i);
		this.damage = RPGItemUtil.getDamage(i);
		this.attributes = RPGItemUtil.getWeaponAttributes(i);
	}

	public double getDamage() {
		return this.damage;
	}

	public ArrayList<InstantAttribute> getInstantAttributes() {
		ArrayList<InstantAttribute> InstantAttribs = new ArrayList<InstantAttribute>();
		for (WeaponAttribute a : this.attributes) {
			if (a instanceof InstantAttribute) {
				InstantAttribs.add((InstantAttribute) a);
			}
		}
		return InstantAttribs;
	}

	public ArrayList<DOTAttribute> getDotAttributes() {
		ArrayList<DOTAttribute> DOTAttribs = new ArrayList<DOTAttribute>();
		for (WeaponAttribute a : this.attributes) {
			if (a instanceof DOTAttribute) {
				DOTAttribs.add((DOTAttribute) a);
			}
		}
		return DOTAttribs;
	}

}
