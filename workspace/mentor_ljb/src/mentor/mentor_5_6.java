package mentor;

public class mentor_5_6 {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int k=4; k>i; k--) {
				System.out.print("  ");
			}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
