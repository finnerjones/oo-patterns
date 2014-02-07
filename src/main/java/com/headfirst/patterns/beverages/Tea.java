package com.headfirst.patterns.beverages;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		steepTeaInBag();
		pourInCup();
		addLemon();
		
	}

	private void addLemon() {
		System.out.println("adding lemon");
	}

	private void pourInCup() {
		System.out.println("pouring into cup");
		
	}

	private void steepTeaInBag() {
		System.out.println("steeping bag in boiling water");
		
	}

	private void boilWater() {
		System.out.println("boiling water");
		
	}

}
