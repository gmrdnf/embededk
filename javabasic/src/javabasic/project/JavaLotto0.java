package javabasic.project;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

// Java Lotto : 개인 Java 프로젝트

// [Lotto 프로그램 구현]

// 1. 기능
// 1) 사용자에게 1~45 중 중복되지 않은 6개의 정수를 입력받는다.
// 2) 중복되지 않은 7개의 정수를 랜덤하게 뽑아낸다. (앞의 6개는 로또번호, 7번째는 보너스번호)
// 3) 로또 당첨규칙에 따라서 사용자의 등수를 출력한다.

// 2. 당첨 규칙
// 1) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호가 모두 일치하면 1등
// 2) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 5개가 일치하고
//     보너스번호가 일치하면 2등
// 3) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 5개가 일치 3등
// 4) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 4개가 일치 4등
// 5) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 3개가 일치 5등
// 6) 나머지는 꽝! 다음기회에!

// 3. 출력 예시
// 로또번호 7개를 입력해 주세요!
// 21 3 8 9 40 33 19
// 추첨번호는 3 8 33 22 10 34 (보너스번호:45)
// 5등입니다!

public class JavaLotto0 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner scanner = new Scanner(System.in);

		System.out.println("로또번호 7개를 입력해 주세요!");
		String line = scanner.nextLine();
		// 한 라인의 문자열 입력
		StringTokenizer st = new StringTokenizer(line);
		// 문자열을 공백문자 기준으로 토크나이징(토큰으로 분리)

		int[] tokenresult = new int[7];
		// 토큰이 있는 동안 반복
		for (int i = 0; i < tokenresult.length; i++) {
			if (st.hasMoreTokens()) {
				// 토큰 하나씩 가져와서 출력
				String token = st.nextToken();

				tokenresult[i] = Integer.parseUnsignedInt(token);
//				System.out.println(tokenresult[i]);
			} // 여기가 tokenresult[] 에 사용자가 입력한 정답 담음
		}
		System.out.println("입력하신번호는 " + tokenresult[0] + "," + tokenresult[1] + "," + tokenresult[2] + ","
				+ tokenresult[3] + "," + tokenresult[4] + "," + tokenresult[5] + "(보너스번호 :" + tokenresult[6] + ")");

		// 랜덤정수 추출
		// Math.random() : 0.0<=n<1.0 범위의 실수를 반환

		int[] winningNumber = new int[7];

		for (int i = 0; i < winningNumber.length; i++) {
			int randomNumber = (int) (Math.random() * 45) + 1; // 1 ~ 10
			winningNumber[i] = randomNumber;
		} // 여기가 당첨번호나와서 winningNumber[]에 담아주는거

		int result = 0;
		int bonus = 0;
		// 당첨번호가 몇개맞는지 확인하기
		for (int i = 0; i < 6; i++) {
			if (winningNumber[i] == tokenresult[0]) {
				++result;
			} else if (winningNumber[i] == tokenresult[1]) {
				++result;
			} else if (winningNumber[i] == tokenresult[2]) {
				++result;
			} else if (winningNumber[i] == tokenresult[3]) {
				++result;
			} else if (winningNumber[i] == tokenresult[4]) {
				++result;
			} else if (winningNumber[i] == tokenresult[5]) {
				++result;
			}
		}
		if (winningNumber[6] == tokenresult[6]) {
			++bonus;
		} // 보너스 번호맞는지 확인
		System.out.println(
				"당첨번호는 " + winningNumber[0] + "," + winningNumber[1] + "," + winningNumber[2] + "," + winningNumber[3]
						+ "," + winningNumber[4] + "," + winningNumber[5] + "(보너스 번호:" + winningNumber[6] + ") 입니다!!");
		// 당첨번호출력

		if (result < 3) {
			System.out.println("꽝! 다음기회에!");
		} else if (result == 3) {
			System.out.println("5등입니다!");
		} else if (result == 4) {
			System.out.println("4등입니다!");
		} else if (result == 5) {
			System.out.println("3등입니다!");
		} else if (result == 5 && bonus == 1) {
			System.out.println("2등입니다!");
		} else if (result == 6) {
			System.out.println("1등입니다!");
		} // 몇등인지 출력

		scanner.close();

	} // main

} // class
