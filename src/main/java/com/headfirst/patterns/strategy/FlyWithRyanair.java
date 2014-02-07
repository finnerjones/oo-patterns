package com.headfirst.patterns.strategy;

public class FlyWithRyanair implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I have no wings so I have to use Ryanair");
		System.out.println("Hopefully I won't have to use the toilet, it's very expensive");
	}

}
