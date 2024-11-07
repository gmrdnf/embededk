package javabasic.oop;

public abstract class AbstractPrinter implements IPrinter {

	String sort;
	String company;
	String name;
	int price;
	
	public AbstractPrinter(String company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println(name+ "프린터에 전원을 켜다");
	}

	@Override
	public abstract void print();
	//abstract 가있으면 정의가 안됐기때문에 실행할수없음
	//오버라이딩해야 가능
	@Override
	public void turnOff() {
		System.out.println(name+ "프린터에 전원을 끄다");

	}

	@Override
	public String toString() {
		return sort +"("+company+","+name+","+price+")";
	}
	
}
