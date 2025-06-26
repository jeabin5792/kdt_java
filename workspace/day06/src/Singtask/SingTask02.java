package Singtask;

import java.util.Scanner;

public class SingTask02 {
public static void main(String[] args) {
	
			//3) 로직 구성
			//입력 클래스 import
			//정수형 변수 선언
			//입력 메세지 출력
			//정수형 입력 메소드 nextInt()
			//출력
	Scanner sc = new Scanner(System.in);
	int total, price=200, drink=100;
	System.out.println("금액을 입력하시오 : ");
	total = sc.nextInt();
	System.out.println("[출력]");
	System.out.println(total /price + "곡을 부를 수 있으며 잔돈은 " + total % price);
	System.out.println("음료를 마시고 싶으면" + (total-drink) / price + "곡을 부를 수 있고 잔돈은 " + (total-drink) % price);
}
}
