package abstarct2;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("--------");
		
		Animal animal = null;
		animal = new Cat();		
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		System.out.println("---------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
