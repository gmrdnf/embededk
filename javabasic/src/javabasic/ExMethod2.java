package javabasic;

public class ExMethod2 {
	public static void main(String[] args) {

		//실수 3개의 총합을 구하는 메서드를 생성하고 호출하여 결과를 출력
		
		System.out.println(addToDoubel(2.3, 3.3, 4.3));
		
		
		
	}//main

	static double addToDoubel(double a,double b,double c) {
		return a+b+c;
	}
	
	
}//class
