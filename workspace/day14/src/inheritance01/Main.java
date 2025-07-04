package inheritance01;

public class Main {
	public static void main(String[] args) {
		System.out.println("student 기본생성자");
		Student st1 = new Student();
		
		System.out.println("=====student 매개변수 생성자======");
		Student st2 = new Student("이재빈",20,"정보보안학과");
		System.out.println(st2);
		
		System.out.println("=====introduce()메소드 호출======");
		st2.introduce();
	}
}
