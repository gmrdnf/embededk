package javabasic;

public class Wrapper {
	
	public static void main(String[] args) {
	
		byte b= 1; //1바이트 정수 ,값의 유효범위 -2^7 ~2^7-1
		short s =2;//2바이트 정수,값의 유효범위 -2^15 ~2^15-1
		int i = 3;//4바이트 정수,값의 유효범위 -2^31 ~ 2^31-1,정수의 기본타입
		long l = 4;//8바이트 정수,값의 유효범위 -2^63 ~2^63-1
		float f = 3.14f;//4바이트 실수,3.14는 double이므로 3.14f라고 써서
							//4바이트 3.14임을 알려줘야 함 소문자 대문자는 상관없음
		double d = 1.0;//8바이트 실수,								실수의 기본타입
		char c = 'A';//2바이트 유니코드문자
		boolean bool = true;//1바이트, true or false의 값만 가짐
		String st1 ="10123";
		String st2 ="0001";
		String st7 ="true";
		
		//여기부터 하나도 이해를 못한거같다

		//Wrapper class
		//Wrapping: 기본타입의 값을 갖는 참조타입을 생성하는 것 = Boxing
		//기본타입마다 해당하는 wrapper class를 제공함
		Byte wb =new Byte(b);
		Short ws = new Short(s);
		Integer wi = new Integer(i);
//		Integer wi5 = new Integer(d);
		Long wl = new Long(l);
		Float wf = new Float(f);
		Double wd = new Double(d);
		Double wd1 = new Double(i);
		Character wc = new Character(c);
		Boolean wbool = new  Boolean(bool);
		Boolean wbool1 = new  Boolean(st7);
//		Boolean wbool1 = new  Boolean(st7);
		
		Integer st3 = new Integer(st1);
		Integer st4 = new Integer(st2);
		Double wd3 = new Double(st2);
		System.out.println(st3.intValue());
		System.out.println(wd1);
		System.out.println();
		System.out.println(st4);
		System.out.println(st7);
		System.out.println(wd1);
//		System.out.println(st7.booleanValue());
//		
//Q String "true"를 넣고 wrapping은 성공 이유: 기본타입 즉 boolean타입 true or false 인 참조타입 String 이기때문
//		하지만 unwrapping 은 실패 이유? 참조 타입String이 기본타입 boolean true를 꺼내는것이 아니라 String채로 꺼내는건가
// 해답 기본타입과 참조타입은 형변환이 안됌 즉 String 과 boolean은 형변환을할수없음
//		근데 그럼 다시 모순 Boolean wbool1 = new  Boolean(st7); 코드에 오류가있다
//		둘중하나 저 코드가 제할일을 다못하고 그냥 덩그러니 놓여있기만하거나 or System.out.println(st7); 
//		이코드가 무시하고 위에부터 가져오거나//둘다 아니였음
//		만약 그렇다 치면 unwrapping은 설명할수있는가
//		참조타입인 String 안에 "true" 기본타입 boolean 으로 바꾸기엔 형변환이 안된다 그렇기에 바꿀수없다?
//		선생님 답 api 안에 String이 boolean 으로 바꿀수있는 api가 존재하기때문에 바뀐거다
		//근데 그렇다면 숫자출력이아니라 true or false 만 출력되었어야하는게 아닌가
		
		
//		System.out.println((Integer.parseInt(wi));
	//Unwrappin : 참조타입이 가지고 있는 기본타입의 값을 꺼내는 것 = Unboxing
		System.out.println(wb.byteValue());
		System.out.println(ws.shortValue()); 
		System.out.println(wi.intValue());
		System.out.println();
		System.out.println(wl.longValue());
		System.out.println(wf.floatValue());
		System.out.println(wd.doubleValue());
		System.out.println(wc.charValue());
		System.out.println(wbool.booleanValue());
		
		//알아먹기 쉽게 설명하자면 String 값에 "5"가 들어가있을시 Integer.parsInt() 사용시 "5"가아니라 값 5가 된다
//			Unwrapping 은 그 반대 
//			(String boolean은 안됌 API로 강제로 바뀌는거지 에초에 형변환이 안됌 unwrapping은 당연히 출력도 안됌
//		9버전이후 출력을 권장하지않음 원래라면 boolean 타입이 나와야하나 String으로 출력됨 무언가 호환이 안돼는듯함
		
		//auto wrapping, auto unwrapping
		//auto wrapping : wrapping 이 자동으로 일어남
		//3은 int타입인데 Integer타입에 할당해야함
		//자동으로 3이 new Integer(3)이 된다 => auto wrapping
		Integer i2 = 3;
		
		//auto unwrapping : unwrapping이 자동으로 일어남
		//i2는 Integer타입이므로 + 연산을 위해서 i2가 가진 3을 자동으로 꺼냄
		//i2.intV alue(3) 연산이 자동으로 수행됨
		int result = i2 +5;
		
		
		
		
	}
}
