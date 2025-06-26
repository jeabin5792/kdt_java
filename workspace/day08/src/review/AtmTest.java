package review;
//복습2
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
		
		//1)입력 클래스 import
		//2)정수형 변수 choice, money, 문자열 메세지 변수
		//3)반복문(while문 true)
		//	3-1)입력 메세지 출력
		//	3-2)choice 입력메소드 nextInt()
		//	4)switch
		//	4-1)case1
		//		4-1-1) 잔액조회 출력
		//		4-1-2) break;
		//	4-2)case2
		//		4-2-1) 입금 출력
		//		4-2-2) break;
		//	4-3)case3
		//		4-3-1) 출금 출력
		//		4-3-2) break;
		//	4-4)case4
		//		4-4-1) 종료 출력
		//		4-4-2) sc.close();		
		//		4-4-3) return;
		//	4-5)default:
		//		4-5-1)다시 선택 출력
		//		4-5-2)break;
		
		
		Scanner sc = new Scanner(System.in);
		String msg="\nATM 기기의 메뉴중 번호를 선택하세요 : "
				+ "\n1. 잔액조회"
				+ "\n2. 입금"
				+ "\n3. 출금"
				+ "\n4. 종료"
				+ "\n선택 : ";
		int money = 10000, choice = 0;
		boolean isTrue = true;
		while(isTrue) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("잔액조회");
				break;
			case 2:
				System.out.println("입금 기능입니다");
				break;
			case 3:
				System.out.println("출금 기능입니다");
				break;
			case 4:
				System.out.println("Atm 프로그램 종료");
				sc.close();
				//return; //main 종료 => 프로그램 종료
				isTrue = false;
				break;
				
			}//switch중괄호
			System.out.println("while문 안");
			
		}//while중괄호
		System.out.println("while문 밖");
		
		
		
		
		
		
	}
}













