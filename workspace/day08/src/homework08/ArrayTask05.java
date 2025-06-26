package homework08;

public class ArrayTask05 {
	public static void main(String[] args) {
		//5. A~F까지를 배열에 값을 넣고 출력
		
		char ar[] = new char[6];
		
		for(int i=0; i<6; i++) {
			ar[i] = (char)(i+65);
		}
		
		for(int j=0; j<ar.length; j++) {
			System.out.print(ar[j]);
		}


	}
}
