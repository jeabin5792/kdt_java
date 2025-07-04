package ex01_이재빈;

public class  Student extends Person{
//	필드 : 점수(접근제한자 private)
	private int score;

	
public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//	   생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
	public Student(String name, int age, int score) {
	super(name, age);
	this.score = score;
}

//	   점수계산메소드 오버라이딩 => 학생이름의 점수는 몇점입니다 출력
	@Override
	public void score() {
		System.out.println(getName()+"의 점수는 "+ score+ "입니다");
	}
	
	
//
//	[ 조건 ] Person클래스 Student클래스의 상속구조를 추상클래스나 인터페이스 구조로 확장하기
}
