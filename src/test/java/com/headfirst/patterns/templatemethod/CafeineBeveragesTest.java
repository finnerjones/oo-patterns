package com.headfirst.patterns.templatemethod;

import org.junit.Test;

public class CafeineBeveragesTest {

	
	@Test
	public void makeSomeTea() {
		Tea tea = new Tea();
		// obviously we would use asserts here, but not today
		tea.prepareRecipe();
	}
	
	
	@Test
	public void makeSomeCoffee() {
		Coffee coffee = new Coffee();
		// obviously we would use asserts here, but not today
		coffee.prepareRecipe();
	}
}
