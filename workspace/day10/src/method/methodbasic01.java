package method;
//1번 : 메소드의 사용이유1(중볻된 코드 제거)
public class methodbasic01 {
	public static void main(String[] args) {
		//동일한 작업을 수행하는 코드르 여러번 작성하는 대신 메소드로 정의하면
		//코드의 가독성과 효율성이 향상된다
		
		//동일한 오직을 여러번 작성
		System.out.println("총 합 : " + (5+10));
		System.out.println("총 합 : " + (1+14));
		System.out.println("총 합 : " + (56+106));
		
		methodbasic01 mt= new methodbasic01();
		mt.printsum(423, 24);
		mt.printsum(23, 4);
	}
	
	//메소드를 사용한 경우
	void printsum(int num1, int num2) {
		System.out.println("num1의 값 : " + num1 + ", num2의 값 : "+ num2);
		System.out.println("총 합 : " + (num1 + num2));
	}
	
}
