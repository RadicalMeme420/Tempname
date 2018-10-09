package com.RadicalMeme420.RPGCore.item.attribute;

import com.RadicalMeme420.RPGCore.combat.effect.CombatEffect;
import com.RadicalMeme420.RPGCore.combat.effect.DotEffect;
import com.RadicalMeme420.RPGCore.combat.effect.InstantEffect;
public class SmiteAttribute extends WeaponAttribute implements InstantAttribute {

	public SmiteAttribute(CombatEffect effect) {
		super(effect);
		if(effect instanceof DotEffect) {
			throw new IllegalArgumentException("InstantAttributes cannot contain type DotEffect");
		}
		
	}

	@Override
	public InstantEffect getInstantEffect() {
		return (InstantEffect) this.getEffect();
	}

}
