package task;
//메소드문제
public class task01 {
	
	//1. 문자열 속의 단어를 공백 기준으로 세기
	//메소드명 : countWord
	//매개변수 : String str
	//ex) I love java => 3개
	//ex) 안녕하세요 저는 이재빈입니다 java 공부 중입니다 => 6개
	
	void countWord(String str) {
		
	}
	
	
	//2. 주민등록번호로 성별 판단하기
	//메소드명 : getGender
	//1,3 => 남자
	//2,4 => 여자
	
	void getGender(String number) {
		
	}
	
	
	
	
	//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 각 학생별 학점 구하기(정수형)
	//메소드명 : getGrade
	//95점 이상 A+
	//90점 이상 A
	//85점 이상 B+
	//80점 이상 B
	//75점 이상 C+
	//70점 이상 C
	//69점 이상 F
	int math;
	int kor;
	int eng;
	int evg;
	String grade;
	String getGrade() {
		evg=(math+kor+eng)/3;
		if(evg >= 95) {
			grade = "A+";
		}else if(90<=evg && evg<95){
			grade="A";
		}else if(85<=evg && evg<90) {
			grade="B+";
		}else if(80<=evg && evg<85) {
			grade="B";
		}else if(75<=evg && evg<80) {
			grade="C+";
		}else if(70<=evg && evg<75) {
			grade="C";
		}else {
			grade="F";
		}
		return grade;
	}

}







