package inheritance;

public class TvMain {
	public static void main(String[] args) { 
		Tv sTv = new Tv();
		sTv.ch = 10;
		sTv.vol  = 5;
		sTv.power= true;
		
		sTv.powerOnOff();
		sTv.chup();
		System.out.println(sTv);
//      netflex()메소드는 Tv2 자식 클래스에서 추가된 멤버이므로
//      부모 클래스의 객체로는 접근이 불가능하다
		
		Tv2 lTv = new Tv2();
		System.out.println(lTv);
		lTv.ch = 100;
		
	}
}
