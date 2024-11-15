package javabasic.exexception;

public class Person {
	// 홍길동/산적,강감찬/장군,이순신/장군,임꺽정/산적,권율/장군

	private String naem;
	private String job;

	public Person() {
	}
	
	public Person(String naem, String job) {
		super();
		this.naem = naem;
		this.job = job;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
