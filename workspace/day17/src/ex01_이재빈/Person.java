package ex01_이재빈;

public abstract class Person {
	
//			Person 클래스의 필수 멤버(필요한 것은 추가하여 작성)
//		   필드 : 이름, 나이(접근제한자 private)
		private String name;
		private int age;
		
//		생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		
		
		
//		   
//		   점수계산메소드(접근제한자 public, 메소드명 score) => 점수가 없습니다 출력
		
		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public void score() {
			System.out.println("점수가 없습니다");
		}
		
		
	
}
