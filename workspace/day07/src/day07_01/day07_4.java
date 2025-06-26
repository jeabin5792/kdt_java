package day07_01;

import java.util.Scanner;

//3) 복습문제
public class day07_4 {
	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기
		
		//로직구성
		//1)입력클래스 import
		//2)정수형 변수 num 선언
		//3)입력 메세지
		//4)변수에 정수형 입력 메소드 nextInt()
		//5)if(0<num, 1<=num && num<=10, num<11)
			//num*num출력
		//else
			//잘못 입력했습니다 출력
		//6)sc.close()
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("숫자 입력 : ");
		num = sc.nextInt();
		if(0<num && num<11) {
			System.out.println(num*num);
		}else {
			System.out.println("잘못 입력했습니다");
		}
		sc.close();
	}
}
