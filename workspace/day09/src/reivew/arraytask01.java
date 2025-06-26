package reivew;

public class arraytask01 {
	public static void main(String[] args) {
		
		//1. 100~1까지의 값을 배열에 넣고 출력
		
		//1) 크기가 100인배열 선언
		//2) for문을 통해 100부터 1까지의 값 저장
		//3) for문 배열 출력
		
		int[] arr = new int[100];
		System.out.println(arr);
		
		
		//값 저장한느 반복문
		for(int i=0; i<arr.length;i++) {
			arr[i]=100-i;
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
		
		
		
		
	}
}
