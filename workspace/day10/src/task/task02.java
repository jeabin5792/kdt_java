package task;

import classbasic2.car;

public class task02 {
	public static void main(String[] args) {
		
		
		//Animal 클래스 => 3개 객체만들기
		//필드  : 동물이름 , 나이, 종
		task02 animalname = new task02();
		task02 animalage = new task02();
		task02 animal = new task02();
		
		
		//메소드
		animalname.name="하늘";
		animalage.age=5;
		animal.animal="강아지";
		//동물이 먹이를 먹는 메소드 매개변수 1개
		//=> 동물이름이 00을 먹습니다
		System.out.println(animal.name + "");
		
		//동물이 잠을 잡니다 출력하는 메소드
		//=> 동물이름이 잠을 잡니다
		
		//동물의 생일을 축하하는 출력 메소드
		//=> 동물이름의 나이를 축하합니다 출력
		
		
	}
}
