package javabasic.oop;

public class IAnimalMain {
	//dog1멍멍
	//dog2왈왈
	public static void main(String[] args) {
		
		//멍멍짓는개
		IAnimal mungDog = new Dog2();
		mungDog.sound();
		//상위타입이 있다면 상위타입으로
		//만들때부터 잘 만들어야함 클래스인지 인터페이스인지 무엇을 참조할것인지 
		
		//왈왈짓는개
		IAnimal walDog = new AnimalAdapter() {
		//타입을 오버라이딩한 어떠한 클래스가됨
			//추상클래스를 상속받은 어떠한 객체?
		
			@Override
			public void sound() {
				System.out.println("왈왈");
			}
		};
		
	}//main
}//class
