package edu.pragmatic.examples.oop.simple;

public class Demo {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.walk();
//		Cat c = new Cat();
//		c.makeSomeNoise();
		
		
		IZoo zoo = new Zoo(10);
		Animal cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		((Zoo) zoo).addAnimal(cat);
//		zoo.addAnimal(dog);
//		zoo.addAnimal(bird);
		
		int[] intArray = new int[] {5, 6, 7};
		
		Animal[] animalsInTheZoo = (Animal[])zoo.getAnimals().toArray();
//		
//		for (int i = 0; i < animalsInTheZoo.length; i++) {
//			if(animalsInTheZoo[i] != null) {
//			   animalsInTheZoo[i].walk();
//			   animalsInTheZoo[i].makeSomeNoise();
//			}
//		}	

	}
}
