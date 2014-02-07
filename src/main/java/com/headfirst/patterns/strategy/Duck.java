package com.headfirst.patterns.strategy;

public class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public void quack() {
		quackBehaviour.quack();
	}

	public void fly() {
		flyBehaviour.fly();
	}
}
