package javabasic.collection;

public class Person {

	String name;
	String age;
	
	public Person() {
		
	}
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"은 "+age+"살";
	}
		
}
