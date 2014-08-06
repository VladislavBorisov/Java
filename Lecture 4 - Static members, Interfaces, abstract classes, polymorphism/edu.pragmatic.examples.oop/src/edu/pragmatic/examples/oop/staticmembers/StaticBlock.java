package edu.pragmatic.examples.oop.staticmembers;

public class StaticBlock {
	
	private String privateField ; 
	
	public StaticBlock(){
		privateField = "some private field";
		System.out.println("Creating a new instance of type " + getClass().getName());
	}
	
	static{
		System.out.println("Calling the static block");
	}

}
