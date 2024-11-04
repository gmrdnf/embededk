package javabasic;

import java.util.Scanner;

//자바. 랭제외하고는 다 임포트해야 사용가능
public class ConsoleIO {
	public static void main(String[] args) {
		// 표준입력(키보드입력)을 받는 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		// InputStream java.lang.System.in 이 System.in이다
		// 이것이 참조타입

//		1)//Scanner를 통해 입력된 문자열이 있다면 반복
//		while(scanner.hasNext()) {
//			//입력한 문자열을 nextStr변수에 저장
//			String nextStr = scanner.next();//같다 == 
//			//메소드가 입력될때까지 대기하는것을 블로킹 메소드라 함
//		//=오른쪽에서 입력받은것을 변수에 저장한다는 뜻
//			System.out.println(nextStr);
//			//시스템에 아웃에 프린트엘엔에 스트링을 넣는것을 알아야함
//			//하나하나 다뜯어봐야할듯
//			
//		}//void:반환값 없음

//		두 수를 입력받아 합계를 출력하는 프로그램
		System.out.println("두 수를 입력해 주세요");

		String firstStr = "";// 첫번째 입력받을 문자열을 저장할 변수
		// null스트링이라 부름
		int firstInt = 0;// 첫번째 입력받은 문자열을 정수로 변환해서 저장할 변수

		String secondStr = "";
		int secondInt = 0;

		if (scanner.hasNext()) {// 입력받은 문자열이 있다면
			firstStr = scanner.next();// 입력받은 문자열을 변수에 저장
			firstInt = Integer.parseInt(firstStr);// 문자열은 int로 변환
			// 기본타입과 참조타입은 형변환이 안됌
		}

		if (scanner.hasNext()) {// 입력받은 문자열이 있다면
			secondStr = scanner.next();// 입력받은 문자열을 변수에 저장
			secondInt = Integer.parseInt(secondStr);// 문자열은 int로 변환
		}

		// 두 수를 더해서 sun 변수에 저장
		int sum = firstInt + secondInt;

		System.out.println("두 수의 합은 " + sum + "입니다.");
		// +는 문자열 접합(Concatenation)

		scanner.close();
//		 미리써놓고 사용하기 //성능문제
//	close 꼭쓰기
		
		//컨트롤 쉬프트 f 자동 줄맞추기~
		//에러코드 분석하기
		
	}// main
}// class
