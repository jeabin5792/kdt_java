package homework08;

public class ArrayTask01 {
	public static void main(String[] args) {
		//1. 100~1까지의 값을 배열에 넣고 출력
		
		//자료형[] 배열명 = new 자료형[배열크기];
		//반복문으로 배열에 100~1까지 값을 저장
		
		int[] ar = new int[100];
		
		for(int i=0; i<100; i++) {
			ar[i] = 100 - i;
		}
		
		for(int j=0; j <100; j++) {
			System.out.println(ar[j]);
		}
		
		
	}
}
