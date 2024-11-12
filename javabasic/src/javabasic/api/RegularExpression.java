package javabasic.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	 * 정규표현식(Regular Expression
	 * 정해진 패턴 문자열을 사용해서 문자열내의 문자열을 검색,치환에 사용되는 표현식
	 * ^ : 문자열의 시작 캐럿
	 * [^문자열]:문자열이 아닌 것
	 * $ :문자열의 끝 
	 * . : 임의의 한 문자 
	 * * : 문자가 0개 이상 발생
	 * + :문자가 1개 이상 발생
	 * ? : 문자가 0개 또는 1개 발생
	 * []:문자의 집합 범위
	 * {}:문자열의 반복 횟수
	 * | : or
	 *대문자들은 반대의 의미
	 * \b : 단어의 경계
	 * \B:단어가 아닌 것의 경계
	 * \s :공백문자
	 * \S: 공백문자가 아닌 문자
	 * \w :word (영문대소문자,숫자,_)
	 * \W :word가 아닌 것
	 * \d :숫자 =[0-9]
	 * \D: 숫자가 아닌것
	 * \\:\문자 자체
	 */

public class RegularExpression {

	public static void main(String[] args) {
		
//		String str1 ="abcde";
//		System.out.println(str1.matches("abc"));//false
//		System.out.println(str1.matches("abcde"));//true
//		
//		String str2 = "010-1234-5678";
//		
//		System.out.println(str2.matches("\\d{3}-\\d{3}-\\d{4}"));//false
//		System.out.println(str2.matches("\\d{3}-\\d{4}-\\d{4}"));//true
//		
//		String str3 ="12345";
//		//숫자 5개 패턴문자열
//		System.out.println(str3.matches("\\d{5}"));//true
//		System.out.println(str3.matches("\\[0-9]{5}"));//true
//		
//		String str4 = "abc123";
//		String str5 = "ABC123";
//		//영문 3개가 나오고 숫자 3개가 나오는 패턴
//		System.out.println(str4.matches("[a-zA-Z]{3}\\d{3}"));//true
//		System.out.println(str4.matches("[a-zA-Z]{3}\\d{3}"));//true
//		//이거 로또에 쓰면 안되나? 가능할거같은데
//		
//		String str6 = "안녕 자바";
//		//한글인 경우[가-힣]이 한글 한글자와 매칭
//		System.out.println(str6.matches("[가-힣]{2}\s[가-힣]{2}"));//true
		
		//실습1
		//전화번호 매칭 패턴만들기 (02-123-4567,031-123-4567,02-1234-5678,031-1234-5678)
		//아래배열의 문자열들에 모두 매칭되는 전화번호 정규표현식 패턴만들기
		//전화번호:숫자2개나 3개-숫자3개나 4개-숫자 4개
		String[] telArr = {
				"02-123-4567",
				"031-123-4567",
				"02-1234-5678",
				"031-1234-5678",
		};
		String patternStr1 ="^\\d{2,3}-\\d{2,4}-\\d{4}$";
		for (String str : telArr) {
			System.out.println(str.matches(patternStr1));
		}
		
		//실습2
		//아래배열의 문자열들에 모두 매칭되는 주민등록번호 정규표현식 패턴만들기
		//주민등록번호:년도 2자리 월2자리 일2자리 -남녀구분1자리-숫자 6자리
		//년도:00~99,월01~12,일:01~31,남녀구분:1~4중하나
		String[] ssnArr = {
				"190101-3234567",
				"001231-4234567",
				"900101-1234567",
				"800101-2234567",
		};
		//(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])
		String patternStr2 ="^\\d{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])-[1-4]\\d{6}$";
		for (String str : ssnArr) {
			System.out.println(str.matches(patternStr2));
		}
		
		
		//java.util.regex 패키지
		//Pattern:정규표현식 패턴클래스
		//Matcher:패턴에 맞는지 체크라는 기능 클래스
		
//이건 api 어떻게쓰는지 나와있는 코드 가져온거
//		Pattern p = Pattern.compile("a*b");
//		 Matcher m = p.matcher("aaaaab");
//		 boolean b = m.matches();
		
		//flag
		//Pattern.CASE_INSENSITIVE: 대소문자 구별 없이 패턴 매칭을 함
		//Pattern.MULTILINE :문자열이 여러 라인으로 되어있을때 여러 라인에서 패턴매칭을 함
		
		
		
		//a가 0개 이상나오고 b가 나오는 패턴
		Pattern p = Pattern.compile("^a*b$",Pattern.CASE_INSENSITIVE);
		
		//Matcher생성
		Matcher m1 = p.matcher("ab");
		Matcher m2 = p.matcher("aaab");
		Matcher m3 = p.matcher("AB");
		Matcher m4 = p.matcher("ba");
		Matcher m5 = p.matcher("aabb");
		
		System.out.println(m1.matches());//true
		System.out.println(m2.matches());//true
		System.out.println(m3.matches());//true
		System.out.println(m4.matches());//false
		System.out.println(m5.matches());//false
		
		
		
	}//main
	
}//class







