package javabasic.oop;

import javabasic.oop.Outer.NSIClass;

public class OuterMain {
	
	public static void main(String[] args) {
		
		//Outer 객체 생성
		Outer outerObject =new Outer();
		outerObject.print();

		//static inner class 객체 생성
		//Outer클래스를 통해서 static inner클래스의 객체를 생성할 수 있음
		Outer.SIClass outerSIClassObject =new Outer.SIClass();
		outerSIClassObject.print();
		//클래스안에 클래스를 불러옴
		//Outer안에있는 .SIClass를 호출해옴
		
		
		Outer.NSIClass outerNSIClassObject = new Outer().new NSIClass();
		//넌스태틱이너클래스는
		//아우터클래스를 만들고 이너클래스를 만들어야함
		//non-static inner class 객체생성
		//Outer클래스의 객체를 생성한 후에 non static Inner클래스의 객체가 생성될 수 있음
		outerNSIClassObject.print();
		
		Outer.NSIClass outerNSIClassObject2 = outerObject.new NSIClass();
		//이렇게도 사용가능
		
		//결론 이너클래스를쓰면 코드가 복잡해진다.
		//하지만 이해할줄은 알아야함
		//static과 non static local 이있는데
		//satic non static 구별할줄알아야함
		
	}//main 
	
}//class
