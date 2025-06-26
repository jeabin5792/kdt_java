package homework08;

public class ArrayTask04 {
	public static void main(String[] args) {
		//4. 0 1 2 3 0 1 2 3 배열에 담고 출력
		
		int ar[] = new int[8];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				ar[j+(i*4)] =j;
			}
		}
		
		for(int k=0; k<8; k++) {
			System.out.print(ar[k] + " ");
		}
		
		
	}
}
