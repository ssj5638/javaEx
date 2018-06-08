package com.javaex.api.objectclass.ex01;

public class Point {
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { // 포인트 주소를 보기 쉽도록 오버라이드함
		return "Point( " + x + ", " + y + " )";
	}
}
