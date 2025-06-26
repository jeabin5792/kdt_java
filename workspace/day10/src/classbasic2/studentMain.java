package classbasic2;
//11번 : student 클래스 main
public class studentMain {
	public static void main(String[] args) {
		
		student st1 = new student();
		System.out.println(st1);	//classbasic2.student@279f2327
		
		st1.name = "홍길동";
		st1.age = 17;
		st1.gpa = 4.5;
		
		System.out.println("이름 : "+ st1.name);
		System.out.println("나이 : "+ st1.age);
		System.out.println("학점 : "+st1.gpa);
				
		
	}
}
