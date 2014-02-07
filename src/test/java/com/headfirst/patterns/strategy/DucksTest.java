package com.headfirst.patterns.strategy;

import org.junit.Ignore;
import org.junit.Test;

public class DucksTest {

	
	@Test
	public void aParkDuck() {
		Duck parkDuck = new ParkDuck();
		// obviously we would put asserts here but not today :o)
		parkDuck.quack();
		parkDuck.fly();
	}
	
	@Test
	public void aWeirdDuck() {
		Duck weirdDuck = new WeirdDuck();
		// obviously we would put asserts here but not today :o)
		weirdDuck.fly();
		weirdDuck.quack();
	}
	
	@Test
	/* 
	 * this is the hand-on part, what happens when we remove the @Ignore? 
	 * 
	 */
	@Ignore
	public void aRuntimeDuck() {
		Duck runtimeDuck = new Duck();
		// obviously we would put asserts here but not today :o)
		runtimeDuck.fly();
		runtimeDuck.quack();		
	}
}
