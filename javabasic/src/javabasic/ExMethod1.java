package javabasic;

public class ExMethod1 {
	
	public static void main(String[] args) {
		//정수 2개중 더 큰수를 출력하는 메서드를 생성하고 호출하여 결과를 출력
			System.out.println(add(8,8));
	}//main
	
	static int add(int a,int b) {
		if(a>b) {
			return a;
		}else if(a<b) {			
			return b;
		}else {
			System.out.println("값이 같습니다");
			return a=b;
		}
		
	}
	
}//class
