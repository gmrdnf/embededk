package javabasic.exoop1;

public class Pet {
	//이것들을 Object 라고 부름
//속성 Attribute
//기능	Function
//변수 Variable
//메소드 Method
	
	
	//에초에 전제자체가 잘못됌
	//이유 dog cat
//	String species;//종족 
//	String gender; //성별
//	String color;//색
//	int count;
	//이것들이 있지않아도 된다
		//pet 이름자체도 추상적임
	
	//is a 관계
	//새
// 닭	독수리 는 is a 관계 -상속
	//날개 몸통 부리 는 has a 관계 -위임
	//pc는 has a관계
	//이걸 구분할줄 알아야함
	//
	//has a 관계
	//그릴수있어 라고 물어봤을때 할수없으면 추상적인것이다
	
	//처음 할때부터 is a has a 인지를 파악해야함
	int count;//수
	
	//위로갈수록 추상적이고 아래로 갈수록 구체적이면 상속 is a 관계
	//만약 개가 갖고있는 이빨 눈 이런것들은 has a관계
//	Cat cat;
//	Dog dog;
	//cat과 dog가 있어야 pet을 만들수있다는 이야기를한거
	//cat과 dog가 없어도 pet은 만들수 있어야함
	
	public Pet() {
		
	}

	public Pet( Dog dog,Cat cat) {
		this.cat = cat;
		this.dog = dog;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = cat.count+dog.count;
	}
	
	
	
	
	
}
