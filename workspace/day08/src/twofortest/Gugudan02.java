package twofortest;

public class Gugudan02 {
	public static void main(String[] args) {
		
//		for(int k=2; k<=9; k++) {
//			System.out.print(k+ "단\t\t");
//		}
//		System.out.println();
//		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9;j++) {
//				System.out.printf("%d x %d = %2d\t",j,i,j*i);
//				System.out.print(j + " X " + i + " = " + i*j + "\t");
//			}
//			System.out.println();
//		}
		
		
		
//		for(int n=1; n<=9; n+=3) {
//			for(int k=0; k<=2; k++) {
//				System.out.print((n+k)+ "단\t\t");
//			}
//			System.out.println();
//			for(int i=1; i<=9; i++) {
//				for(int j=0; j<=2;j++) {
//					System.out.print((j+n) + " X " + i + " = " + i*(j+n) + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			
//		}
		
		
		int i=1, j=1, k=1;
		while(i<=9) {
			System.out.print(i+ "단\t\t");
			i++;
		}
		System.out.println();
		
		while(j<=9) {
			while(k<=9) {
				System.out.printf("%d X %d = %2d\t",j,k,j*k);
//				System.out.print(j + " X " + k + " = " + j*k + "\t");
				k++;
			}
			j++;
			k=1;
			System.out.println();
		}
		
		
		
	}
}
