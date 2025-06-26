package Construtethis01;
//4번 : this
public class carmain {
	public static void main(String[] args) {
		car car1 = new car("BMW");
		System.out.println(car1);
		car1.printInfo();
		
		car car2 = new car("기아");
		System.out.println(car2);
		
		
		
	}
}


class car{
	//필드 
	String brand;
	int speed;
	//생성자
	public car(String brand) {
		this.brand = brand;
		System.out.println("생성자 호출 : "+this);
	}
	
	
	//매개변수의 타입이 다르다 -> 생성자 오버로딩
	public car(int speed) {
		this.speed = speed;
	}


	//매개변수의 개수가 다르다->생성자 오버로딩
	public car(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
//	public Car(String brand) {
//	      this.brand = brand;
//	      this.speed = 10;
//	      for(int i = 0; i <= 10; i++) {
//	         this.speed += 1;
//	         System.out.println(this.speed);
//	      }
//	      System.out.println("생성자호출 : " + this);
//	   }


	//메소드
	void printInfo() {
		System.out.println("모델 : "+ this.brand);
		System.out.println("속도 : "+ this.speed);
	}
}