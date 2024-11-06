package javabasic.oop.inheritance;

public class PersonMain {
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20);
		Person kang = new Person("강감찬", 30);
		
		System.out.println(hong.equals(kang));//false
		
		Person person1 = new Person("사람", 20);
		Person person2 = new Person("사람", 20);
		
		System.out.println(person1.equals(person2));//false
		//메모리가 다른곳에 있다//참조값이 달라서 이퀄스를 따로 오버라이딩한것 
		//그래서 입맛에 맞게? 오버라이딩을한후에는 true가 나옴
		//쓰는방식을 재정의해서 내방식대로 바꾼것?
	}//main
	
}//class
