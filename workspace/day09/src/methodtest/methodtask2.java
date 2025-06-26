package methodtest;

public class methodtask2 {
	public static void main(String[] args) {
		
		methodtask2 mt = new methodtask2();
		
		//1. 정수1개를 받아서 짝수입니다/ 홀수입니다 반환하는 메소드
		//메소드명 : checkNum
		System.out.println(mt.checkNum(4));
		
		
		//2.10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
		//메소드명 :  getSum
		System.out.println(mt.getSum(new int[] {5,6,3,2,1,4,7,8,1,3}));
		
		//3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		//메소드명 : reverseStr
//		System.out.println(mt.reverseStr("hello"));
		
		
		//4. 정수형배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		//메소드명 : contains
		//베열요소중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
		System.out.println(mt.contains(new int[]{1, 2, 7, 5, 6}, 10));
		
		
		//5. 단수를 매개변수로 받아 해당 단의 구구단을 1~19까지 출력하는 메소드
		//메소드명 : printGugudan
		System.out.println(mt.printGugudan(4));
		
		
		//6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
		//메소드명 : compareLength
		String value = mt.compareLength("sdfdssd", "ewsfsef");
		System.out.println(value);

		
		//7. 아이디와 비밀번호를 매개변수로 받아 검즌, 시도횟수 3회 넘기면 잠금 반환
		//메소드명 : loginTry
		System.out.println(mt.loginTry("admi", "1234"));
	}
	
	//1. 정수1개를 받아서 짝수입니다/ 홀수입니다 반환하는 메소드
	//메소드명 : checkNum
	//리턴타입 void
	//매개변수 : 정수형 변수 1개
	//구현 삼항연산자 사용
	//리턴값 수정
	String checkNum(int num) {
		String num2 = (num%2==0 ? "짝수입니다" : "홀수입니다");
		return num2;
	}
	
	//2.10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
	//메소드명 :  getSum
	//리턴타입 void
	//매개변수 정수형 배열, 총합계산할 변수
	//구현 for문 사용
	//리턴값 수정
	int getSum(int[] ar) {
		int total =0;
		for(int i=0; i<ar.length; i++) {
			total += ar[i];
		}
		return total;
	}
	
	
	//3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
	//리턴타입 void
	//매개변수 문자열 변수
	//구현 for문 사용
	//리턴값 수정
	String reverseStr(String string) {
		for(int i=0; i<string.length; i++) {
			
			String temp = string[i]; 
			string[i]= string[string.length-i-1];
			string[string.length-i-1]=temp;
		}
		return string;
	}
	
	
	//4. 정수형배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
	//메소드명 : contains
	//베열요소중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
	//리턴타입void
	//매개변수 정수형배열 변수, 정수형 변수, true를 반환하는 변수
	//구현 for문 안에 if문 사용
	//리턴값 수정
	boolean contains(int[] ar, int num) {
		boolean check = true;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==num) {
				check = true;
				break;
			}else {
				check = false;
			}
		}
		return check;
	}
	
	//5. 단수를 매개변수로 받아 해당 단의 구구단을 1~19까지 출력하는 메소드
	int printGugudan(int num) {
		for(int i=1; i<=19; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		return 0;
	}
	
	
	
	
	//6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
	//메소드명 : compareLength
	//리턴타입 void
	//매개변수 문자열변수 2개
	//구현 리턴에 삼항연사자
	//리턴타입 수정
	String compareLength(String ar1, String ar2) {
		return (ar1.length() == ar2.length()) ? "같음" : "다름";		
	}
	
	
	
	
	
	//7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
	//메소드명 : loginTry
	//리턴타입 void
	//매개변수 문자열 2개
	//구현 for문 안에 if문 //아이디가 admin, 비밀번호는 1234
	//리턴타입 수정
	String loginTry(String id, String pass) {
		String check = null;
		for(int i=0; i<3; i++) {
			if(id.equals("admin")  && pass.equals("1234") ) {
				check="검증확인";
				break;
			}else {
				check="다시 시도하세요";
			}
			check = "잠금";
			
		}
		return check;
	}
	
	
	
}
