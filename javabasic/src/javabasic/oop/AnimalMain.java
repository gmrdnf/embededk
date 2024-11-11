package javabasic.oop;

public class AnimalMain {

	public static void main(String[] args) {
		
		//강아지 한마리만들어서 소리르 내봅니다
		Animal dog = new Dog();
		//바보 new Anima로 만듬 
		dog.sound();
		//고양이 한마리만들어서 소리르 내봅니다
		Animal cat = new Cat();
		cat.sound();
		
		//파리를 한마리 만들어서 소리르 내봅니다.
		Animal bug = new Animal() {
		@Override
			public void sound() {
				System.out.println("파리는 위잉소리를 냅니다");
			}//이것이 익명클래스
		};
		bug.sound();
		
		//상어 한마리 만들어서 소리를 내봅니다
		Animal shark = new Animal() {
			@Override
				public void sound() {
					System.out.println("상어는 ??소리를 냅니다");
				}
			};
			shark.sound();
		
	}//main
	
}
