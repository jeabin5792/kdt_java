package reivew;

public class arraytask07 {
	public static void main(String[] args) {
		//7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력(char만 사용, 선언없이)
		
		//1)26칸짜리 문자형 배열
		//2)반복문for문
			//삼항연산자 값 대입
		//3) 출력하는 for문
		
		
		char[] arr = new char[26];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (char)(i%2!=0 ? i+65 : i+97);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
	}
}
