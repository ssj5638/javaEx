package com.javaex.api.objectclass.ex02;

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

	@Override // 참조변수의 결과가 같은지 equals()메서드로 확인 불가하여 생성한 코드
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point)obj;
			return x==other.x && y==other.y;
		}
		return false;
	} // 마우스 오른쪽 > source"Alt+Shift+s" > Override 
	
}
