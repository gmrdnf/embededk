package javabasic;

public class Method2 {
	
	public static void main(String[] args) {//메인은 스태틱
		
		//cannot make a static reference to the non-static method print
		//=>static메서드인 main에서 non-static 메서드인 print를 객체없이 호출할 수 없다
		//스태틱 안에서 넌 스태틱메서드를 호출할수 없음
		//호출하기 위해서는 객체를 만들어야함
//		print("Hello Java!");
//		Method2.print("Hello Java!");
		
		//Method2 타입의 객체를 생성
		Method2  method2 = new Method2();
//										생성자라 칭함

		//객체참조를 통해 print 호출
		method2.print("Hello Java!");
		System.out.println(method2.add(3, 5));
	
	
		}//main
	//non-static 메소드 : 객체를 생성해서 객체로 접근(호출)하는 메소드//아래도 마찬가지
	void print(String str) {
		System.out.println(str);
	}
	
	int add(int a,int b) {
		return a+b;
	}
	
	
}//class
