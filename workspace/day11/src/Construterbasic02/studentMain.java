package Construterbasic02;
//2번 : 기본 생성자 획인
class student {
	//필드
	String name;
	int age;
	                               
	
	
	//기본 생성자
	public student() {
		System.out.println("기본 생성자가 호출되었습니다");
	}



	
	
	//매개변수가 1개있는 생성자
	public student(String name) {
		this.name = name;
//		System.out.println("매개변수가 1개인 생성자가 호출되었습니다");
		System.out.println(this);
	}

}


public class studentMain{
		public static void main(String[] args) {
			student st1 = new student();
			System.out.println(st1);
			
			student st2 = new student("짱구");
			System.out.println(st2);
			System.out.println(st2.name);
			
			
			student st3 = new student("이재빈");
			System.out.println(st3);
			System.out.println(st3.name);
			
		}
}
