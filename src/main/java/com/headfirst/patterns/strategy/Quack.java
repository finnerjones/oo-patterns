package com.headfirst.patterns.strategy;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack! Quack! I am a quacker!!");
	}

}
