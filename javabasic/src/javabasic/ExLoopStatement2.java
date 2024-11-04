package javabasic;

public class ExLoopStatement2 {
	public static void main(String[] args) {

		// 1
		// i: 0 , j:0
		// i: 1 , j:0 1
		// i: 2 , j:0 1 2
		// i: 3 , j:0 1 2 3
		// i: 4 , j:0 1 2 3 4
//	

		
		
		//중간이 비어있는공백은 if문을 사용해야함
		
		
		
		
		
	
	//Extra 실습
	//별찍기
	//배열 미사용 버전
	//배열 사용 버전
	//3이상의 홀수를 입력하면 최대 별의 개수가 입력한 별의 개수가 되는 다이아몬드 별찍기
//	   *
//	 ***
//	*****
//	 ***
//	  *
//	i줄		j별		k공백
//	0		1			2
//	1		3			1
//	2		5			0
//	3		3			1
//	4		1			2
		
	for (int i = 0; i < 5; i++) {//줄의수
		for (int j = 2; j < i; j--) {//공백의수
				if (j==2) {
					System.out.print("oo");
					System.out.println();
				}else if(j==1) {
					System.out.print("o");
					System.out.println();
				}else if(j==0) {
				for (int j2 = 0; j2 < args.length; j2++) {
					
				}
				}
		}
		for (int k = 2; k == -1; k--) {//별의 수
			
		}
	}
//	System.out.print("*");
	
	
	
	
	
	
	
	
	
	}// main
}// class
