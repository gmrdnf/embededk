package javabasic;

public class MethodOverloading {
	
		public static void main(String[] args) {

			//Overloading
			//파라미터의 개수, 타입, 순서를 달리해서 같은 이름의 메서드를 호출해서 사용
			//비슷한 기능을 하는 메서듣들의 이름을 일원화 할 수 있음
			//메소드 오버로딩의 조건
			//	1. 동일한 반환 타입
			// 2. 동일한 메서드명
			// 3. 파라미터의 개수,타입,순서 중 하나라도 달라야함
			// 4. 파라미터의 변수명은 오버로딩과 관련 없음(컴파일러는 타입만 체크)
			//너무 복잡하게 생각하지 말자
			//걍 너가 조건이랑 어떤타입으로 커맨드 호출할수있도록 공간만들어서 어떻게 출력할건지 적어놓는 
			//공간이라생각
			printStr("Hello");
			printStr("Hello",5);
			printStr("Hello","Java",2);
			
			//대충 내식대로 정리하자면 내가 만드는 새로운 프린트 라고생각하면됨
			//어떻게 작동할지도 무슨 타입을 넣을지도 몇개를 넣을지도 어떤순서를 갖을지도 내가 만드는
			//새로운 공간이라 생각함 하지만 기능은 같은 그런
	}//main

	static void printStr(String str) {
		System.out.println(str);
	}
		
	static void printStr(String str,int loopCount) {
		for(int i =0; i<loopCount;i++) {
			System.out.println(str);
		}
	}
	
	static void printStr(String str1,String str2,int loopCount) {
		for (int i = 0; i < loopCount; i++) {
			System.out.println(str1+" "+ str2);
		}
	}
	
}//class



