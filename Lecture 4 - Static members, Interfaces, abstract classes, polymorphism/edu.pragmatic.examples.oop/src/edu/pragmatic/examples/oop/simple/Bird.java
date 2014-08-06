package edu.pragmatic.examples.oop.simple;

public class Bird extends Animal{
	double flyingSpeed;
	
	void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("Piu piu");
	}

	@Override
	public void play() {
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a bird");
	}
	
	public void sing() {
		System.out.println("Singing...");
	}
}
