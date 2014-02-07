package com.headfirst.patterns.strategy;

public class WeirdDuck extends Duck {

	public WeirdDuck() {
		flyBehaviour = new FlyWithRyanair();
		quackBehaviour = new MuteQuack();
	}
	
	@Override
	public String toString() {
		return "I am a weird duck.";
	}
}
