package ex04_이재빈;

public class ForGugudan {
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d x %d = %d\t", j,i,i*j);
			}
			System.out.println();
		}
	}
}
