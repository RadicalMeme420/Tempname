package com.RadicalMeme420.RPGCore.item.attribute;

import com.RadicalMeme420.RPGCore.combat.effect.DotEffect;

public class FireAttribute extends WeaponAttribute implements DOTAttribute {

	public FireAttribute(DotEffect effect) {
		super(effect);
	}
	
	@Override
	public DotEffect getDOT() {

		return (DotEffect) this.getEffect();
	}

}
