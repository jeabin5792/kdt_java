package Construtethis01;
//3-1번 : 생성자 this
public class A {
	
	
	int num;
	int num2;
	
	void method() {
		int num2; 
	      System.out.println(this);
	      System.out.println("매개변수 num : "+ num);
	      System.out.println("필드의 num : "+ this.num);
	   }
	}
}
