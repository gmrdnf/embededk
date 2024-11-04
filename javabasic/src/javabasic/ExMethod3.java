package javabasic;

import java.util.Scanner;

public class ExMethod3 {
	public static void main(String[] args) {
	//2개의 정수와 연산자를 입력하면 사칙연산을 수행하는 프로그램
		System.out.println(addpoint(10, 8, '-'));
		
		
	}//main
	static int addpoint(int a,int b,char c) {
		int sum = 0;
		if(c=='+') {
			sum= a+b;
		}else if(c=='-') {
			sum= a-b;
		}else if(c=='*') {
			sum= a*b;
		}else if(c=='/') {
			sum = a/b;
		}else if(c=='%') {
			sum =a%b;
		}
		return sum;
	}//한번밖에 안쓸 변수는 안만드는게 나음
	
	
	
	
	
	
	
	
}//class



// 43 + 45 - 42 *  47 / 37% 