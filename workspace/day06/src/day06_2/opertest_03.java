package day06_2;
//3번 : 관계연산자와 논리 연산자
public class opertest_03 {
	public static void main(String[] args) {
		System.out.println("=========관계 연산자=====");
		
		int num1 =10, num2 =20, num3 = 10;
		System.out.println(num1 + ">" +  num2 + " : " +(num1 > num2));
		System.out.println(num1 + "<" +  num2 + " : " +(num1 < num2));
		System.out.println(num1 + ">=" +  num2 + " : " +(num1 >= num2));
		System.out.println(num1 + "<=" +  num2 + " : " +(num1 <= num2));
		System.out.println(num1 + "==" +  num2 + " : " +(num1 == num2));
		System.out.println(num1 + "!=" +  num2 + " : " +(num1 != num2));
		System.out.println(num1 + "==" +  num3 + " : " +(num1 == num3));
		
		System.out.println(10 >= 10);
		
		System.out.println("=========관계 연산자=====");
		System.out.println("and : 둘 다 참이면 참(&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("or : 둘 중 하나라도 참이면 참(||)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("not : 참이면 거짓, 거짓이면 참(!)");
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
		
		
		
		
	}
}
