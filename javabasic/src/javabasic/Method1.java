package javabasic;

public class Method1 {
	public static void main(String[] args) {//1)
		
		//main 에서 print메서드를 호출
		print("Hello Java!");//"Hello Java!"//2)//Method1. 이 생략된것
//		Method1.print("Hi Java");이것처럼
		//출력안하는 이유는 메소드안에서 이미 출력을 실행하기때문
		//main에서 add메서드를 호출
//		int sum = add(10,20);
//		System.out.println(sum); //안쓰는이유는 한번만쓰는 불필요한 변수이기때문에	
		System.out.println(add(10,20));//30         //5)  	//add앞에 Method1. 이 생략된것
//main메서드가 return;하면 프로그램이 종료		
//		return;//메인메소드도 원래는 리턴이 있다  void 이기때문에 상관없음
		
		/*
		 * 메서드 실행순서
		 * 1)main 호출
		 * 2)print 호출 메소드 호출
		 * 3)print내의 println 호출
		 * 4)add 호출
		 * 5)main내의 println 호출
		*/
		
	}//main
	
	//static:객체 생성없이 클래스로 접근(호출)할 수 있는 메소드
	//void:반환값이 없다
	//Stirng str :파라미터(parameter)변수 =매개변수
	//공부할때 영문공부하면 좋음 번역이 이상한게 있기때문
	static void print(String str) {
		System.out.println(str);//3)
		//return;//원래는 있지만 리턴할 값이 없으면 그냥 알아서 컴파일러가 넣어줌
		//안보인다고 리턴이 없는 것은 아님
	}//return;:리턴값이 없을때는 return;구문을 생략가능
		//하지만, 생략하면 return구문을 넣어준다, 즉 모든 메서드는 리턴구문을 가지고 있다.
	
	//int:반환타입(메소드 실행 후 반환할 값의 타입)
	//return 값; :메서드 실행 후 값을 반환
	static int add(int a,int b) {//이줄이 메소드 시그니처라 부름//4)
//		int sum = a+b;
//		return sum; 다른곳에서 쓰지도 못하는 썸 에 굳이 한줄을 더추가할 필요가 없으니 아래코드가
		return a+b;//더좋음
		
		//한번만 쓸 변수는 만들지 말기
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
