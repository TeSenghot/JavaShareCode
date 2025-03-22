//Subclass Dog
package mypackage;

public class Dog extends Animal{

	//overiding make dog sounds
	
	@Override
	public void makeSound() {
		System.out.println("Woof Woof!");
	}
	
}
