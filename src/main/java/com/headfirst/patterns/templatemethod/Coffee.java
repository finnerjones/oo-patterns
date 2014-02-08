package com.headfirst.patterns.templatemethod;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through the filter");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding milk and sugar");
		
	}

}
