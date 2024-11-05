package javabasic.oop;

import java.sql.Date;
import java.sql.Timestamp;

public class RobotMain {

	public static void main(String[] args) {

		//Robot을 생성할 수 있는 RobotFactory 생성
		RobotFactory robotFactory = new RobotFactory();
		
		//RobotFactory를 통해서 Robot을 생성
		//System.currentTimeMillis(): UNIX타임(전산학 원년시간,1970년 1월1일0시0분0초0밀리초부터 현재까지
		//밀리초마다 1씩 센 값을 반환
		System.out.println(System.currentTimeMillis());
		Date date =new Date(System.currentTimeMillis());
		System.out.println(date);
		RobotFactory.getCount();
//		System.out.println(RobotFactory.getCount());
		

		createRobot(robotFactory,"태권브이","태권브이주식회사",new Timestamp(System.currentTimeMillis()),100);
		createRobot(robotFactory,"건담","건담주식회사" ,new Timestamp(System.currentTimeMillis()), 150);
		createRobot(robotFactory,"또봇","또봇주식회사" ,new Timestamp(System.currentTimeMillis()), 50);
		//부과작업을하기위해서 팩토리만듦
		
		
		
	}//main

	private static void createRobot(RobotFactory robotFactory,
			String name,String company, Timestamp mfd,int weight) {
		robotFactory.createRobet(name,company,mfd,weight);
	}
	
	
	
}
