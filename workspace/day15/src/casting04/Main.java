package casting04;

public class Main {
	public static void main(String[] args) {
		
		//업캐스팅
		Hero ironMan = new IronMan("아이언맨");
		ironMan.SuperPower();  //업캐스팅되어도 오버라이딩 된 메소드가 호출
		
		Hero hulk = new Hulk("헐크");
		hulk.SuperPower();
		
		
		//다운캐스팅
		IronMan ironMan2 = (IronMan)ironMan;
		((Hulk)hulk).say();
		System.out.println(((Hulk)hulk));
		
		
		
		
	}
}
