package day06_2;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class opertest_01 {
	public static void main(String[] args) {
		//사용자가 입력한 값 2개를 서로 비교하기(관계연산자 3개 확인)
		//nextint() 사용, 변수를 먼저 만들고 진행할 것
		//변수 만들 때 의미있는 문자로 사용
		//로직구성부터
		
		
		//입력클래스 import
		Scanner sc = new Scanner(System.in);
		//정수형 변수 2개 선언
		int num1, num2;
		//입력 메세지 출력(숫자 2개를 입력(띄어쓰기로) : )
		//System.out.println("비교할 변수 입력(띄어쓰기로 입력하시오) : ");
		//정수형 변수 입력메소드 (nextInt())
		//num1 = sc.nextInt();
		//num2 = sc.nextInt();
		//출력(3개)
		//System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		//System.out.println(num1 + " > " + num2 + " : " + (num1 < num2));
		//System.out.println(num1 + " < " + num2 + " || " + num1 + " == " + num2 + " : " + (num1 > num2 || num1 == num2));
		//+) sc.close();
		
		
		//실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
		//0.00000001 0.0000000001
		//1.0E-8 < 1.0E-11
		//1.0E-8 10의 -8제곱
		//1.0E-11 10의 -11제곱
		//System.out.println(num1 + " > " + num2 + " : " + (num1 < num2));
		//System.out.println(num1 + " < " + num2 + " || " + num1 + " == " + num2 + " : " + (num1 > num2 || num1 == num2));
	}
}
