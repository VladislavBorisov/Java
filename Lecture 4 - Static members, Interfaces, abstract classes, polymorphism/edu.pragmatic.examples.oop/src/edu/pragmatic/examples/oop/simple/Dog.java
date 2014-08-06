package edu.pragmatic.examples.oop.simple;

public class Dog extends Animal{
	
	protected String name;
	
	public void bringStick(){
		
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("Bau Bau");
	}

	@Override
	public void play() {
		System.out.println("Playing with stick");
		bringStick();
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a dog");
	}
	
}
