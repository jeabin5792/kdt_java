package inheritancetest02;

public class cat extends Animal{
	//고양이 고유 메소드
	void meow() {
		System.out.println(this.name+"이/가 야옹하고 웁니다");
	}
}
