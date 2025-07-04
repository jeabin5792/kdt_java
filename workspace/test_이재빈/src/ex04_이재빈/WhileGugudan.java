package ex04_이재빈;

public class WhileGugudan {
	public static void main(String[] args) {
		
		int i=1;
		int j=2;
		while(i<=9) {
			while(j<=9) {
				System.out.printf("%d x %d = %d\t", j,i,i*j);
				j++;
			}
			i++;
			j=2;
			System.out.println();
		}
	}
}  
