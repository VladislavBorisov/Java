package edu.pragmatic.examples.oop.simple;

public abstract class Animal {
	protected int age;
	protected double weight;

	protected boolean isDangerous; 
	
	public void breathe() {
		System.out.println("Breating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public abstract void makeSomeNoise();
	public abstract void play();
}
