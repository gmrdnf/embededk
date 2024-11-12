package javabasic.api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String str1 = "안녕 하세요! 자바 졸지 마!";
		String str2= "101-1234-5678";
		
		//공백 dilemeter 기분으로 분리하는 토크나이져
		StringTokenizer st1 = new StringTokenizer(str1);

		System.out.println(st1.countTokens());//5

		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken());
		}
		
		
		

		//- delimeter 기분으로 분리하는 토크나이져
		StringTokenizer st2 = new StringTokenizer("-");
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken());
		}
		
	}//main
	
}//class
