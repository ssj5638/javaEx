package com.javaex.equals.v2;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;		
	}
	
	public int area() {
		return width * height;
	}
	

	@Override
	public boolean equals(Object obj) { // 업패스팅 되었음
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj; // 다운패스팅을 해주어야 함
			return area()==other.width * other.height;
		}
		return super.equals(obj);
	}
	
	
	
}
