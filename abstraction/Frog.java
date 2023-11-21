public class Frog implements Animal, LandAnimal, WaterAnimal{
	public void makeSound(){
		System.out.println("Kokak!");
	}

	public void run(){
		System.out.println("run!");
	}

	public void swim(){
		System.out.println("swimming");
	}
}