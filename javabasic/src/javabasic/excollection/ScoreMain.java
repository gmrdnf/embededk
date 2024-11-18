package javabasic.excollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScoreMain {

	public static void main(String[] args) {
		//3명의 이름과 국어,영어,수학성적을 입력받아 아래와 같은 형식으로 출력
		//홍길동은 국어 100점 영어 90점 수학 80점 총점 270점
		//List로 만들면 Score나 Studnet 둘중 하나만 들어가는데
		//그걸 하위에서 합치고 다시 List로 넣을수 있나?
		//그럼 그냥 String 으로 받아도 되는건가
		//Map으로 받는다면 순서가 섞일것인데 괜찮은건가?
		//하지만 List는 값이 중복이 안돼는데 상관이없나
			
		//Student 와 Score의 관계를 생각해보자
		//(Student는 이름과 Score를 갖는다)
		//List,Set,Map,어떤 것을 사용할 것인가
		//(Student의 List를 만들어보면 어떨까)
		//입력된 한줄의 문자열을 어덯게 분리할 것인가
		//(StringTokenizer를 이용해 보자)
		//출력을 편하게 할 수 잇는 방법은 무엇일까
		//toString을 오버라이딩해서 사용해 보자
		
		System.out.println("3명의 이름과 국어,영어,수학 성적을 입력하세요!");
		System.out.println("입력형식 : 이름,국어성적,영어성적,수학성적");
		
		Scanner scanner = new Scanner(System.in);
		
		List<Student> studentList = new ArrayList<Student>();
		
		StringTokenizer st;
		
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(scanner.next());
			studentList.add(new Student(
					st.nextToken(","),
					new Score(
							Integer.parseInt(st.nextToken(",")),
							Integer.parseInt(st.nextToken(",")),
							Integer.parseInt(st.nextToken(","))
					)
			));
		}
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		scanner.close();             
		
	}//main
	
}//class
