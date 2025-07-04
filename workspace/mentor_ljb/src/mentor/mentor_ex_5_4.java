package mentor;

public class mentor_ex_5_4 {
	public static void main(String[] args) {
		for(int i=6; i>=0; i--) {
			for(int k=0; k<7-i; k++) {
				System.out.print(" ");
			}
			for(int j=(i*2)+1; j>0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

