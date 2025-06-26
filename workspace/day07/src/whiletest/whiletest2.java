package whiletest;
//9번 : while문을 활용한 합계 구하기
public class whiletest2 {
	public static void main(String[] args) {
		
		//1부터 100까지의 합을 구하기(for문을 이용)
		//1)총합 구할 변수 선언
		//2)for문 (초기식 int i=1
		//			조건식 i<=100
		//			증감식 i++
		//3) 중괄호 영역
		//		총합 구할 변수 += i 	총합구할변수 = 총합구할변수값 +i
		//4) 출력
		
		int result =0;
		for(int i=1; i<=100; i++) {
			result += i;
		}
		System.out.println("1부터 100까지의 합 : " + result);
		
		
		
		//1부터 100까지의 합을 구하기(while문을 이용)
		//1) 변수 2개 선언(총합구할변수, 비교대상  변수 0)
		//2)while문 (조건식	비교대상변수 < 100)
		//3)while중괄호 영역
		//		 총합구할변수 += 비교대상변수
		//		비교대상변수++
		//4)출력
		
//		int result2 = 0, cnt = 0;
//		while(cnt <= 100) {
//			result2 += cnt;
//			cnt++;
//		}
//		System.out.println("1부터 100까지의 합 : " + result2);
		
		
		//짝수의 합 홀수의 합 추가적으로 구하기
		 //1부터 100까지의 합을 구하기(while문 이용)
	      //1) 변수 선언 2개(총합구할변수, 비교대상 변수 0)
	      //+)   변수 2개 더 선언(짝수의 합, 홀수의 합 구할 변수)
	      //2) while문   (조건식    비교대상변수 <= 100)
	      //3) while중괄호영역
	      //      총합구할변수 += 비교대상변수
	      //+)   짝수 구할 조건문(if ~ else문)
	      //      if(조건식 cnt % 2 == 0){
	      //         짝수총합구할변수 += cnt;
	      //      }else{
	      //         홀수총합구할변수 += cnt;
	      //      }      
	      //      비교대상변수 1증가
	      //4) 출력
		
		int result3=0, result4=0,cnt=0;
		while(cnt <= 100) {
			if(cnt % 2 == 0) {
				result3 += cnt;
			}else {
				result4 += cnt;
			}
			cnt++;
		}
		System.out.println("1부터 100까지의 짝수 합 : " + result3);
		System.out.println("1부터 100까지의 홀수 합 : " + result4);
	}
}





