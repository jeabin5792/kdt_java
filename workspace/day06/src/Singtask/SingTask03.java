package Singtask;

import java.util.Scanner;

public class SingTask03 {
public static void main(String[] args) {
		//로직 구성
		//입력 클래스 import
		//정수형 변수 선언
		//입력 메세지 출력
		//정수형 입력 메소드 nextInt()
		//출력
	Scanner sc = new Scanner(System.in);
	int total, price, luck;
	System.out.println("금액을 입력하시오 : ");
	total = sc.nextInt();
	System.out.println("곡 당 가격을 입력하시오 : ");
	price= sc.nextInt();
	luck = (total /price) / 5;
	System.out.println("보너스 곡" + luck + "추가");
	
	
	}
}
