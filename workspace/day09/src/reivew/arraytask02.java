package reivew;

public class arraytask02 {
	public static void main(String[] args) {
		//2. 1~10까지의 값을 배열에 넣고 총합을 출력
		
		//1) 10칸 짜리 배열 선언
		//2) 총 합 수할 변수 선언
		//3) for문(1부터 10까지 저장)
		//		int i=0; => 배열명[i] = i + 1;
		//		총 합 구알 변수 += 배열명[i];
		//4)총 합 출력
		
		int[] arr =new int[10];
		int sum=0;
		
		for(int i= 0; i<arr.length; i++) {
			arr[i] = i+1;
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
	}
}
