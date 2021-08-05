package com.dipinder.human;

public class Human {
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void attack(Human opponent) {
		System.out.println("OOO just attacked another human and decreased their health by 3");
		opponent.health -= this.strength;
	}

}

