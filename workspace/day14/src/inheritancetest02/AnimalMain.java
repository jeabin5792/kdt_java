package inheritancetest02;

public class AnimalMain {
	public static void main(String[] args) {
		// 동물 클래스의 객체 생성
		Animal animal = new Animal();
		System.out.println(animal);
		// Animal 클래스에 있는 필드와 메소드만 사용 가능
		animal.name = "사자야";
		System.out.println(animal.name);
		animal.sleep(10, "초원");
		// animal.fly()
		// bird 자식 클래스에서 생성한 메소드는 부모클래스 객체로 사용 불가

		// Brid클래스를 만들고 객체 생성
		Bird bird = new Bird();
		System.out.println(bird);
		bird.name = "짹짹이";
		bird.type = "참새";
		bird.age = 2;
		bird.fly();
		bird.eat("새우깡");

		// 강아지 클래스의 객체 생성
		dog dog = new dog();
		dog.name = "달이";
		dog.age = 5;
		dog.type = "말티즈";

		// 고양이 클래스의 객체 생성
		cat cat = new cat();
		dog.name = "별이";
		dog.age = 6;
		dog.type = "샴";

		System.out.println(cat);
		System.out.println(cat.name);
		cat.meow();
		System.out.println(dog);
		System.out.println(dog.name);
		dog.bark();
	}
}
















