package inheritance01;

public class Student extends Person{
	//필드
	String major;

	
	
	
	//기본생성자
	public Student() { //같은 클래스의 다른 생성자 호출
		this("이름 없음",0,"전공없음");
		System.out.println("student기본생성자 호출");
	}




	public Student(String name, int age, String major) {
		super(name, age); //부모클래스의 생성자 호출
		this.major = major;
		System.out.println("student매개변수 생성자 호출");
	}
	
	//메소드
	void introduce() {
		super.introduce(); //부모클래스의 멤버 참조
		System.out.println("전공 : "+this.major); //현재 객체 자신을 참조
	}
	
	
	
	
}
