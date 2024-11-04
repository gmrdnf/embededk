package javabasic;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		
		byte b =1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 1.0f;
		double d = 2.0;
		char c = 'A';
		boolean bool = true;
		
		//		short s = 2;
		//		byte b =1;
		s=b;//s = (short)b;과정이 자동으로 일어남 = 자동 형변환= 묵시적 형변환
		//앞은 short 2 뒤에는 byte 1
		
		b=(byte)s;//형변환에 대해서 개발자가 책임짐 = 강제 형변환 =명시적 형변환
		//앞은 byte1 뒤는 short 2
		
		l=i;
//		앞은 long  8뒤는 int 4
		i = (int)l;
//		앞은 int 4 뒤는 long 8
		d = (double)f;
//		실은 뒤에 double이 써져있다고 봐야한다
		f = (float)d;
		
		b=65;
		//c=b;//char타입으로의 형변환은 강제형변환 해야 함
		c= (char)b;
		System.out.println(c);
//		'A'출력 65 는 A (ASCII CODE 65에 해당하는 문자)아스키 코드
		
		//boolean 타입은 다른타입과의 형변환이 불가능하다
		//bool = b;
		//b= bool;//그래서 저번에 했던 boolean String 변환이 안먹히는 거였다!
		//그것도모르고 계속 머리잡고있었네
		
		
	}//main
}//class
