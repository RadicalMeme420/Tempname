package com.RadicalMeme420.RPGCore.item.attribute;

import com.RadicalMeme420.RPGCore.combat.effect.CombatEffect;

public abstract class WeaponAttribute {
	
	private CombatEffect effect;
	
	public WeaponAttribute(CombatEffect effect) {
		this.effect = effect;
	}
	
	public CombatEffect getEffect() {
		return this.effect;
	}
}
