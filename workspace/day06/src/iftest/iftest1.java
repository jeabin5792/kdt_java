package iftest;
//9번 : 조건문(if문)
public class iftest1 {//클래스 시작
public static void main(String[] args) {//main 시작
	
	
	System.out.println("출력 시작");
	
	int number = 10;
	
	
	if(number == 10) {//if문 시작
		//System.out.println("if문의 조건식이 true입니다");
		//System.out.println("숫자는 " + number + "입니다");
		
		//조건식에서 number에 저장된 값이 10과 같다면
		//number 10을 더한 값을 저장 후 number 출력
		
		number += 10;
		System.out.println("숫자는 " + number + "입니다");
		
	}//if문 종료
	
	System.out.println("출력 끝");
	
	
	}
}
