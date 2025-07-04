package task01;

public class Student extends Preson {
	// 서브클래스 : Student
	// 필드 : 학번, 전공
	// 생성자
	// 기본생성자(이름없음, 0, 값없음, 전공없음) 전달
	// 매개변수가 4개 있는 생성자
	// student생성자 호출 출력
	// 부모클래스의 introduce메소드 오버라이딩
	// 부모 메소드 호출
	// 학번과 전공도 출력하는 메소드

	String num;
	String type;

	public Student() {
		this("이름없음", 0, "값없음", "전공없음");
	}

	public Student(String name, int age, String num, String type) {
		super(name, age);
		this.num = num;
		this.type = type;
		System.out.println("student 생성자 호출");
	}

	@Override
	void introduce() {
		// TODO Auto-generated method stub
		super.introduce();
		System.out.println("학번 : "+ this.num + "전공 : "+ this.type );
	}

	
	
}
