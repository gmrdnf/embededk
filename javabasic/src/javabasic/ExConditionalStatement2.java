package javabasic;

import java.util.Scanner;

public class ExConditionalStatement2 {
	public static void main(String[] args) {
		// 100점 91점은 A 90~81점은 B 80~71점은 C 70~61점은D
//		60점 이하는 F를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하시오");
		int point = sc.nextInt();

		if (point <= 100 && point >= 91) {
			System.out.println("학점은 A 입니다");
		} else if (point <= 90 && point >= 81) {
			System.out.println("학점은 B 입니다");
		} else if (point <= 80 && point >= 71) {
			System.out.println("학점은 C 입니다");
		} else if (point <= 70 && point >= 61) {
			System.out.println("학점은 D 입니다");		
		} else {
			System.out.println("학점은 F 입니다");		
		}

	}// main
}
