package review;

public class Person {
	//필드
	private String name;
	private int age;
	private String birth;
	
	
	
	//생성자
	public Person(String name) {
		super();
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBirth() {
		return birth;
	}



	public void setBirth(String birth) {
		this.birth = birth;
	}



	public String getName() {
		return name;
	}
	
	void introduce() {
		System.out.println("이름 : "+this.name + "이고, 나이는 : "+this.age+"입니다");
	}
	
	
}


















