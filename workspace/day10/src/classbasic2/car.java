package classbasic2;
//13번 : 클래스의 특징3(객체 생성의 틀)
public class car {
	//바퀴, 핸들, 색상, 엔진, 모델명, 제조사,속도
	
	
	//필드
	String model; //모델명(제조사)
	String color; // 색상
	int speed; //속도
	
	//메소드
	//속도를 증가시키는 메소드(매개변수 o 리턴값x => 객체명.메소드명(인수);
	void accelerate(int value) {
		speed+=value;
		System.out.println("현재속도 : "+ speed);
	}
	
	//주행을 멈추는 메소드(매개변수 x 리턴값x =>객체명.메소드명();
	void stop() {
		speed = 0;
	}
	
	//속도를 감소시키는 메소드
	//매개변수x 리턴값x 
	//속도는 10씩만 감소되도록 기능 구현
	void decrease() {
		//조건문 if >= 0
		speed-=10;
		if(speed < 0) {
			speed=0;
			System.out.println("주행을 멈췄습니다");
		}
		
	}
	
	
}






