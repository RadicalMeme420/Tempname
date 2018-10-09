package com.RadicalMeme420.RPGCore.combat.effect;

public abstract class CombatEffect {
	
	private CombatEffectType type;
	private double effectAmount;
	
	public CombatEffect(CombatEffectType type, double effectAmount) {
		
	}

	public CombatEffectType getType() {
		return type;
	}

	public double getEffectAmount() {
		return effectAmount;
	}
	
	
}
