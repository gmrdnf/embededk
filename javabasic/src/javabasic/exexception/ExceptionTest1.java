package javabasic.exexception;

public class ExceptionTest1 {
	
//	long[] longArr =new long[1024*1024*1024];
//	public static void main(String[] args) {
//		//OutOfMemory Error
//		new ExceptionTest1();
//	}
	//이 오류가 뜨면 최대 힙싸이즈를 늘리거나/하지만 이건 임시방편
	
	
	
	
	//OutOfMemory에러와 StackOverFlow에러를 발생시켜봅니다.
	public static void main(String[] args) {
		a();
	}
	private static void a() {
		System.out.println("a메소드 호출됨");
		b();
	}
	
	
	//c()가 b() 예외를 던지면 b메소드는
	//1.직접 try ~catch~ 로 처리한다.
	//2.throws해서 호출한 쪽에 예외 처리를 위임
	private static void b() {
		System.out.println("b메소드 호출됨");
		a();
	}//StackOverFlowError/메소드가 서로 순환호출하고있구나 라고 생각하면됨 반복되는것만 찾으면됨
	
	
}
