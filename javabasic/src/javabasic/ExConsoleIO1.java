package javabasic;

import java.util.Scanner;

public class ExConsoleIO1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//Scanner의 nextInt()메서드를 활용하여 두 수를 키보드로 입력받아 곰셈의 결과를 화면에 출력해보기	
		System.out.println("두 수를 입력하시오.");
		int num1 = 0;
		int num2 = 0;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
	
		int result = num1*num2;
	
		System.out.println("두 수의 곱한 값은 :"+result+"입니다");
	
		scanner.close();
	}
}
