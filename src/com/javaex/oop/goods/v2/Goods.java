package com.javaex.oop.goods.v2;

public class Goods {
	// 필드 선언
	private String name;
	private int price;
	
	// 외부 접근을 위한 getter, setter 
	
	// Getters 읽기만 가능하도록 허용
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	// Setter 쓰기만 가능하도록 허용
	public void setName(String name) {
		this.name = name; // this. << 현재의 클래스를 가리킴		
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + name);
		System.out.println("가격 : " + price);
	}
}
