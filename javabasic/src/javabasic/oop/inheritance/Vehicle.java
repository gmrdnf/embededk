package javabasic.oop.inheritance;

public class Vehicle {
	private String name;//이름
	private Boolean hasEngine;//엔진보유여부
	//상속/확장하려면 하위에 공통적으로 들어갈 것들을 잘 생각해야함
	String getName() {
		return "탈것";
	}
	
	
	//Ovject 클래스의 toString을 오버라이딩했다
	@Override
	public String toString() {
		return "Vehicle의 toString()";
	}
}
