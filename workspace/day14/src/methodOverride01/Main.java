package methodOverride01;

public class Main {
	public static void main(String[] args) {
		Animal ani = new Animal();
		
		ani.name = "동물";
		ani.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		
		cat cat = new cat();
		cat.name = "별이";
		cat.sound();
	}
}
