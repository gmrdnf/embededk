package javabasic.exoop1;

public class PetMain {

	public static void main(String[] args) {

//		String species;
//		String gender; //성별
//		String color;//색
//		int count;
		Dog dog = new Dog();
		dog.species ="개";
		dog.gender ="남자";
		dog.color = "갈색";
		dog.count = 5;
		
		Cat cat = new Cat();
		cat.species ="고양이";
		cat.gender ="여자";
		cat.color = "검은색";
		cat.count = 7;
		
		Pet pet = new Pet(dog,cat);
		
		pet.setCount();
		
	}//main

}//class
