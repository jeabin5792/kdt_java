package day06_2;

import java.util.Scanner;

public class opertest_04 {
	public static void main(String[] args) {
		
		
		
		//두수를 입력받아 비교
		//크다, 작다, 같다 각각 상황에 맞게 출력되도록 로직 구성
		
		//입력클래스 import
		//입력 메세지 출력
		//변수 선언, 입력메소드 사용
		//입력메세지 출력
		//변수 선언, 입력메소드 사용
		//삼항연산자 사용하여 출력 => 크다/작다/같다가 출력
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("비교할 두 숫자를 입력하세요 : " );
		//int num1 =sc.nextInt();
		//int num2 =sc.nextInt();
		//String result = num1 < num2? num2 +"가 큽니다" : num1 > num2? num1 + "가 큽니다" : "둘 다 같은 수 입니다";
		//System.out.println(result);
		
		
		//2.한 개의 정수를 입력받아서 짝수인지 안닌지 출력하기
		
		//입력클래스 import
		//정수형 변수 1개 문자열변수 1개 (삼항연산자, 나머지연산자)
		//출력
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 두 숫자를 입력하세요 : " );
		int num3 =sc.nextInt();
		String result = (num3 % 2 == 0)? "짝수입니다" : "홀수입니다";
		System.out.println("입력한 숫자" + num3 +"는" +result);
		sc.close();
		}

}
