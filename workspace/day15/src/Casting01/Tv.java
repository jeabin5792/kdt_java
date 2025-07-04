package Casting01;

//4번 : casting 부모클래스
public class Tv {
	// 필드
	boolean power;
	int ch;
	int vol;

	// 메소드
	void powerOnOff() {
		System.out.println("tv 전원클 켜거나 끕니다");
	}

	void chUp() {
		System.out.println("채널을 올립니다");
	}

	void chDown() {
		System.out.println("채널을 내립니다");
	}
}
