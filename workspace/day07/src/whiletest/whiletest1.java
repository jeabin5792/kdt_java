package whiletest;
//8번 : while문 기초
public class whiletest1 {
	public static void main(String[] args) {
		
		//조건식을 true로 작성시 무한루프
//		while(true) {
//			for(int i=0; i<10; i++) {
//				System.out.println("안녕하세요");
//				break;
//			}
//		}
//		
		//변수를 선언
		//while(조건식){
		//}
		int cnt = 0;
		while(cnt < 10) {
		//	System.out.println(cnt); //증감식이 출력문 다음에 작성되면 0~9까지 출력
			cnt++;
		//	System.out.println(cnt); //증감식이 출력문 전에 작성되면 1~10까지 출력
			System.out.println("안녕하세요");
		}
		
		
	}
}





