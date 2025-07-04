package inheritancetest02;
//2번 : 상속기초(Animal 클래스를 상속받은 dog클래스)
public class dog extends Animal{
	
	
	//강아지 고유 메소드
	void bark() {
		System.out.println(this.name +"이/가 짖습니다");
	}
}
