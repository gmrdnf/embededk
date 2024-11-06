package javabasic.oop.exinheritance;

public class Machine {
	String company;//제조회사
	int price;//가격
	//질문을 재기한다
	//머신에들어가고 피시나 전자레인지 세탁기에 들어가는 것은?
	//ex) 제조회사 가격등
	String result;
	
	public Machine() {		
	}
//켰다 껐다를 만들고싶은데
	//boolean으로 만들려했는데
	//받을때 String으로 받아서 true 나 false로 바꾸려했는데 그게 되나?
	//가능은할꺼같음 하지만 위에처럼은 안됌
	//String true를(대소문자 상관없이) 쓰면 true로 그게 아니면 다 false로
	//그럼 on 을입력하면true off입력하면 false로 바꿔주고 다시 검사하고 
	//String 으로 바꿔서 켜졌는지 꺼졌는지 알려주기
	
	//그럼 입력은 String으로 받아서 on&off확인하고 
	//on일때 true off일때 false
	//근데 잠깐 굳이 boolean으로 바꿔야하나?
	//걍 String입력받아서 on이면 전원을 켭니다 off면 전원을 끕니다 하면 되는거아님?
	//아둔한놈 자꾸 뭐하나씩 바꾸려하니 헷갈리지
	
	public Machine(String reulst) {
		this.result=reulst;
	}
	
	void turnOn() {//메소드
		System.out.println("전원을 켠다");
	}
	
	void turnOff() {
		System.out.println("전원을 끄다");
	}
	
	
}
