package javabasic;

public class Variable2 {
		//중요
	//1.static변수
	//1)클래스로딩타임에 JVM이 관리하는 Method area라는 메모리 영역에 생김
	//2)객체 생성없이 사용할 수 있는 변수/시점을 잘 알아야함
	//method area가 실행될때 static변수가 자리를잡음
	//3)클래스의 모든 객체들이 값을 공유하는 변수
//	static member variable
	static int si = 1;
	//static 맴버 번수
	//2.non-static변수
	//1)실행타임에(런타임)JVM이 관리하는 Heap Area라는 메모리 영역에 생김
	//2)객채가 생성되면 객체마다 가지게 되는 변수 =객채마다 변숭의 값을 달리할 수 있음
	//Heap Area가 실행될때 non-static변수가 자리를 잡음
	//객채가 생성되어야 그때생김
// non static member  variable
	int nsi = 2;
	//non static 맴버 변수
	
	//static member method
		public static void main(String[] args) {
//					넣을값이 없다	반환타입 배열		
//			static 맴버 메소드 메인
			
		//시점을 볼수있어야 사용할수있다
			//시점과 공유
			//Heap영역
			Variable2 v2_1 = new Variable2();
			Variable2 v2_2 = new Variable2();
			System.out.println(v2_1.si);//1
			System.out.println(v2_2.si);//1
			
			//static변수는 메모리에 한번만 만들어 지고 모든 객체들이 값을 고유함
			v2_1.si = 2;
			System.out.println(v2_1.si);//2
			System.out.println(v2_2.si);//2

			System.out.println(v2_1.nsi);//2
			System.out.println(v2_2.nsi);//2
			
			//non static변수는 객체마다 하나씩 가지게 되는 변수
			 v2_1.nsi =5;
			 System.out.println(v2_1.nsi);//5
			 System.out.println(v2_2.nsi);//2 
			
			 //main 메소드의 지역변수
			 //main 메소드가 호출되면 메모리에 생겼다가 main 메소드가 종료되면 소멸
			
			 int li = 3;
			
			
			
	}
		
		
		
		
		//non static member method
		public int add(int i,int j) {
			//add메소드의 지역변수
			int sum = i+j;
			return sum;
		}
		//변수들은 값을따로 가져야하기에 객체로
		//메소드는 따로 다넣을 필요는 없기에 Method area에 먼저올라옴
		
		
		
}
