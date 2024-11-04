package javabasic.oop;

public class CarMain {
	
	public static void main(String[] args) {
		//Car타입 객체를 생성
		//1. car라는 생성자를 만듬
		//2.만든 car타입을 해싱알고리즘으로 주소를 참조값으로 변환
		//3.그것을 객체참조변수에 저장
		
		
		//Car타입 객체를 생성
		//1.Car()생성자를 호출
		//2.new연산을 통해서 Car타입의 객체가 메모리에 생성
		//3.메모리에 생성된 객체의 주소를 해시알고리즘을 사용해서 참조로 변환
		//4.참조(참조값)을 Car타입 객체 참조변수인 bmw에 저장
		Car bmw = new Car();
		System.out.println(bmw);
		//출력 javabasic.oop.Car@5305068a
		//			이것이 타입				16진수 8자리 32비트 4바이트
		
		//객체의 멤버변수들에 값을 할당(타입에 맞춰서)Car 클래스 참조
		bmw.company = "BMW KOREA";
		bmw.model="520D";
		bmw.name = "BMW";
		bmw.price =1000;
		//. 을 참조연산자라고 부름 레퍼런스
		System.out.println( 
				"제조사명: " +bmw.company+"\n"
				+"모델명 :" +bmw.model+"\n"
				+ "이름 : " + bmw.name+"\n"
				+"판매가격 : " +bmw.price
				);
		
		
		Car audi =new Car();
		System.out.println(audi);
		
		audi.company ="AUDI KOREA";
		audi.model = "A8";
		audi.name = "AUDI";
		audi.price = 1500;
		
		System.out.println( 
				"제조사명: " +audi.company+"\n"
				+"모델명 :" +audi.model+"\n"
				+ "이름 : " + audi.name+"\n"
				+"판매가격 : " +audi.price
				);
		
		//javabasic.oop.Car@1f32e575
	//객체가같은건 참조값이 같은것
		//bmw audi는 타입은 같지만 참조값이 다르기때문에 다른 객체이다
		//같은곳에 있으면 참조값이 같음
		//같은곳에 있지않으면 참조값이 틀림
		//같은 객체 =주소가 같다 =참조가 같다 =참조값이 같다
		//메모리상에 같은곳에 있는 객체를 같은 객체라고 함
		Car audi2 =audi;
		audi2.price= 2000;
		
		System.out.println(audi2);
		
		System.out.println( 
				"제조사명: " +audi2.company+"\n"
				+"모델명 :" +audi2.model+"\n"
				+ "이름 : " + audi2.name+"\n"
				+"판매가격 : " +audi2.price
				);
		
		System.out.println( 
				"제조사명: " +audi.company+"\n"
				+"모델명 :" +audi.model+"\n"
				+ "이름 : " + audi.name+"\n"
				+"판매가격 : " +audi.price
				);//같은 객체이기때문에 아우디 2가 2000으로 바꾸었을때 그냥 아우디도 2000원으로 바뀜
		//이유 같은메모리안에 값이 바뀌는거기때문에
		
		
		//javabasic.oop.Car@1f32e575
		//메모리상에 있는 audi객체의 참조값을 복사
		//audi2객체는 audi객체와 같은 객체이다
		
		//같은객체란 참조값이 같은 것 
		//참조값이 같으면 같은 객체
	}//main
	
}//class
