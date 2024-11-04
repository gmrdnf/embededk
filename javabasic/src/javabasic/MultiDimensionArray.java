package javabasic;

public class MultiDimensionArray {
	public static void main(String[] args) {
		
		//2차원 배열 선언과 초기화를 동시에
		//intArr의 length:3,인덱스 범위 :0~2
		//intArr[0]의 length : 3,인덱스범위 :0~2
		//3행 3열의 배열 자료구조
		int[][] intArr = new int[3][3];
		
		//2차원 배열 할당
		intArr[0][0] = 1;
		intArr[0][1] = 2;
		intArr[0][2] = 3;
		intArr[1][0] = 4;
		intArr[1][1] = 5;
		intArr[1][2] = 6;
		intArr[2][0] = 7;
		intArr[2][1] = 8;
		intArr[2][2] = 9;
		
		int intArrLength = intArr.length;//2차원 배열의 요소의 수
		int intArr0Length = intArr[0].length;//1차원 배열의 요소 수
		for(int i =0; i<intArrLength;i++) { //행의 수만큼 반복
			for(int j =0;j<intArr0Length;j++) { // 열의 수만큼 반복
				System.out.print(intArr[i][j]+""+"("+i+","+j+")"+" ");
			}
			System.out.println();
		}//i로쓰는이유는 인터레이션 순회라는 뜻이다
		
		//2차원 배열 선언, 초기화,할당을 동시에
		int[][]intArr2= {
				{1,2,3},	
				{4,5,6},
				{7,8,9}	
		};
		
		for(int[] iArr:intArr2) {
			for(int j:iArr) {
				System.out.println(j);
			}
		}
		
		String[][] strArr= {
				{"홍길동","감강찬","이순신"},
				{"서울","부산","제주"},
				{"학생","직장인","가수"}
		};
		
		for(String[] istr :strArr) {
			for(String str:istr) {
				System.out.println(str);
			}
		}
		//파이썬은 배열이없음
		//자바스크립트는 자바랑 다름
		//c는 자바의 배열과같지만 참조타입이없음
		
		
		
		
		
	}
}
