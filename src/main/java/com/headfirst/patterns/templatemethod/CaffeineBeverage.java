package com.headfirst.patterns.templatemethod;

public abstract class CaffeineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	private void boilWater() {
		System.out.println("boiling water");
		
	}

	private void pourInCup() {
		System.out.println("pouring in cup");
		
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
}
