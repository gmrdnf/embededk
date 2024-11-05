package javabasic.exoop2;

public class PcMain {

	public static void main(String[] args) {
		
		Monitor monitor =new Monitor();
		monitor.company = "알파스캔";
		monitor.model= "AS30";
		monitor.inch=30;
		monitor.price=50000;
		
		Desktop desktop = new Desktop();
		desktop.cpu ="I9";
		desktop.memory = "16G";
		desktop.price = 100000;
		
		Keyboard keyboard = new Keyboard();
		keyboard.keyCount =101;
		keyboard.wireless=true;
		keyboard.price=50000;
		//메소드 호출하듯 타입 개수 맞춰야함
		Pc pc=new Pc("LG",monitor,desktop,keyboard);
		//Pc객체 생성
		pc.setPrice();
		//Pc 총 가격 계산
		
		System.out.println(pc.company+"회사 PC의 총 가격은 "+pc.getPrice()
		+"원 입니다.");

	
	//모듈을 만드는 이유는 확장성있도록 만들기 위해서
		//모듈은 최대한 간단하게 만들기
		
	
	
	
	
	
	
	
	}//main
	
}//class
