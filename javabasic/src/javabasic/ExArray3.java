package javabasic;

import java.util.Iterator;

public class ExArray3 {
	public static void main(String[] args) {
		//아래 데이터를 배열에 저장하고 총점이 200점이상인 학생들의 학생명과 총점을 출력하는 프로그램
		//홍길동:국어90점,영어80점,수학70점
		//강감찬:국어80,영어70점,수학60점
		//이순신:국어60점,영어50점,수학40점
		
		//이름을 담을 스트링 점수를 담을 인트 200점인거 구해야함
//		String[] name = {"홍길동","강감찬","이순신"};
		
//		int[][] point = {
//				{90,80,70}	,
//				{80,70,60},
//				{60,50,40}
//		};
//		
//		
//		for (int i = 0; i < 1; i++) {
//			if (point[0][0]+point[0][1]+point[0][2]>=200) {
//				System.out.print(name[0]+":"+"국어"+point[0][i]+"점,"+
//					"영어"+point[0][i]+"점,"+"수학"+point[0][i]+"점");
//				System.out.println();
//			}
//		}
//		for (int i = 0; i < 1; i++) {
//			if (point[1][0]+point[1][1]+point[1][2]>=200) {
//				System.out.print(name[1]+":"+"국어"+point[1][i]+"점,"+
//					"영어"+point[1][i]+"점,"+"수학"+point[1][i]+"점");
//				System.out.println();
//			}
//		}
//		for (int i = 0; i < 1; i++) {
//			if (point[2][0]+point[2][1]+point[2][2]>=200) {
//				System.out.print(name[2]+":"+"국어"+point[2][i]+"점,"+
//					"영어"+point[2][i]+"점,"+"수학"+point[2][i]+"점");
//			}
//		/문제자체를 틀림 에초에 총점출력이였음
		
		String[][] name = {
				{"홍길동","90","80","70"},
				{"강감찬","80","70","60"},
				{"이순신","60","50","40"}
		};
		
		int[] point = {0,0,0};
		
		//총점 저장용 1차원 배열
		int result = 0;
		//각배열의 크기
		int nameLength = name.length;//3
		int name0Length = name[0].length;//4
		int totalLength = point.length;//3
		
		//총점
		for (int i = 0; i < nameLength; i++) {
			for (int j = 0; j < name0Length; j++) {
				if(j>0) {
					point[i]+= Integer.parseInt(name[i][j]);
				}
			}
		}
		//출력하기
		for (int i = 0; i < totalLength; i++) {
			if(point[i]>=200) {
				System.out.println(name[i][0]
						+"학생의 총점은"+point[i]+"입니다");
			}
		}
		
		
		
		
		
		
//		for (int i = 0; i < point.length; i++) {
//			for(int j =0; j<point.length;j++) {
//			}
//		System.out.println(result);
//		}
		
//			point [0]=Integer.parseInt(name[0][1]);
//			point [1]=Integer.parseInt(name[0][2]);
//			point [2]=Integer.parseInt(name[0][3]);
//			result += point[0]+point[1]+point[2];
//			System.out.println(result);
//		if(result>=200) {
		
//		for(String[] name1:name) {
//				
//			for(String name2:name1) {
//				if(>=200) {
//				System.out.print(name2);
//				}
//			}
//			System.out.println();
//		}
//		}
//		모순
//			이유: for문 두번쓰면 걍 출력됨
		
		
		
		
		
		
	}//mian
}
