package fortest;
//6번 : for문 연습
public class fortask01 {
	public static void main(String[] args) {
		//for문만 사용
		//1) 100부터 1까지 출력(tab키로 띄어쓰기)
		//2)구구단 3단만 출력
		//3)A~F 출력(초기식 char)
		//4)A~F 출력(초기식 int i=0)
		//5)aBcDeFgHiJkLmNoPqRsTuVwXyZ
		
		//1
		for(int i=0; i<100; i++) {
			System.out.print((100-i) + "\t");
		}System.out.println();
		
		//2
		int dan=3;
		for(int i=1; i<10; i++) {
			System.out.print(dan + "*" + i+ "=" + (dan*i) + "\t");
		}System.out.println();
		
		
		//3
		for(char i='A'; i<'G'; i++) {
			System.out.print(i+ "\t");
		}System.out.println();
		
		
		
		//4
		for(int i=0; i<6; i++) {
			System.out.print((char)(i+65)+ " ");
		}System.out.println();
		
		
		//5
		for(int i=0; i < 26; i++) {
			if(i % 2 ==0) {
				System.out.println((char)(i+97));
			}else {
				System.out.println((char)(i+65));
			}
		}
		System.out.println();
		for(int i=0; i < 26; i++){
			System.out.println((char)(i%2==0?i+97 : i+65));
		}
		
	}
}
