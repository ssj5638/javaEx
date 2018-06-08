package com.javaex.oop.casting;

public class Animal { // 부모 클래스
	
	protected String name; // 상속 관계가 가능하도록 접근자 설정
	
	// 생성자가 하나 있는 경우 기본 생성자는 없는 상태임
	
	public Animal(String name) { // name을 사용할 수 있는 생성자 
		this.name = name;
	}
	
	public void eat() { // 메소드
		System.out.println(name + " is eating.");
		
	}
	
	public void walk() { // 메소드
		System.out.println(name + " is walking");
	}
	
}
