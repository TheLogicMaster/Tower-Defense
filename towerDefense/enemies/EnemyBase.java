package towerDefense.enemies;

import towerDefense.towers.TowerBase;

public abstract class EnemyBase {

	private int health, speed, shield;//shield blocks damage from each hit
	
	public abstract void onAttacked(TowerBase t);

	public int getHealth(){
		return health;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getShield(){
		return shield;
	}
	
	public void setHealth(int num){
		health = num;
	}
	
	public void setSpeed(int num){
		speed = num;
	}
	
	public void setShield(int num){
		shield = num;
	}
}
