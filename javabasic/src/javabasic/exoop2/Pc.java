package javabasic.exoop2;
//Pc객체를 생성하려면 Monitor,Desktop,Keyboard가 있어야함

//*** has a 관계(위임관계,delgation) (중요)***
//상속받지 않아도 가지고 있으므로 사용할 수 있는 관계
//Pc has a Monitor
//Pc has a Desktop
//Pc has a Keyboard


public class Pc {

	String company;//제조회사
	int price;//가격
	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;

	
	public Pc() {
	}

	public Pc(String company,  Monitor monitor, Desktop desktop, Keyboard keyboard) {
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	
	//아무생성자가 없으면 기본생성자를 만들어야함
	//파라미터가 있는 생성자는 기본생성자를 안만들어도됌
	
	public int getPrice() {
		return this.price;
	}
	
	//PC의 가격은 모니터 가격 +데스크탑 가격 + 키보드 가격
	public void setPrice() {
		this.price = monitor.price +desktop.price + keyboard.price;
	}
	
	
}//class
