package com.javaex.equals;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;		
	}
	
	public int area(int width, int height) {
		return width * height;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return area(width, height) == other.width * other.height;
		}
		return super.equals(obj);
	}
	
	
}
