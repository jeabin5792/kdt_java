package mentor;

import java.util.Arrays;

public class mantor_6_4 {
	public static void main(String[] args) {
		int[][] mabang  = new int[5][5];
		
		int a=0;
		int b=2;
		int num=1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				mabang[a][b] = num;
				a--;
				b++;
				if(a<0) {
					a=4;
				}
				if(b>4) {
					b=0;
				}
				num++;
			}
			a+=2;
			b--;
			
			if(a>4) {
				a=1;
			}
			if(b<0) {
				b=4;
			}
			
		}
		
		for (int i = 0; i < mabang.length; i++) {
			System.out.println(Arrays.toString(mabang[i]));
		}
		
	}
}
