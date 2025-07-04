package interfaceTest02;

public class Main {
	public static void main(String[] args) {
		//Music 인터페이스를만들고 각 메소드를 호출하기
		
		//음악 재생 프로그램
		//부모는 Music인터페이스
		//구현되지 않은 mode 메소드 만들기
		
		//자식 클래스 Ballad, Hiphop, Rock 클래스
		//발라드 클래스
			//"발라드 모드"를 출력하는 mode 구현
			//"오직 발라드만 실행" 출력하는 onlyBallad 메소드 만들기
		
		//힙합 클래스
			//"힙합 모드"를 출력하는 mode 메소드
			//"오직 힙합만 실행" 출력하는 onlyHiphop 메소드 만들기
		
		//락 클래스
		//"락 모드"를 출력하는 mode 메소드
		//"오직 락만 실행" 출력하는 onlyRock 메소드 만들기
		
		//참조변수를 따로 만들지 않고
		//매개변수의 다형성을 활용하여 모든 클래스 타입의 메소드 호출하기
		
//		Ballad ballad = new Ballad();
//		Hiphop hiphop = new Hiphop();
//		Rock rock = new Rock();
		
		check(new Ballad());
		check(new Hiphop());
		check(new Rock());
		

		
		
	}
	
	
	  //check 메소드 static 메소드, 매개변수   리턴값
	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad)music).mode();
			((Ballad)music).onlyBallad();
		}else if(music instanceof Hiphop) {
			((Hiphop)music).mode();
			((Hiphop)music).onlyHiphop();
		}else if(music instanceof Rock) {
			((Rock)music).mode();
			((Rock)music).onlyRock();
		}
	
	}
	
}
