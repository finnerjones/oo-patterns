package com.headfirst.patterns.templatemethod;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("Steeping teabag in boiling water");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
		
	}

}
