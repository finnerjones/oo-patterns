package com.headfirst.patterns.beverages;

public class Coffee {

	public void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
		
	}

	private void addSugarAndMilk() {
		System.out.println("adding sugar and milk");
		
	}

	private void pourInCup() {
		System.out.println("pouring into cup");
		
	}

	private void brewCoffeeGrinds() {
		System.out.println("brewing coffee in boiling water");
		
	}

	private void boilWater() {
		System.out.println("boiling water");
		
	}
}
