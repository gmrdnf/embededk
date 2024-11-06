package javabasic.oop.inheritance;

//상속 받는 클래스
//하위 클래스(sub)=자식클래스(child)=파생클래스(derived)
public class Child extends Parent{
//가지고있다랑 사용할수있다는건 다른이야기
//Child는 아무것도 가지고있지않지만  parent의것들을 사용할수있음
	//또한 다쓸수있는것도 아님
	//private은 사용 불가
	//private 아닌 것중 
	//non-static인 
//	void m() {
//		System.out.println("m()");
//	} 이것만 사용가능
	
	
	//Parent의 참조범위는 Object~ Parent
	//Child의 참조범위는 Object~Parent~Child
	//항상 하위클래스 객체의 참조범위는 상위클래스 객체의 참조범위보다 크다
	
}
