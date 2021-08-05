package com.dipinder.children;

import com.dipinder.human.Human;

public class Ninja extends Human{
	
	public Ninja()
	{
		setStealth(10);
	}
	
	void steal(Human human) {
		human.setHealth(human.getHealth()-this.getStealth());
		this.setStealth(this.getStealth());

	}
}

