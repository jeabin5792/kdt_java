package homework08;

public class ArrayTask06 {
	public static void main(String[] args) {
		//6. A~F까지 중 C 만 제외하고 배열에 담아 출력
		
		char ar[] = new char[6];
		
		for(int i=0; i<6; i++) {
			
			ar[i] = (char)(i+65);
			
			
		}
		for(int k=0; k<3; k++) {
			ar[2+k]=ar[3+k];
		}
		
		for(int j=0; j<ar.length; j++) {
			System.out.print(ar[j]);
		}
		
	}
}
