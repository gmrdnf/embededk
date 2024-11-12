package javabasic.exapi1;

public class Person extends Object{

	String name ;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+ " "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Person)obj).name)&&
				age==((Person)obj).age;
	}
	//아직 개념정리가 안됌//작성도못함	
	
//	public void person1(String name,String age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public void person2(String name,String age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public void equals1(Person ps1,Person ps2) {
//		ps1.equals(ps2);
//	}//이렇게 하면 안됌
//	//돌아가긴하는데 변수명이 저거일줄 어떻게알고 쓰게
//
//	
//	@Override
//	public String toString() {
//		return "이름은"+name+"나이는"+age;
//	}

}
