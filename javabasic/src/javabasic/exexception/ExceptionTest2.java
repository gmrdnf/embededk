package javabasic.exexception;

import java.util.Scanner;

public class ExceptionTest2 {
	// 두개의 정수를 입력하여 나누셈 결과를 출력합니다
	// 단, 제수가 0인경우는 "0으로 나눌수 없습니다!"라고 출력해 봅니다
	public static void main(String[] args) {

		// 1.입력한것이 숫자인 경우는 정수로 변환하기
		// 2.입력한것이 숫자이지만 int의 범위를 넘어가면 예외처리하기
		// 3.입력한것이 숫자가 아닌 경우에 대해 예외처리 하기

		// Math isNaN() 숫자가 아니면 true
		// (Not a Number)

		System.out.println("두개의 정수를 입력하시오");
		Scanner sc = new Scanner(System.in);

		try {
			// 사용자 입력을 double 2개로 저장
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
		
			int i1 = 0;
			int i2 = 0;
			
			if (!Double.isNaN(d1)) {i1 = (int) d1;}
			if (!Double.isNaN(d2)) {i2 = (int) d1;}
			
			if (i1 > Integer.MAX_VALUE || i1 < Integer.MIN_VALUE) {
				try {
					throw new Exception();
				} catch (Exception ex) {
					System.out.println("int의 범위를 넘었습니다.");
				}
			}

			System.out.println(i1 / i2);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력해주세요");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다");
		} finally {
			sc.close();
		}

		// 예외처리는 필요하면 미루지말고 해야한다.

//		try {
//			System.out.println((int)d1/(int)d2);
//		}catch(ArithmeticException ae) {
//			System.out.println("0으로 나눌수 없습니다");
//		}finally {
//			sc.close();
//		}

	}// main

}// class
