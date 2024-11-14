package javabasic.oop;

public class WrapperTest {

	// wrapper클래스
	// 기본타입의 값을 가지고 있는 참조타입
	// Byte,Short,Integer,Long,Folat,Double,Character,Boolean

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);//int 최대값
		System.out.println(Integer.MIN_VALUE);//int 최소값
		System.out.println(Integer.SIZE);//bit  크기
		
		Integer i1 = 5;//warrpin(기본타입>참조타입)
		Integer i2 = 10;
		
		System.out.println(Integer.compare(i2, i1));//앞가 크면 1
		System.out.println(Integer.compare(i1, i1));//같으면 0
		System.out.println(Integer.compare(i1, i2));//뒤가 크면 -1
		
		int i3 = i1.intValue();//unWrappin(참조타입>기본타입)
		System.out.println(i3);
		
		System.out.println(Integer.max(i1, i2));//최대값
		System.out.println(Integer.min(i1, i2));//최소값

		int i4 =Integer.parseInt("100");//문자열>int
		System.out.println(i4);
	
//		int i5= Integer.parseInt("백");//NumberFormatException
		
		System.out.println(Integer.toBinaryString(10));//2진 문자열
		System.out.println(Integer.toOctalString(10));//8진 문자열
		System.out.println(Integer.toHexString(10));//16진 문자열
		
		Integer i6 = Integer.valueOf(5);//wrappin
		
		
		
		
		
	}// main

}// class
