package task01;

public class Preson {
	// 슈퍼클래스 Person
	// 필드 : 이름, 나이
	// 생성자
	// 기본생성자(이름없음, 0) 전달
	// 매개변수가 2개있는 생성자
	// Person 생성자 호출 출력
	// 메소드
	// introduce 메소드 : 이름, 나이 출력하는 메소드
	// sleep 메소드 : 이름은 몇시에 잠을 잡니다 출력하는 메소드

	int age;
	String name;

	public Preson() {
		this("이름없음", 0);
	}

	public Preson(String name, int age) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("person 생성자 호출");
	}

	void introduce() {
		System.out.println("이름은 : " + this.name + ", 나이는 : " + this.age);
	}

	void sleep(int time) {
		System.out.println(this.name + "은 " + time + "시에 잠을 잡니다");
	}

}
