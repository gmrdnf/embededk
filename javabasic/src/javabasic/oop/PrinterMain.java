package javabasic.oop;

import java.util.Iterator;

public class PrinterMain {

	public static void main(String[] args) {

		// 잉크젯 프린터 하나 생성해서 켜고,프린터하고 꺼보기

		// 인터페이스를 구현한 클래스의 객체를 생성하면"항상"인터페이스 타입참조변수를 사용한다
		// why?: 프로그램 구현이 유연하고 확장성이 있어 진다

//		IPrinter ikj1 = new InkjetPrinter("잉크젯","읭크",500);//정답은 인터페이스로 만드는게 정답
//		Object ikj1 = new InkjetPrinter("잉크젯","읭크",500);아래 실행할때 오류남

		AbstractPrinter ikj1 = new InkjetPrinter("잉크젯", "읭크", 500);
		operate(ikj1);
//		ikj1.turnOn();
//		ikj1.print();
//		ikj1.turnOff();

		// 인터페이스를 구현한 클래스의 객체를 생성하면"항상"인터페이스 타입참조변수를 사용한다

		// 레이저 프린터 하나 생성해서 켜고,프린터하고,꺼보기
		IPrinter raz1 = new RazorPrinter("레이저", "레이", 1000);
		operate(raz1);

//		raz1.turnOn();
//		raz1.print();
//		raz1.turnOff();
		// 제일 상위타입으로 써서 받아야함
		// 맨위에꺼써서 한꺼번에 가져올수있는데 굳이 아래있는것들을 일일이 가져올필요가없음
		// 오브젝트가안되는 이유는 IPrinter부터 메소드가 있어서
		// 오브젝트는 써도 되는데 턴온 프린트 턴오프부터 오류남
		// 모든타입의 상위타입이있으면 다 상위타입으로 받아오기
		// 다 가져오는건 아니고 구현이 필요한 상위타입부터 받아와야함

		// 배열에서 다양성을 활용
		// 잉크젯프린터 500개와 레이저프린터500개를 갖는 배열을 생성
		IPrinter[] iPrinterArr = new IPrinter[1000];
		// 배열에 잉크젯 프린터 500개,레이저프린터 500개 저장

		int iprinterArrLeng = iPrinterArr.length;
		for (int i = 0; i < iprinterArrLeng; i++) {
			if (i % 2 == 0) {
				iPrinterArr[i] = new InkjetPrinter("제조사명" + (i + 1), "Inkjet" + (i + 1), 1000);
			} else {
				iPrinterArr[i] = new RazorPrinter("제조사명" + (i + 1), "Razor" + (i + 1), 2000);
			}
		}

//		for (int i = 0; i < iprinterArrLeng; i++) {
//			if(i%2==0) {
//			InkjetPrinter inkjet = (InkjetPrinter)iPrinterArr[i];
//			System.out.print("잉크젯프린트 (");
//			System.out.print(inkjet.company);
//			System.out.print(", ");
//			System.out.print(inkjet.name);
//			System.out.print(", ");
//			System.out.print(inkjet.price);
//			System.out.println(")");
//			}else {
//				RazorPrinter razor = (RazorPrinter)iPrinterArr[i];
//				System.out.print("레이저프린트 (");
//				System.out.print(razor.company);
//				System.out.print(", ");
//				System.out.print(razor.name);
//				System.out.print(", ");
//				System.out.print(razor.price);
//				System.out.println(")");
//			}
//		}
		
		
//		tv4 instanceof Object
		for (int i = 0; i < iprinterArrLeng; i++) {
			if(iPrinterArr[i] instanceof InkjetPrinter) {
				System.out.print("잉크젯프린트");
			}else if (iPrinterArr[i] instanceof RazorPrinter){
				System.out.print("레이저프린트");
			}
			print(iPrinterArr[i]);
		}
		
		
		
		
		//100점은
		//toString()오버라이딩을 이요해보자
		//company,name,price는 AbstractPrinter가 가지고있다
		//그러므로, AbstractPrinter 에 toString()을 오버라이딩 하자
//		for (int i = 0; i < iPrinterArr.length; i++) {
//			System.out.println(AbstractPrinter.toString());
//		}
		for(IPrinter iprinter : iPrinterArr) {
					
				System.out.println((AbstractPrinter)iprinter);
			}
		
//		AbstractPrinter.toString();
			
		}//100점		
		
		//배열에 있는 것 꺼내서 출력
		//출력형태:잇크젯프린터(제조사명1,제품명1,1000원)
		//			  레이저프린터(제조사명1,제품명1,1000원)
		//			  ...(1000개)

	// main
	
	static void print(IPrinter iprinter) {
		System.out.print(((AbstractPrinter)iprinter).company);
		System.out.print(", ");
		System.out.print(((AbstractPrinter)iprinter).name);
		System.out.print(", ");
		System.out.print(((AbstractPrinter)iprinter).price);
		System.out.println(")");
	}

	// IPrinter인터페이스의 역할:InkjetPrinter,RazorPrinter의 타입을 일원화
	static void operate(IPrinter iprinter) {// IPrinter로 구현한 것들은 다 받아올수있음
		// iprinter가 가지고 있는 참조값에 따라서 각 클래스의 메소드가 호출됨
		iprinter.turnOn();
		iprinter.print();
		iprinter.turnOff();
	}// 이렇게 선언하면 묶어서 한번에도 사용가능

}// class
