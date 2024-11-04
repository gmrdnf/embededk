package javabasic;

import java.util.Scanner;

public class ExConditionalStatement1 {
	public static void main(String[] args) {
		//두수의 합이10보다 크면 "10보다크다"or"10보다 크지않다" 출력해보기
		Scanner sc =new Scanner(System.in);
		
		System.out.println("두 개의 수를 입력");
		int ad = sc.nextInt();
		int as = sc.nextInt();
		//5+2
		int result = ad+as;
		
		if(result>10) {
			System.out.println("10 보다 크다");
		}else if(result<10){
			System.out.println("10 보다 작다");
		}
		
		
		
		
		
		
		
		
		
	}//main
	
}
