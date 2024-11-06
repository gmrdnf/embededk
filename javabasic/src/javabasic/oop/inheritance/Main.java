package javabasic.oop.inheritance;

public class Main {
	public static void main(String[] args) {
		//Child타입의 객체를 생성
		//차일드객체가 메모리에 생겼다
		//Child가 Parent를 상속 받았으므로 Parent타입의 객체가 생성된 후에
		//Child타입의 객체가 생성될 수 있다.
		Child child = new Child();
		
//		System.out.println(child.psi);/접근불가
//		System.out.println(child.pnsi);/접근불가 이유 둘다 프라이빗이라
		System.out.println(child.si);
		System.out.println(child.nsi);
		child.sm();
		child.m();
		
	}
}
