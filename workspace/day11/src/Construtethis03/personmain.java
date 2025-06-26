package Construtethis03;
//6번 : this() 자기자신의 생성자 호출
public class personmain {
	public static void main(String[] args) {
		person p1 = new person();
		person p2 = new person("홍길동");
		person p3 = new person("짱구", 5);
		person p4 = new person("유리", "학생");
		person p5 = new person("이재빈",25,"학생");
		
		
		System.out.println(p3);
		System.out.println(p5);
		p3.printInfo();
		p5.printInfo();
		
	}
}
