package day07_01;

import java.util.Scanner;

//과제1 : 금액과 당 가격을 입력받아 부를 수 있는 곡 수와 잔돈 계산
public class dya07_2 {
	public static void main(String[] args) {
		
		//1) 입력클래스 import
		//2) 정수형 변수 4개 선언
		//3) 금액 입력 메세지 출력
		//4) 변수1 nextint()
		//5) 곡 당 입력 메세지 출력
		//6) 변수2 nextInt()
		//7) if else문 
			//if 문 조건식 변수1 < 변수2
			//입력한 금액과 부족한 금액 출력
			//else문
			//변수3 변수1 / 변수2
			//변수4 변수1 % 변수2
			//부를 수 있는 곡 수와 잔돈 출력
		//8)스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		int money = 0, price = 0, song = 0, change = 0;
		System.out.println("금액 입역 : ");
		money = sc.nextInt();
		System.out.println("곡 당 가격 입력 : ");
		price = sc.nextInt();
		if(money < price) {
			System.out.println("입역한 금액은 %d 원입니다. 한 곡당 가격은 %d 원으로 %d 원이 부족합니다", money, price, price - money);
		}else {
			song = money / price;
			change = money % price;
			System.out.println("%d  곡을 부를수 있으며 잔돈은 %d 원입니다", song, change);
		}
		
		
		
		
		
		
	}
}
