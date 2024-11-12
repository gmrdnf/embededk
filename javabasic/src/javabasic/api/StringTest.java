package javabasic.api;

import java.util.Iterator;

public class StringTest {
	public static void main(String[] args) {
	
		String str1 = "abcdefgh";
		
		System.out.println(str1.charAt(3));
		//배열처럼 0123456 순서에있는걸 출력
		System.out.println(str1.concat("ij"));
		System.out.println(str1+"ij");
		System.out.println(str1.contains("cba"));
		//포함하고있는지 확인
		System.out.println(str1.endsWith("gh"));
		//무엇으로 끝나는지 확인
		System.out.println(str1.equals("abcdefgh"));
		//같은지 확인
		System.out.println(str1.equalsIgnoreCase("AbcdefgH"));
		
		System.out.println(str1.getBytes());
		//배열참조
		byte[] byteArr= str1.getBytes();
		for (byte b :byteArr) {
			System.out.println((char)b);
		}
		
		System.out.println(str1.indexOf('c'));
		
		String str2 ="    ";
		
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());
		
		String str3= "abcdabcdabcd";
		
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str3.length());
		System.out.println(str3.repeat(2));
		System.out.println(str3.replace("bc", "ef"));
		System.out.println(str3.replaceAll("ab", "12"));
		
		String str4 ="010-1234-5678";
		
		String[] strArr = str3.split("-");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		String str5="안녕하세요! 자바 재밌나요?";
		
		System.out.println(str5.startsWith("안녕"));
		System.out.println(str5.substring(7));
		System.out.println(str5.substring(7,9));
		
		char[] charArr = str5.toCharArray();
		for(char ch : charArr) {
			System.out.println(ch);
		}
		
		String str6= "    AbC dEf  ";
		
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		System.out.println(str6.trim());
		
		System.out.println(String.valueOf(false));
		System.out.println(""+false);
		//이게 더빠름 위에 코드보다
		System.out.println(String.valueOf(100));
		System.out.println(""+100);
		//이코드도
		System.out.println(String.valueOf(new Object()));
		System.out.println(""+ new Object());
		
		//공부해두기
		//있다는걸 알아야 쓰지
		//기억안나면 api가서 쓰면됨
		//모르면 혼자 만들어야함 //효율성 쓰래기
		//안되면 외우셈
	}//main
	
}//class
