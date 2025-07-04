package methodOverride01;

public class cat extends Animal{

	@Override
	void sound() {
		//부모의 sound()메소드도 호출
		super.sound();
		
		System.out.println("야옹");
	}
	
}
