public class Main{
	public static void main(String[] args){
		Cat cat = new Cat();
		Dog dog = new Dog();
		Frog frog = new Frog();

		cat.makeSound();
		
		dog.makeSound();
		dog.run();

		frog.makeSound();
		frog.run();
		frog.swim();
	}
}