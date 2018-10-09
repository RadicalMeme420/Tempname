package com.RadicalMeme420.RPGCore.item;

import java.util.ArrayList;

import org.bukkit.inventory.ItemStack;

import com.RadicalMeme420.RPGCore.item.attribute.WeaponAttribute;

public class RPGWeapon extends RPGItem {

	private double damage;
	
	private ArrayList<WeaponAttribute> attributes;
	
	public RPGWeapon(ItemStack i) {
		super(i);
	}

}
