package ex05_이재빈;

import java.util.Scanner;

public class Main {
//	사용자로부터 학생 수를 입력받는다.
//	각 학생에 대해 다음 정보를 입력받는다.
//	    이름, 전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE), Java, DBMS, HTML 점수
//
//	3명의 학생 점수를 입력받고 결과가 아래와 동일하게 나올 수 있도록 한다.
	public static void main(String[] args) {
//		Student st1 = new Student(name, java, dbms, html, major);
		Student st2 = new Student();
		Student st3 = new Student();
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명의 학생을 입력하시겠습니까? : ");
		int stu = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=stu; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("["+i+"번째 학생 정보 입력]");
			System.out.println("이름 : ");
			String name = sc2.next();
			System.out.println("전공 (COMPUTER_SCIENCE / CYBER_SECURITY / ARTIFICIAL_INTELLIGENCE) : ");
			String major = sc2.next();
			System.out.println("Java 점수 : ");
			int java = sc2.nextInt();
			System.out.println("DBMS 점수 : ");
			int dbms = sc2.nextInt();
			System.out.println("HTML 점수 : ");
			int html = sc2.nextInt();
			Student st1 = new Student(name, java, dbms, html, major);
			
		}
		
		System.out.println("=====성적 출력======");
		System.out.println(st1.getTotalScore());

	}
}
