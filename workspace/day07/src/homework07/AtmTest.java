package homework07;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
//		6. ATM 메뉴에서 입금, 출금 , 잔액조회 하기
//		[조건]
//		초기 잔액은 10000원 으로 설정
//		메뉴 선택에 따라 작업 수행
//		종료시 프로그램 종료
//		숫자(번호)로 입력받기 
//
//		String msg="\nATM 기기의 메뉴중 번호를 선택하세요 : "
//				+ "\n1. 잔액조회"
//				+ "\n2. 입금"
//				+ "\n3. 출금"
//				+ "\n4. 종료"
//				+ "\n선택 : "
//				sys.out.print(msg);
//		 	그 외의 번호를 입력하면 다시 선택하세요 출력 후 메뉴 보이기
//			번호 입력시 해당 메세지만 출력
		int num=0;
		do{
			Scanner sc =new Scanner(System.in);
			System.out.println("ATM기기의 메뉴 중 번호를 선택하세요"
					+"\n1. 잔금조회"
					+ "\n2. 입금"
					+ "\n3. 출금"
					+ "\n4. 종료"
					+ "\n선택 : ");
			num = sc.nextInt();
			int total=10000;
			
			switch(num) {
			case 1:
				System.out.println("잔금은 " + total);
				break;
			case 2:
				System.out.println("입금");
				break;
			case 3:
				System.out.println("출금");
				break;
			}
		}while(num<4);
		System.out.println("종료");
		
		
	}
}
