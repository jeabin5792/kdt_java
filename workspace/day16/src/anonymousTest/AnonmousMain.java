package anonymousTest;
//29번 : 익명클래스-메인클래스
public class AnonmousMain {
	public static void main(String[] args) {
//		InterA a = new InterA();
		InterA aa = new InterA() {

			@Override
			public void printText() {
				System.out.println("익명클래스에서 오버라이딩");
				System.out.println("끝");
			}
			
		};
		
		System.out.println(aa);
		aa.printText();
	}
}
