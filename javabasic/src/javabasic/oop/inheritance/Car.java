package javabasic.oop.inheritance;

public class Car extends Vehicle{

	private int tireCount;
	
	@Override//있는이유는 코딩실수방지를 위해 있음//안전장치//앵간하면 붙이자
	String getName() {
		return "자동차";
	}
	
	
	//Vehicle클래스의 toString메소드를 오버라이딩
	@Override
	public String toString() {
		return "Car의 toString()";
	}
}
