package com.dipinder.children;

import com.dipinder.human.Human;

public class Samurai extends Human{
	
	private static int nums = 0;
	
	public Samurai(){
		setHealth(200);
		nums++;
	}
	void deathBlow(Human human){
		human.setHealth(human.getHealth()-100);
		setHealth(getHealth()-100);
	}
	void meditate() {
		setHealth(getHealth()+50);
	}
	public static int howMany() {
		return nums;
	}
}
