package Construtethis03;
//6번 : this() 자기자신의 생성자 호출
public class person {
	//필드 
	String name;
	int age;
	String job;
	
	
	//생성자
	//기본생성자
	public person() {
	}

	
	
	
//	//매개변수 2개 생성자
//	public person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	//매개변수 3개 생성자
//	public person(String name, int age, String job) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.job = job;
//	}
	
	public person(String name) {
		this.name = name;
	}
	
	public person(String name, int age) {
		this(name);
		this.age = age;
	}
	

	public person(String name, String job) {
		this(name,22);
		this.job = job;
	}

	public person(String name, int age, String job) {
		this(name,job);
		this.age = age;
		
	}




	//메소드
	//printInfo() 정보출력
	void printInfo() {
		System.out.println("이름 : "+this.name+"나이 : "+ age + "직업 : "+ this.job);
	}
	


	// greet() 000님 안녕하세요 출력
	void greet(){
		System.out.println(this.name+"님 안녕하세요");
	}
	
}


