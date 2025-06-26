package day07_01;

import java.util.Scanner;

public class day07_3 {
	public static void main(String[] args) {
		//1)입력 클래스 import
		//2)정수형 상수 2개 선언, 정수형 6개 선언(금액 입력, 노래곡수, 잔돈, 음료마실경우 노래곡수, 음료마실경우잔돈, 보너스곡)
		//3)입력 메세지
		//4)금액입력 = 금액 입력 nextInt()
		//5)노래곡수 = 금액/ 상수1
		//6)잔돈 = 금액 % 상수1
		//7)출력(몇곡 부를수있으며 잔돈은 얼만입니다)
		//8)음료를 마시기위해  한곡을 줄이는 경우
		//if((노래곡수 > 0) && (금액 -((노래곡수 -1)* 노래가격) >= 음료금액)){
			//9) 음료마실경우 노래곡수 = 노래 곡수 -1;
			//10) 음료마실경우 잔돈 = 금액 - (음료마실 경우 노래곡수 * 상수1 + 상수2)
		//11)보너스 제공
		//보너스곡 = 노래곡수 / 5
		//12)if(보너스곡 > 0){
			//보너스롤 몇곡이 추가되어 총 몇곡을 부를수 있습니다
		//+) sc.close()
		
		Scanner sc = new Scanner(System.in);
		final int PRICE =200, PRICE_DRINK=100;
		int money =0, song =0, change=0, drinksong=0, drinkchange =0, bouns=0;
		System.out.println("금액입력 : ");
		money = sc.nextInt();
		song = money / PRICE;
		drinksong = song -1 ;
		change = money % PRICE;
		System.out.printf("%d 곡을 부를 수있고 잔돈은 %d원 입니다\n", song, change);
		if(change >= PRICE_DRINK) {
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를수있으며 %d 원입니다", song, change-PRICE_DRINK);
		}else if(song > 0 && (money -(drinksong* PRICE)) >= PRICE_DRINK) {
			drinkchange = money-(drinksong * PRICE + PRICE_DRINK);
			System.out.printf("음료를 마시고 싶으면 %d곡을 부를수 있으며 잔돈은 %d원입니다",drinksong, drinkchange);
		}
		bouns =song /5;
		if(bouns > 0) {
			System.out.printf("보너스로 %d곡이 추가되어 총 %d곡을 부를 수있습니다\n", bouns, song+bouns);
		}
		sc.close();
	}
}
