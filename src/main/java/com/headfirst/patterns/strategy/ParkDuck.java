package com.headfirst.patterns.strategy;

public class ParkDuck extends Duck {

	public ParkDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	@Override
	public String toString() {
		return "I am an ordinary park duck. ";
	}
	
}
