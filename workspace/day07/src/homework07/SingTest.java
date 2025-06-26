package homework07;

import java.util.Scanner;

public class SingTest {
	public static void main(String[] args) {
//		7. 코인 노래방 시스템을 구현하는 개발자입니다.
//		사용자로부터 금액을 입력받아 부를 수 있는 곡 수와 잔돈을 계산하고, 음료를 마실 수 있는지 여부도 안내하는 프로그램
//
//		[요구사항]
//		사용자에게 곡 당 가격을 입력받는다.
//		반복문을 사용하여 사용자에게 금액을 계속 입력받는다.
//		단, 0을 입력하면 프로그램은 종료된다.
//		입력받은 금액으로 부를 수 있는 곡 수와 잔돈을 출력한다.
//		곡 수 : 금액 ÷ 곡당 가격
//		보너스 : 5곡당 1곡 보너스 (예: 5곡 → 6곡, 10곡 → 12곡)
//		잔돈 : 금액 % 곡당 가격
//		음료(100원)를 마시고 싶다면, 음료 가격을 차감하고 노래를 줄이는 방식으로 대체 제안을 출력한다.
//		사용자에게 "음료를 구매하시겠습니까?" 라고 묻고
//		YES를 입력하면 대체 결과를 출력 NO를 입력하면 원래 계산된 노래 수를 유지한다
//		금액이 부족할 경우, 노래를 부를 수 없다는 안내 메시지를 출력한다.
//		입력은 정수로 받되, nextInt()다음에 nextLine()사용 조합을 사용하여 입력 오류를 방지한다.
//		대소문자 구분해서 YES/NO 처리한다.
//		Scanner는 한 번만 생성하고 마지막에 .close()로 닫을 것
		int money=0, price=0, num=0, sing =0, drink=100, drinksong=0, drinkchange =0, bonus=0;
		String check = null;
		Scanner sc= new Scanner(System.in);
		System.out.println("곡 당 가격 입력 : ");
		price = sc.nextInt();
		do {
			System.out.println("금액 입력(0입력시 종료) : ");
			money = sc.nextInt();
			sing= money/price;
			num= money-(sing*price);
			drinksong= sing-1;
			drinkchange = money-(drinksong * price + drink);
			System.out.printf("%d 곡을 부를 수있고 잔돈은 %d원 입니다\n", sing, num);
			Scanner sc2= new Scanner(System.in);
			System.out.println("음료를 구매하시겠습니까?(yes/no) : ");
			check = sc2.nextLine();
			switch(check) {
			
			case "yes":
				System.out.println("음료를 구매하셨습니다");
				System.out.printf("음료를 마시고 싶으면 %d곡을 부를수있으며 잔돈은 %d 원입니다", drinksong, drinkchange);
				System.out.println("");
				break;
			case "no":
				System.out.println("음료를 구매하지않았습니다");
				System.out.println("");
				break;
			}
		}while(money>0);
		System.out.println("종료");
		
		
	}
}
