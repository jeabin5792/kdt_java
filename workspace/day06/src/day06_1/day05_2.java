package day06_1;

import java.util.Scanner;

public class day05_2 {
	public static void main(String[] args) {
		
			//이름 : 홍길동
			//나이 : 20
			//홍길동님의 내년 나이는 21살입니다.
			//만 나이는 19살입니다.
		//1) 입력클래스 import
		//2) 정수형 변수 2개 선언
		//3) 입력 메세지
		//4) 변수 = sc.nextLine() 형변환
		//5) 입력메세지
		//6) 나이변수 = nextLine() 형변환
		//7) 출력
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	System.out.print("이름 입력 : ");
	name = sc.nextLine();
	System.out.print("나이 입력 : ");
	age = Integer.parseInt(sc.nextLine());
	System.out.println(name + "님의 내년 나이는 " + (age + 1) + "살입니다.");
    System.out.println("만 나이는 " + (age - 2) + "살입니다.");
  //main 끝
	}

}
