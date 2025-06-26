package Construtethis01;
//5번 : 필드와 매개병수와 지역변수

class student{
	//필드
	String name;
	int age;
	//생성자
	public student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(name);
	}
	
	//매소드 
	void studentInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}
	
	void studentInfo(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age); //매개변수에 저장된 값 stack메모리
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age); //this.name, this.age는 객체의 필드에 저장된 값 heap메모리
	}
	
}
public class studentMain {
	public static void main(String[] args) {
		student st1 = new student("짱구", 5);
		
		st1.studentInfo("철수", 6);
		
	}
}
