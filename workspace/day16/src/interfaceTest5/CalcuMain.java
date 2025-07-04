package interfaceTest5;
//22번 : 메인 메소드 (인터페이스 내에서 static메소드, private메소드, default메소드만 있어도 인터페이스 자체로 객체화는 불가능하다
public class CalcuMain {
	public static void main(String[] args) {
		Calculator c =new CalculImpl();
		System.out.println(c);
		System.out.println(c.add(12, 34));
		System.out.println(c.add(12, -4));
		
		Calculator.info();
		
	}
	
	
}
