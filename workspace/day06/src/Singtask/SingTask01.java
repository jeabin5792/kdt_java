package Singtask;

import java.util.Scanner;

public class SingTask01 {
public static void main(String[] args) {
		
		
		//1) 로직 구성
		//입력 클래스 import
		//정수형 변수 선언
		//입력 메세지 출력
		//정수형 입력 메소드 nextInt()
		//출력
	
		Scanner sc = new Scanner(System.in);
		int total, price;
		System.out.println("금액을 입력하시오 : ");
		total = sc.nextInt();
		System.out.println("곡 당 가격을 입력하시오 : ");
		price= sc.nextInt();
		System.out.println("[출력]");
		System.out.println(total /price + "곡을 부를 수 있으며 잔돈은 " + total % price);
	
		//2) 로직 구성
		//입력 클래스 import
		//정수형 변수 선언
		//입력 메세지 출력
		//정수형 입력 메소드 nextInt()
		//출력
			
		Scanner sc1 = new Scanner(System.in);
		int total1, price1;
		System.out.println("금액을 입력하시오 : ");
		total1 = sc1.nextInt();
		System.out.println("곡 당 가격을 입력하시오 : ");
		price1 = sc1.nextInt();
		System.out.println("[출력]");
		System.out.println("입력한 금액은" + total1 + "입니다");
		if(total1 < price1) {
			System.out.println("곡 당 가격은" + price1 + "으로" + (price1-total1) + "원이 부족하여 노래를 부를 수 없습니다");
		}else {
			System.out.println(total /price + "곡을 부를 수 있으며 잔돈은 " + total % price);
		}
		
		
		
	
	
	}
}
