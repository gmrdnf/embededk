package javabasic.project;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOOPLotto {

	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	StringTokenizer st = new StringTokenizer(line);
	// 데이터 정의
	// 1.사용자가 입력한 숫자를 저장할 배열:크기6
	// 2.컴퓨터로 추출한 숫자들을 저장할 배열:크기 7
	// 기능정의
	// 1.사용자에게 6개의 1~45중 정수를 입력받는다 /inputUserNums
	// =>6개를 입력했는지 확인하자.그렇지않다면 6개를 다시입력하도록하자
	// 아마 if?
	// =>6개를 입력했는데 중복된 숫자가 있는지 확인하자.그렇지않다면 6개를 다시입력
	// 하도록하자
	// 이것도...if?
	// =>입력한 숫자의 범위가 1~45사이인지도 확인해야한다.그렇지않다면
	// 그렇지 않다면 6개를 다시입력하도록하자
	// 이것도..if?
	// =>6개를 입력했는데 중복된 숫자가 있는지 확인하자
	// 그렇지 않다면 6개를 다시입력하도록하자
	// if???
	// =>중복체크는 컴퓨터가 랜덤숫자 뽑아낼때도 사용하니 별도로 로직으로 분리하도록
	// 하자
	//
		 // 사실 인티져쓸 이유도없다 연산할꺼면 int가맞고 아니면Stirng이 나음

	// 2.컴퓨터에서 7개의 1~45중의 정수를 랜덤하게 추출한다/getComNums
	// =>중복체크를해서 7개가 모두 다른 수여야한다.

	// 3.사용자의 입력과 컴퓨터에서 추출한 숫자를 비교해서 맞은 수를 리턴한다.
	// 이름/getCorrectNums
//	int getCorrectNums() {
//		//두 배열을 교차해서 맞은 숫자의 수를 리턴하는 코드
//	
//	}

	// 4.등수연산을 해야한다. getRank

	// 5.결과를 출력한다 /printResult

	// 구조를 만들때부터 잘해야함 구조를 못잡으면 답도없음
	// 클래스 갯수 어떤걸 만들고 어떤걸 호출하고 이런것들
	// 클래스를 나누는기준은 롤
	// 하나의 기능을 가진것은 메소드

}
