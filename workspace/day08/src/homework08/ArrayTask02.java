package homework08;

public class ArrayTask02 {
	public static void main(String[] args) {

		//		2. 1~10까지의 값을 배열에 넣고 총 합을 출력
		
		int[] ar = new int[10];
		
		for(int i=0; i<10; i++) {
			ar[i] = 1 +  i;
		}
		
		int total=0;
		
		for(int j = 0; j <10; j++) {
			total = ar[j]+total;
		}
		System.out.println(total);
		
		
		
		
		
		
		
	}
}
