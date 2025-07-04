package methodtest;

import java.util.Arrays;
import java.util.Scanner;

public class methodtask {
	public static void main(String[] args) {
		methodtask mt = new methodtask();
		
		
		//1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
		//매개변수o 리턴값o
		//메소드명 : changeSign
		System.out.println(mt.changeSign(-8));
		
		//2. 이름과 정수를 받아와서 정수만큼 이름을 출력하느 메소드
		//매개변수o 리턴값o
		//메소드명 : printName
		mt.printName(3, "이재빈");
		System.out.println(mt.printName(3, "이재빈"));
		String value = mt.printName(3, "철수");
		System.out.println(value);
		
		//3. 10이하의 숫자는 1로 10를 초과하는 숫자는 100으로 반환하는 메소드
		//매개변수 o 리턴값o
		//매소그명 : changeNumber
		System.out.println(mt.changeNumber(12));
		
		//4. 5개의 정수 중 평균을 반화하는 메소드
		//매개변수o 리턴값o
		//메소드명 : getAvg
		int[] ar = {10,20,30};
		System.out.println(mt.getAvg(ar));
		System.out.println(mt.getAvg(new int[]{10,20,30}));
		
		
		//5.정수 배열 줄 최대값과 최소값을 출력하는 메소드
		//매개변수o 리턴값o
		//메소드명 : ptintMinMax
		int[] ar2= {1,2,3,4};
	mt.printMinMax(ar2);
		
		//6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	      //예시 ) BanAnA => bANaNa
	      //메소드명 : changeCase
	      //매개변수와 반환값은 자유 => 단, 형변환 이용할것!
	      
	      //7. 아이디와 비밀번호를 입력받아 로그인하기
	      //매개변수o 리턴값o(리턴타입 boolean)
	      //메소드명 : login
	      //main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
	      //둘중하나라도 틀리면 다시 확인하세요 출력
		
		
	}
	//1)
	 //1) 기능 생각 => 음수면 양수로, 양수면 음수로
	   //2) 리턴타입 생각 => void
	   //3) 메소드명 생각 => changeSign
	   //4) 매개변수 생각 => 정수형 1개
	   //5) 구현부 실행할 문장 생각 => 음수 -> 양수, 양수 -> 음수 (매개변수명 * -1)
	   //6) return 매개변수 * -1;
	   //7) 리턴값에 맞는 타입으로 변경한다 => int
	int changeSign(int num) {
		return num*-1;
	}
	
	//2)
	//1) 기능 => 전달된 정수만큼 전달된 이름 출력
	   //2) 리턴타입 => void
	   //3) 메소드명 => printName
	   //4) 매개변수 => 2개(int, String)
	   //5) 구현부{ 실행할 문장 => 
	   //   5-1)    for문( 초기식 int i = 1; 조건식 i <= 정수형 매개변수; 증감식++)
	   //   5-2)      { syso(문자열매개변수); }
	   //6) 리턴값 => "정수 : " + 정수형매개변수 + "이름 : " + 문자열매개변수;
	   //7) 리턴타입을 수정 => String
	String printName(int num, String name) {
		for(int i =0; i < num; i++) {
			System.out.println(name);
		}
		return "정수 : " + num + ", 이름 : "+ name;
	}
	
	//3)
	//정수형 변수 선언
	//if 문 사용
	//변수가 10보다 작으면 1
	//변수가 10 초과면 100
	int changeNumber(int num) {
		
		return num<=10 ? 1 : 100;
	}
	
	//4)
	//정수형 변수 
	//int[] ar
	//for-each
	
	double getAvg(int[] ar) {
		int total=0;
		for(int num : ar) {
		total += num;
		}
		return total /(double)ar.length;
	}
	
	
	//5)
	int[] printMinMax(int[] ar) {
		int min= ar[0];
		int max=ar[0];
		for(int i =1; i<ar.length; i++) {
			min =min>ar[i] ? ar[i] : min;
			max =max<ar[i] ? ar[i] : max;
		}
		System.out.println(min, max);
	}
	
	//6)
	String changeCase(String str) {
		char c = ' ';
		String result =" ";
		for(int i=0; i<str.length(); i++) {
			if(c >= 97 && c<=122){
				result += (char)(c+32);
			}else if(c >= 65 && c <= 90) {
	            result += (char) (c + 32);
	         }else {
	            result = "잘못된 값입니다";
	         }
		}return result;
	}
	
	
	//7)
	void login(String id, int pass) {
		while(true) {
			if(id == "admin" && pass == 1234) {
				System.out.println("관리자님 환영합니다");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		
		
	}
	
	
	
	
}
