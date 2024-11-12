package javabasic.api;

public class Person implements Cloneable{
	//임포트하고
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}//오버라이딩
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	@Override
	public String toString() {
		return this.name + " "+ this.age;
	}
}
