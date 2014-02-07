package com.headfirst.patterns.strategy;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeak! Squeak! I feel a bit quacking strange saying squeak .. ");
	}

}
