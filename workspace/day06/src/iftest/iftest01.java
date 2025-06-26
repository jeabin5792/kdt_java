package iftest;

import java.util.Scanner;

//11번 : if ~ else문 실습1
public class iftest01 {
	public static void main(String[] args) {
		
		//사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		
		//로직구성
		//입력클래스 import
		//정수형 변수 선언
		//입력 메세지 출력
		//정수형 입력 메소드 nextInt()
		//조건문(if ~ else문)
			//if 조건식 산술연산자 %, 관계연산자 ==
			//if 출력 메소드
			//else 출력 메소드
		//스캐너 닫기
		
		
		Scanner sc = new Scanner(System.in);
		int num1 =0;
		//자료형들의 기본값
		//정수 = 0, 실수 = 0.0, 문자형 = ' ', 문자열 = " " or null, 논리형 false
		System.out.println("숫자 입력 : ");
		
		num1 = sc.nextInt();
		if(num1 %2 == 0) {
			System.out.println(num1 + "는 짝수입니다");
		}else {
			System.out.println(num1 + "는 홀수입니다");
		}
		sc.close();
		System.out.println((num1 % 2 != 1) ? "짝수입니다" : "홀수입니다");
		
	}

	
}

