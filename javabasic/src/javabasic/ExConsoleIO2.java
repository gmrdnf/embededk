package javabasic;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ExConsoleIO2 {
	public static void main(String[] args) {
		//문자열 3개를 키보드로 입력받아서 그중 boolean 데이터의 개수를 출력해보기
		Scanner sc   = new Scanner(System.in);
//		String str1 = null;
//		String str2 = null;
//		String str3 = null;
//
//		String bool = "true";
//		int result = 0;
		
		System.out.println("문자열3개를 입력하시오");
//		str1 = sc.next();
//		str2 = sc.next();
//		str3 = sc.next();
		//불리언인 것의 개수를 저장할 변수
		int booleanCount = 0;

		if(sc.hasNextBoolean()) {
			booleanCount = booleanCount +1;//booleanCount++;
		}
		sc.next();
		if(sc.hasNextBoolean()) {
			booleanCount = booleanCount +1;//booleanCount++;
		}
		sc.next();
		if(sc.hasNextBoolean()) {
			booleanCount = booleanCount +1;//booleanCount++;
		}
	
		
		System.out.println("총"+ booleanCount+"개의 boolean이 있습니다.");
		sc.close();
//		if(sc.hasNextBoolean()) {
//			
//		}
		
//		if(str1 == bool) {
//			result =+1;
//			
//		}	
//		if(str2 == bool) {
//			result =+1;
//			
//		}	
//		if(str3 == bool) {
//			result =+1;
//			
//		}	
//		System.out.println(result);
		
		//입력값중 true가 있다면 개수출력
		
			
		
		
		
		
		
	}
	}
