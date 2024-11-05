package javabasic.project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class InPut {

	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	StringTokenizer st = new StringTokenizer(line);
	// 데이터 정의
	// 1.사용자가 입력한 숫자를 저장할 배열:크기6
	int[] userNums = new int[6];
	// 2.컴퓨터로 추출한 숫자들을 저장할 배열:크기 7
	int[] comNums = new int[7];

	// 기능정의
	// 1.사용자에게 6개의 1~45중 정수를 입력받는다 /inputUserNums
	// =>6개를 입력했는지 확인하자.그렇지않다면 6개를 다시입력하도록하자
	// =>6개를 입력했는데 중복된 숫자가 있는지 확인하자.그렇지않다면 6개를 다시입력
	// 하도록하자
	// =>입력한 숫자의 범위가 1~45사이인지도 확인해야한다.그렇지않다면
	// 그렇지 않다면 6개를 다시입력하도록하자
	// =>6개를 입력했는데 중복된 숫자가 있는지 확인하자
	// 그렇지 않다면 6개를 다시입력하도록하자
	// =>중복체크는 컴퓨터가 랜덤숫자 뽑아낼때도 사용하니 별도로 로직으로 분리하도록
	// 하자
	void inputUserNums() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		int i = 0;
		while (st.hasMoreTokens()) {
			userNums[i] = Integer.parseInt(st.nextToken());
			i++;
		} // 사실 인티져쓸 이유도없다 연산할꺼면 int가맞고 아니면Stirng이 나음
	}

	// 2.컴퓨터에서 7개의 1~45중의 정수를 랜덤하게 추출한다/getComNums
	// =>중복체크를해서 7개가 모두 다른 수여야한다.
	void getComNums() {
		int comNumsLeng = comNums.length;
		for (int i = 0; i < comNumsLeng; i++) {
			int randomNum = (int) (Math.random() * 45) + 1;
			if (!checkDup(randomNum)) {
				comNums[i] = randomNum;
			} else {
				i--;
			}
		}
	}

	// 6중복체크를 해야한다 checkDup
	boolean checkDup(int num) {
		int comNumsLeng = comNums.length;
		for (int i = 0; i < comNumsLeng; i++) {
			if (comNums[i] == num)
				return true;
		}
		return false;
	}

	// 3.사용자의 입력과 컴퓨터에서 추출한 숫자를 비교해서 맞은 수를 리턴한다.
	// 이름/getCorrectNums
	int getCorrectNums() {
		//두 배열을 교차해서 맞은 숫자의 수를 리턴하는 코드
	
	}

	// 4.등수연산을 해야한다. getRank

	// 5.결과를 출력한다 /printResult

}
