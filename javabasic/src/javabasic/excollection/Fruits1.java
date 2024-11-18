package javabasic.excollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fruits1 {
	public static void main(String[] args) {
		//5개의 과일명을 입력받아 입력받은 과일명들을 순서대로 출력
		Scanner sc=new Scanner(System.in);
		List<String> fruitList = new ArrayList<String>();	
		System.out.println("5개의 과일은 입력하시오");
		
		for (int i = 0; i < 5; i++) {
			fruitList.add(sc.next());
		}
		
		Iterator<String> it =  fruitList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
////		fruitList.add(sc.nextLine());
//		
//		
//		
//		
//		System.out.println(fruitList);
		
		sc.close();
		
	}//main
}//class
