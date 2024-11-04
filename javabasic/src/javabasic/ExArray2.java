package javabasic;

public class ExArray2 {
	public static void main(String[] args) {
		//학생 3명의 이름과 학점(A~F)을 배열에 저장하고 학생명과
		//학점을 출력하는 프로그램
		String[][] str = {
			{"최다애","A","B"},
			{"육성훈","B","C"},
			{"이은서","E","F"}
		};
		
		for(String[] istr :str) {
			for(String str1:istr) {
				System.out.println(str1);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
