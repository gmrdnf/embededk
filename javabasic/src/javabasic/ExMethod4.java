package javabasic;

import java.util.Scanner;

public class ExMethod4 {

	public static void main(String[] args) {
		// 스테틱을 안쓰고 퍼블릭으로 스캐너와 생성자로 메인메소드안에서 불러와 값을 입력 출력함
		ExMethod4 exmethod = new ExMethod4();
		// 별의 개수를 입력하면 첫 행에 1개의 별, 마지막 행에 입력한 개수의 별을 출력하는
//		프로그램(별찍기 실습 1번활용
		// 기능
		// 별의 개수를 입력받는 기능
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int result = sc.nextInt();
//		System.out.println(result);
//		addPoint(result);

//		System.out.println(inputNum());
		// 별을 출력하는 기능
		exmethod.addPoint(exmethod.inputNum());

	}// main

	public void addPoint(int a) {
		for (int i = 1; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// 성공 하지만 기능1개당 메소드 한개가아니여서 기각

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		return sc.nextInt();
	}// 별 개수 입력

}// class
