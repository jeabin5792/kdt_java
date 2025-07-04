package mentor;

import java.util.Random;

public class mantor_6_3 {
	public static void main(String[] args) {
		// 정수형배열에 랜덤값을 저장하는 메소드
		// 리턴타입 void
		// 정수형 배열선언
		mantor_6_3 random = new mantor_6_3();

		System.out.println(random.randomcard());
		

	}

	int[] randomcard() {
		int[] carder = new int[10];
		for(int i=0; i<10; i++) {
			carder[i] = (int)(Math.random()*100);
			if(i>0) {
				if(carder[i]==carder[i-1]) {
					i-=1;
				}
			}
			System.out.println(carder[i]);
		}
		return carder;
	}
}
