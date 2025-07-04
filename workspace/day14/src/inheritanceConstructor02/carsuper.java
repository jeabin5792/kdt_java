package inheritanceConstructor02;

public class carsuper extends car {
	// 필드
	boolean booster;

	// 생성자

//	public carsuper() {
//		super(); //부모생성자 호출
//	}
	public carsuper(int price, boolean booster) {
		super("bmw", "red", price);
		this.booster = booster;
	}

	public carsuper(String brand, String color, int price, boolean booster) {
		super(brand, color, price);
		this.booster = booster;
	}
	
	// 메소드
	void boosterOn() {
		System.out.println("부스터 가동");
	}
	void boosterOff() {
		System.out.println("부스터 중지");
	}
	
	
	
	
	
}
