package classbasic2;
//13번 : car 클래스 main
public class carMain {
	public static void main(String[] args) {
		
		//객체화(인스턴스화)
		car mycar = new car();
		
		mycar.model="Teals Midel 3";
		mycar.color = "blue";
		mycar.speed = 0;
		
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색상 : " + mycar.color);
		System.out.println("속도 : " + mycar.speed);
		
		mycar.accelerate(120);
		System.out.println("현재속도 : " + mycar.speed);
		
		mycar.accelerate(180);
		System.out.println("현재속도 : " + mycar.speed);
		
		mycar.stop();
		System.out.println("현재 속도"+mycar.speed);
		
		mycar.decrease();
		System.out.println("현재 속도"+mycar.speed);
		
		
	}
}
