package javabasic.exoop4;

import javabasic.exoop4.Student.Score;

public class StudentMain {
	public static void main(String[] args) {
		
//		Student.St1 re = new Student.St1();
//		re.Score("이진",20,30,40);
//		Student.St1 park = new Student.St1();
//		park.Score("박무진",30,50,70);
//		Student.St1 kim = new Student.St1();
//		kim.Score("김수혁",20,90,80);
		
//		Student hong = new Student("홍길동");
//		hong.score = hong.new Score(100,90,80,0,0.0f);
//		printScore(hong);
	
		makeStudent("홍길동",100,90,80);
		makeStudent("강감찬",60,90,50);
		makeStudent("이순신",90,40,50);
		
		//반복되면 안됌
		//중복코드에서 바뀌는값을 체크하고
		//그것을 파라미터로 받는 매소드를 생성하면됨
		//중복되면 수정해야할시 하나하나일일이 다수정해야함
		
		
		
	}//main
	
	public static void makeStudent(String name,int kor,int eng,int math) {
		Student student = new Student(name);
		student.score = student.new Score(kor,eng,math,0,0.0f);
		printScore(student);
	}
	
	public static void printScore(Student student) {
		System.out.println(
				student.name
				+"학생의 국어점수는 "+student.score.kor
				+", 영어점수는 " + student.score.eng
				+", 수학점수는 "+ student.score.math
				+", 총점은"+ student.score.getSum()
				+", 평균은"+ student.score.getAvg()
				);
		
	}
	
}
