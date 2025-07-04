package inheritanceConstructor02;

public class carmain {
	public static void main(String[] args) {
		//부모클래스의 객체생성
//		car c1 = new car();
		car c2 = new car("기아", "black", 10000);
		System.out.println(c2);
		
//		c2.boosterOn();
		c2.enginStart();
		
//		carsuper sc1 = new carsuper();
		carsuper sc2 = new carsuper("bmw", "남색", 150000, true);
		carsuper bmw = new carsuper(10000, true);
		carsuper kia = new carsuper("kia", "black", 10000, true);
		bmw.enginStart();
		kia.enginStart();
		
	}
}
