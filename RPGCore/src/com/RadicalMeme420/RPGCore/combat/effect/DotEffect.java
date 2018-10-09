package com.RadicalMeme420.RPGCore.combat.effect;

public class DotEffect extends CombatEffect {
	

	private double delayMS;
	private int repeats;	
	
	public DotEffect(CombatEffectType type, double effectAmount, double delayMS, int repeats) {
		super(type, effectAmount);
		this.delayMS = delayMS;
	}
	
	public long getDelayTicks() {
		return (long) (delayMS/50);
	}

	public double getDelayMS() {
		return delayMS;
	}

	public int getRepeats() {
		return repeats;
	}
	
}
