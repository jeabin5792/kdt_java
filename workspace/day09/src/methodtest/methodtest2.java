package methodtest;
//10번 : 메소드 호출방법
public class methodtest2 {
	public static void main(String[] args) {
		
		
		//메소드 호출방법 2가지
		//1) 메소드 정의한느 부분레서 static키워드를 붙인다(static 배우기전까지 사용 x)
		//main 메소드가 메모리에 할당될 때 해당 메소드로 같이 메모리 할당시키는 방법
		//2) 메인 메소드가 해당 메소드가 있는클래스를 알려준다
		//클래스명 객체명 = new 클래스명();=> syso(객체명.메소드명());
		methodtest2 mt = new methodtest2();
//		System.out.println(mt);
		
		//매개변수 x 리턴값 x 매소드 호출 -> 객체명.메소드명();
		mt.printhello();
		
		//매개변수o 리턴값x 메소드 호출 -> 객체명.메소드명(인수);
		mt.greet("이재빈");
		mt.greet("짱구");
		mt.greet("철수");
		
		//매개변수x 리턴값o 메소드 호출 => syso(객체명.메소드명());
		//						or 리턴타입 변수명=객체명.메소드명();
		System.out.println(mt.printtotal());
		int number = mt.printtotal();
		System.out.println(number);
		
		
		
		//매개변수o 리턴값o 메소드 호출 => syso(객체명.메소드명(인수));
		//						or 리턴타입 변수명 = 객체명.메소드명(인수);
		
		System.out.println(mt.printNum(99));
		
		
	}
	
	//매개변수 x 리턴값x 메소드 정의
	//"안녕하세요" 출력하는 메소드
	void printhello() {
		System.out.println("안녕하세요");
	}
	
	
	//매개변수 o 리턴값x 메소드 정의
	//이름 + 님 환영합니다 출력
	void greet(String name) {
		System.out.println(name + "님 환영합니다");
	}
	
	//매개변수x 리턴값o 메소드 정의
	//1부터 10까지의 합을 반환하는 메소드

	//1) 총 합 구할 변수
	//2) for문 초기식 int i=1; i<=10; i++
	//3) 	총합구할변수 += i;
	//4)출력
	int printtotal() {
		int total =0;
		for(int i=1; i<=10; i++) {
			total += i;
		}
		return total;
	}
	
	
	//매개변수 o 리턴값o 메소드 정의
	//정수1개를 넘겨 받아 1부터 넘겨받은 정수까지의 합을 반환하는 메소드
	
	int printNum(int num) {
	      //1부터 num까지의 합 반환하는 기능
	      int total = 0;
	      for(int i = 1; i <= num; i++) {
	         total += i;
	      }
	      return total;
	}
	
	
}











