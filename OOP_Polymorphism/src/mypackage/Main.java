package mypackage;

public class Main {

	public static void main(String[] args) {
//create an array of Animal objects
		Animal[] animals = new Animal[3];
		//Assign difference type of animals to the array
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cow();
		//Loop though the array and call makeSound() on each animal
		
		for (Animal myanimal:animals) {
			myanimal.makeSound();
		}
		
	}

}
