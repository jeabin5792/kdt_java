package inheritanceConstructor01;
//3번 : 상속괸계 생성자 확인
public class Parents {
	//필드
	int number;

	
	
	//생성자
	public Parents() {
		super(); //부모클래스의 생성자, 모든 클래스의 부모클래스 Object클래스
		System.out.println("Partens 생성자 호출");
	}


	
	//메소드
	void prtntStr(String str) {
		System.out.println("부모 클래스에서 메소드 호출 : " + str);
	}
	
	
}
