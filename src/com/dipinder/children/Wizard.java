package com.dipinder.children;

import com.dipinder.human.Human;

public class Wizard extends Human {
	
	
	public Wizard(){
		setHealth(50);
		setIntelligence(8);
	}


	void heal(Human human) {
		human.setHealth(
				human.getHealth()+
				this.getIntelligence());
	}
	void fireball(Human human) {
		human.setHealth(
				human.getHealth()+
				(this.getIntelligence()*3));
		setStealth(getStealth()+getStealth());
	}
}
