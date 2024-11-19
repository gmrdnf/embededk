package javabasic.excollection;

public class Card {
	// 숫자와 무늬를 가지고있음 카드는
	// 2부터 A까지 JQK ( 11,12,13)
	// number
	// shape
	private Integer num;//숫자(A~10,J,Q,K)1~13
	private String shape;//무늬(스페이드,다이아,하트,클로버

	public Card() {
	};

	public Card(Integer num, String shape) {
		super();
		this.num = num;
		this.shape = shape;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return shape+num;
	}
	
}
