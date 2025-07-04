package ex05_이재빈;

import java.util.Scanner;

public class Student extends Person {
	// Person 클래스를 상속받는다.
	
	
	// 필드
	// int javaScore
	// int dbmsScore
	// int htmlScore
	// Major major
	int javaScore;
	int dbmsScore;
	int htmlScore;
	Major major;
	
	// 생성자
	// 이름, 전공, 세 과목 점수를 받아 초기화(부모생성자 사용)
	public Student(String name, int javaScore, int dbmsScore, int htmlScore, String major2) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.major = major2;
	}
	
	
//	메소드
//	    getTotalScore() – 총점 반환
//	    getAverageScore() – 정수 평균 반환
//	    getMajor() – 전공 반환

	int getTotalScore() {
		return javaScore+dbmsScore+htmlScore;
	}
	
	int getAverageScore() {
		return (javaScore+dbmsScore+htmlScore)/3;
	}
	
	String getMajor() {
		return major;
	}
	
	
	
	
	
	
	
	
	
	

}
