package javabasic.collection;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo2 {
	public static void main(String[] args) {
		//Person객체 3개를 생성하여 3명의 이름과 나이를 출력(ArryList 사용) 
		
		List<Person> personList = new ArrayList<Person>();	

		personList.add(new Person("홍길동","20"));
		personList.add(new Person("강감찬","30"));
		personList.add(new Person("이순신","40"));
		
		for(Person person:personList) {
			System.out.println(person);
		}
		
		
	}//main
}//class
