package javabasic.oop;

import java.sql.Timestamp;

//역할:Robet 생성
public class RobotFactory {
//뭐뭐 팩토리로끝나는건 앞에있는걸 만드는거다
	
	
	//static member variable
	//클래스로딩 타임에 메모리ㅣ에 생성되고 타입의 기본값으로 자동 초기화 됨
	private static int count;//생산 수량//중요
	
	public Robot createRobet(String name, String company, Timestamp mfd, int weight) {
		count++;
		System.out.println(name+"로봇이 생성되었습니다");
		System.out.println("총 생산된 로봇의 수량은"+ count+"대 입니다");
		return new Robot(name,company,mfd,weight);
	}//생성하는 역할만 분리하기위해서
	
	public static int getCount() {
		return count;
	}
	
	
	
}
