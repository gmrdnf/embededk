package javabasic.exexception;

public class ExceptionTest3 {
	public static void main(String[] args) {

	//홍길동/산적,강감찬/장군,이순신/장군,임꺽정/산적,권율/장군
	//의 이름과 직업을 가진 5명의 Person을 생성합니다
	//직업이 산적 인 Person이 생성되면 "좋은 직업을 선택하세요"라는 메세지를 출력하는 
	//JobException
		
	makePerson("홍길동", "산적");
	makePerson("강감찬", "장군");
	makePerson("이순신", "장군");
	makePerson("임꺽정", "산적");
	makePerson("권율", "장군");
	
									
	
		
		
		
	

	
	
	}//main

	private static void makePerson(String name,String job) {
		//생성된 Person객체의 직업이 산적이면
		if(new Person(name,job).getJob().equals("산적")) {
			try {
				//JobException을 발생시킴
			throw new JobException();
			//JobException을 처리함
			}catch (JobException je) {
				System.out.println(name+ "님 "+je);
			}
		}
	}
	
	
	
}//class
