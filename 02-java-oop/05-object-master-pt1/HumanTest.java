package com.codingdojo.java.objectmaster;

public class HumanTest {

	public static void main(String[] args) {

		Human ninja = new Human("Kobe");
		Human samurai = new Human("Shaq");
		Human wizard = new Human("Phil");
			
		wizard.attack(ninja);
		samurai.attack(ninja);
		ninja.attack(samurai);

	}
}