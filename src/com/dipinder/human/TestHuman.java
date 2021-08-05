package com.dipinder.human;
import com.dipinder.children.*;


public class TestHuman {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Samurai sam = new Samurai();
		Samurai sam1 = new Samurai();
		Wizard wizz = new Wizard();
		
		ninja.attack(wizz);
		System.out.println(wizz.getHealth());
		System.out.println(sam.howMany());
	}

}
