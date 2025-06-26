package method;
//2번 : 메소드 사용이유2(높은 재사용성)
public class methodbasic02 {
	public static void main(String[] args) {
		//동일한 로직을 구현하기 위해 시롭게 코드를 작성할 필요럾이
		//이미 작성된 메소드를 호출하면 된다
		//작성된 코드의 재사용성을 높일 수 있다
		methodbasic02 mt = new methodbasic02();
		System.out.println("첫번째 직사각형의 면적 : " + mt.calculatrArea(5, 10));
		System.out.println("두번째 직사각형의 면적 : " + mt.calculatrArea(500, 123));
	}
	
	//직사걱형의 넓이 구한느 메소드
	int calculatrArea(int width, int height) {
		return width * height;
	}
}
