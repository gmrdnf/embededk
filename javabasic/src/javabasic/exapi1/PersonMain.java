package javabasic.exapi1;

public class PersonMain extends Person{
	
	public static void main(String[] args) {
		
		Person per1 =new Person("홍길동", 20);
		Person per2 =new Person("홍길동", 20);
		
		System.out.println(per1);
		System.out.println(per2);
		
		System.out.println(per1.equals(per2));
		
		
//		Person ps1 = new Person();
//		ps1.person1("이리", "24");
//		Person ps2 = new Person();
//		ps2.person2("시리", "27");
		
		
//		System.out.println(ps1.equals(ps2));
//		System.out.println(ps1);
		
	}//main
	
}//class
