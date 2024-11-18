package javabasic.excollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Fruits2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	//5개의 과일명을 입력받아 중복되지 않은 과일명들을 순서대로 출력
	Set<String> fruitList = new HashSet<String>();
	System.out.println("5개의 과일을 입력하시오");
	
	for (int i = 0; i < 5; i++) {
		fruitList.add(sc.next());
	}
	
	Iterator<String> it =  fruitList.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	
	
	
	
	}//main
	
}//class
