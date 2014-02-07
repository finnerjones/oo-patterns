package com.headfirst.patterns.strategy;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I ain't sayin' nothin'");
		System.out.println("There's no way you can make me quack!!!");
		System.out.println("I take the fifth ammendment");
	}

}
