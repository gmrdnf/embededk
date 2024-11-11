package javabasic.exoop4;

public class CakeMain {
	public static void main(String[] args) {
		
		//일회성 모카케이크 와 초콜릿케이크, 바나나케이크를 익명클래스로 생성하여 아래와 같이 출력해 봅시다.
		//"모카케이크가 만들어 졌습니다"
		//"초콜릿케이크가 만들어 졌습니다"
		//"바나나케이크가 만들어 졌습니다"
		
//		Cake moca =new Cake("모카") {
//			@Override
//			public String getName() {
//				return super.getName();
//			}
//		};
//		System.out.println(moca.getName());
		//복사해서도 할수있지만 메소드로 만들수있음
		
		makeCake("모카");
		makeCake("초콜릿");
		makeCake("바나나");
		
//		Cake mocha =new Cake(){
//			@Override
//			public void cake() {
//				System.out.println("모카케이크가 만들어 졌습니다");
//			}
//		};
//		mocha.cake();
//		//Cake choco =new Cake();
//		Cake choco =new Cake(){
//			@Override
//			public void cake() {
//				System.out.println("초콜릿케이크가 만들어 졌습니다");
//			}
//		};
//		choco.cake();
//		//Cake banana =new Cake();
//		Cake banana =new Cake(){
//			@Override
//			public void cake() {
//				System.out.println("바나나케이크가 만들어 졌습니다");
//			}
//		};
//		banana.cake();
	}//main
	
	public static void makeCake (String name) {
		Cake cake =new Cake(name) {
			@Override
			public String getName() {
				return name;
			}
		};
		System.out.println(cake.getName()+"가 만들어 졌습니다.");
	}//반복되는건 다 걍 메소드로 만들어버리자
	//일일이다쓰는것만큼 뻘짓도 없다
	
	
	
}//class
