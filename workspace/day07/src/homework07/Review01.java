package homework07;

import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		
		//1. 한개의 정수를 입력받라 짝수인지 홀수인지 출력하기(삼항연산자 이용)
		
		Scanner sc= new Scanner(System.in);//입력 클래스 import
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt(); //정수형 변수 선언
		System.out.println(num % 2 ==0 ? "짝수입니다" : "홀수입니다"); //삼항연산자를 이용해 짝수,홀수 구분
		System.out.println();
		
		
		
		//2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기(조건문)
		
		Scanner sc1= new Scanner(System.in); //입력 클래스 import
		System.out.println("숫자를 입력하세요 : ");
		int num2 =sc1.nextInt(); //정수형 변수 선언
		if(num2 > 0) {	//변수가 0보다 크면 양수
			System.out.println("양수입니다");
		}else if(num2 < 0){	//변수가 0보다 작으면 음수
			System.out.println("음수입니다");
		}else {	//둘다 아니면 0
			System.out.println("0입니다");
		}
		System.out.println();
		
		
		
		//3.나이를 입력받아서 다음 기준으로 출력하기
//		0~12 : 어린이입니다
//		13~19 : 청소년입니다
//		20 이상 : 성인입니다
//		
//		나이립력 : 16
//		현재 나이는 16살이고 청소년입니다
		Scanner sc2= new Scanner(System.in); //입력 클래스 import
		System.out.println("나이 입력 : ");
		int age =sc2.nextInt(); //정수형 변수 선언
		
		if(0<=age && age<=12) {
			System.out.println("현재 나이는 " + age + "살이고 어린이입니다");
		}else if(13<=age && age <=19) {
			System.out.println("현재 나이는 " + age + "살이고 청소년입니다");
		}else{
			System.out.println("현재 나이는 " + age + "살이고 성인입니다");
		}
		
		
		//4.세 개의 정수를 입력받아서 가장 작은 숫자부터 큰 숫자 순으로 정렬히여 출력하기
//		단 세 개의 정수는 모두 다른 숫자여야한다(중복값X)
//		숫자 3개 입력 : 1 9 5
//		정렬된 숫자  : 9 5 1
		
		Scanner sc3= new Scanner(System.in);
		System.out.println("숫자 3개 입력 : ");
		int num3=sc3.nextInt(), num4=sc3.nextInt(), num5=sc3.nextInt();
		if(num3>num4) {
			if(num3>num5) {
				if(num4>num5) {
					System.out.println("정렬된 숫자 : "+ num3 + " " + num4 + " " + num5);
				}else {
					System.out.println("정렬된 숫자 : "+ num3 + " " + num5 + " " + num4);
				}
			}else {
				System.out.println("정렬된 숫자 : "+ num3 + " " + num5 + " " + num4);
			}
		}else if(num4>num5) {
				if(num3>num5) {
					System.out.println("정렬된 숫자 : "+ num4 + " " + num3 + " " + num5);	
				}else {
					System.out.println("정렬된 숫자 : "+ num4 + " " + num5 + " " + num3);
				}
			}else {
				
		}
		
		
	}
}





