package apiTest;

import lambdaTest2.CombInter;

//1번 : API
public class ApiTest {
	public static void main(String[] args) {
	      CombInter ci = new CombInter() {

	         @Override
	         public String combine(String str1, String str2) {
	            return str1 + str2;
	         }
	         
	      };
	      
	      System.out.println(ci);
	      System.out.println(ci.combine("hello ", "java"));
	   }
	}


