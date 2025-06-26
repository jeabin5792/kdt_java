package statictest;
//9번 : 정적변수와 정적메소드 main클래스
public class myclassB {
	public static void main(String[] args) {
		//1. 인스턴스 변수 출력-> 객체생성 필수
		myclassA a = new myclassA();
//		System.out.println(a); //참조값
//		System.out.println(a.instanceVar); //0
//		a.instanceVar =10;
//		System.out.println(a.instanceVar); //10
		
		
		myclassA aa = new myclassA();
//		System.out.println(aa);
//		System.out.println(aa.instanceVar); //0
//		aa.instanceVar=100;
//		System.out.println(aa.instanceVar); //100
		
		
		
		
		//2. 정적변수 출력->객체생성x=> 객체 생성으로 접근 가능하지만 권장하지 않음
			      // 클래스명.정적변수명으로 접근한다!! => 공통된 저장공간을 사용한다!!!!!
//			      a.staticVar = 20;
//			      System.out.println(a.staticVar);
//			      aa.staticVar = 200;
//			      System.out.println(aa.staticVar);
//			      System.out.println(a.staticVar); // 200
			      myclassA.staticVar=20;
			      System.out.println(myclassA.staticVar);
			      
		//3. 다른 클래스에서 인스턴스 메소드 호출
			      a.instanceMethod1();
			      a.instanceVar=20;
			      a.instanceMethod1();
//			      aa.instanceMethod1();
			      System.out.println();
			      
			      //4. 다른 클래스에서 스태틱메소드 호출
			      myclassA.staticMethod1();
	}
}


