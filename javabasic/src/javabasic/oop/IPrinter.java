package javabasic.oop;

//역할:프린터라면 구현해야하는 공통 기능들에 대한 명세를 작
public interface IPrinter {

	//method prototype=method signature =메소드 원형
	void turnOn();//public abstract 가생략된거
	public abstract void print();
	public abstract void turnOff();
	
}
