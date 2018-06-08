package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	private String color;
	
	// 생성자
	public ColorPoint() {
		super(); // 따로 명시하지 않으면 부모 생성자를 호출한다. super(); 와 같음
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	// getter/setter
	public String getColor() {
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
//	@Override
	public void draw() {
//		System.out.printf("색깔점 [Color = %s, x = %d, y = %d]을 그렸습니다.\n", color, getX(), getY()); // private 의 경우  getter메소드를 이용하여 값을 받아옴
		System.out.printf("색깔점 [Color = %s, x = %d, y = %d]을 그렸습니다.\n", color, x, y); // protected 의 경우 x, y로 사용 가능
	}
}
