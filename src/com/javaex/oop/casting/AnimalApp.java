package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) { // 실행할 수 있는 코드
		
		Animal dog1 = new Dog("Snoopy");	// 업캐스팅 	 dog1은 Animal	
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 업캐스팅 된 상태이므로 Dog 클래스의 메소드 사용불가
		
		Dog dog2 = new Dog("Doogy");	// 단순 상속
		dog2.eat();
		dog2.walk();
		dog2.bark(); // 단순 상속 상태로 사용 가능
		
		// 다운캐스팅 : 명시적으로 타입을 지정
		((Dog)dog1).bark(); // Dog로 다운 캐스팅하였기 때문에 Dog의 메소드를 사용 가능
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
	
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		} else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
	}

}
