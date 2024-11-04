package javabasic;

import java.util.Iterator;
import java.util.Scanner;

public class ExArray4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//학생 3명의 이름, 국어, 영어,수학 점수를 키보드로 입력받아 총점과 평균을 산출하여
		//학생명,국어점수,영어점수,수학점수,총점,평균을 출력하는 프로그램
			
			//최다애,70,80,60
			//육성훈,70,90,70
			//이은서,90,60,100
			
			String[][] set = new String[3][4];
			int[] result = new int[3];
			int setLength = set.length;//
			int set0Length = set[0].length;//4
			
			for (int i = 0; i < setLength; i++) {
				System.out.println("이름을 입력하시오");
				set[i][0] = sc.next();
				System.out.println("국어점수를 입력하시오");
				set[i][1] = sc.next();
				System.out.println("영어점수를 입력하시오");
				set[i][2] = sc.next();
				System.out.println("수학점수를 입력하시오");
				set[i][3] = sc.next();
				result[i] =  Integer.parseInt(set[i][1])+Integer.parseInt(set[i][2])+Integer.parseInt(set[i][3]);
			}
			
			for (int i = 0; i < setLength; i++) {
				System.out.println("학생명: "+set[i][0]+" 국어점수: "+set[i][1]+" 영어점수: "+set[i][2]+" 수학점수: "+set[i][3]
						+" 총점: "+result[i]+" 평균: "+result[i]/3+" 입니다.");
			}
			//복잡하면 많이 나누기
//				System.out.println(result);
//				System.out.println(result/3);
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
