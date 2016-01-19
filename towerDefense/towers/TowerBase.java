package towerDefense.towers;

import towerDefense.enemies.EnemyBase;

public abstract class TowerBase {

	private int range, maxTargets, attackDelay, damage;
	private int cooldown;
	private boolean isAoE;
	
	public TowerBase(int range, int maxTargets, int attackDelay, int damage, boolean isAoE){
		this.range = range;
		this.maxTargets = maxTargets;
		this.attackDelay = attackDelay;
		this.damage = damage;
		this.isAoE = isAoE;
	}
	
	public void attack(EnemyBase e){
		cooldown = getAttackDelay();
		e.onAttacked(this);
	}
	
	public boolean canAttack(){
		return cooldown == 0;
	}

	public boolean isAoE() {
		return isAoE;
	}

	public void setIsAoE(boolean isAoE) {
		this.isAoE = isAoE;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAttackDelay() {
		return attackDelay;
	}

	public void setAttackDelay(int attackDelay) {
		this.attackDelay = attackDelay;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getMaxTargets() {
		return maxTargets;
	}

	public void setMaxTargets(int maxTargets) {
		this.maxTargets = maxTargets;
	}
	
	public void dropCooldown(){
		if(cooldown > 0)
			cooldown--;
	}
}
