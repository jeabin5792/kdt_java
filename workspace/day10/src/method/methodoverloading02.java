package method;
//7번 : 메소드 오버로딩2
public class methodoverloading02 {
	public static void main(String[] args) {
		methodoverloading02 m = new methodoverloading02();
		System.out.println(m.add(10, 20));
		System.out.println(m.add(10, 20,30));
		m.add(10.3, 5);
		m.add(10.4, 2);
	}
	
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	//매개변수의 개수가 다른 add메소드
	int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	// 매개변수의 탕비이 다른 add메소드
	void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//매개변수의 순서가 다른 add 매소드
	void add(int num2 ,double num1) {
		System.out.println(num1 + num2);
	}

}
