package javabasic;

import java.util.Scanner;

public class ExMethod401 {
	//별의 개수를 입력하면 첫 행에 1개의 별 , 마지막 행에 입력한 개수의
	//별을 출력하는 프로그램
	public static void main(String[] args) {
		
		print(input(4));
		
	}//main
	
//	static int input() {
//		Scanner sc = new Scanner(System.in);
//		int result = sc.nextInt();
//		return result;
//	}//이건 스태틱쓰고 스캐너 불러와서 쓴거
	
	static int input(int a) {
		return a;
	}//이건 그냥 간단하게 값을 우리가 입력해놓고 아래에서 끌어다 쓰게 한거
	
	static void print(int a) {
		for (int i = 1; i < a+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}//class
