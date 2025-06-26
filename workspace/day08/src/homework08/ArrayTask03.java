package homework08;

import java.util.Scanner;

public class ArrayTask03 {
	public static void main(String[] args) {
		
		//3. 3명의 수학점수를 사용자에게 입력받아 배열에 저장하고 평균 점수를 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3명의 수학 점수를 입력하시오 : ");
		int math1 = sc.nextInt(),math2 = sc.nextInt(),math3 = sc.nextInt();
		
		int ar[] = new int[3];
		
		ar[0] = math1;
		ar[1] = math2;
		ar[2] = math3;
		
		int ever = (math1+math2+math3) / 3;
		
		System.out.println("3명의 평균 점수는 : " + ever);
		
		
	}
}
