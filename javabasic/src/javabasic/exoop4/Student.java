package javabasic.exoop4;

public class Student {
	//학생3명의 이름,국어점수,영어점수,수학점수,총점,평균 출력
//	String name = null;
//	int kr = 0;
//	int eg = 0;
//	int math = 0;
//
//	//배열안쓰기
//	static class St1 {//항상 클래스명은 대문자로
//		void Score(String name, int kr, int eg, int math) {
//			int total = kr + eg + math;
//			int result = total/3;
//			System.out.println("학생의 이름은 " + name + ",국어점수는 " + kr 
//										+ ",영어점수는 " + eg + ",수학점수는 " + math + ",총점은 " + total
//										+ ",평균은 " + result + "입니다");
//		}
//	}
	String name;
	Score score;
	
	public Student(String name,Score score) {
		this.name =name;
		this.score =score;
	}
	
	class Score{
		int kor;
		int eng;
		int math;
		int sum;
		float avg;//float는 소수점 나오게하려고
		
		public Score(int kor,int eng,int math,int sum,float avg) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.sum = sum;
			this.avg = avg;
		}
		
		public int getSum() {
			return kor+eng+math;
		}
		
		public float getAvg() {
			return getSum()/3;
		}
	}
		
		
		
	
	
//has a 관계
}
