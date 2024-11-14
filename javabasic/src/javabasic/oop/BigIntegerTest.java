package javabasic.oop;

import java.math.BigInteger;

//BigInger:long의 범윌르 넘는 크거나 작은 정수
//BigDecimal:double의 범위를 넘는 크거나 작은 실수


//java.math.BigInteger
//대형정수라 더하기안됌 add나 and사용
//연산자체가 그냥 안되기때문에 메소드로 연산함

public class BigIntegerTest {
	
	public static void main(String[] args) {
		
		BigInteger bi1 = new BigInteger("465489765451321548949846456489789534167487487498974489648964896468648964894896489689874465445674987496986748946896744896784668494864881654894848644964968749674967496748964896654967496496489649685464964749864796849646464964464684648967489641869496489644649496496496496");
		System.out.println(bi1);
		BigInteger bi2 = new BigInteger("74567456846864572154894984645648978953467487487498974489648964896468648964894896489689874465445674987496986748946896744896784668494864881654894848644964968749674967496748964896654967496496489649685464964749864796849646464964123435435725476386584574596496496496");
		System.out.println(bi2);
		
		BigInteger bi3 =bi1.add(bi2);//덧셈
		System.out.println(bi3);
		
		System.out.println(bi1.subtract(bi2));//뺄셈
		System.out.println(bi1.multiply(bi2));//곰셈
		System.out.println(bi1.divide(bi2));//나눗셈
		
		BigInteger bi4 = bi1.max(bi2);
		System.out.println(bi4);
		BigInteger bi5 = bi1.min(bi2);
		System.out.println(bi5);
		
		
		
		
		
	}//main
	
	
}//class
