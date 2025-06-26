package Construterbasic01;
//1번 : 생성자 기초
public class TvMain {
	public static void main(String[] args) {
		Tv t1 = new Tv(10,5,"black","LG");
		
//		t1.brand="LG";
//		t1.color="black";
//		t1.vol=10;
//		t1.ch=5;
		
		System.out.println(t1.brand + "tv를 조작합니다");
		t1.nextChannel();
		t1.powerOnOff();
		t1.nextChannel();
		t1.decereaseVolume();
		t1.increaseVolume();
		t1.previousChannel();
		
		
		Tv t2 = new Tv();
		t2.brand="삼성";
		t2.color="White";
		t2.vol=50;
		t2.ch=5;

		System.out.println(t2.brand + "tv를 조작합니다");
		System.out.println(t2.power);
		t2.previousChannel();
		t2.powerOnOff();
		t2.nextChannel();
		
		
		
		
	}
}





