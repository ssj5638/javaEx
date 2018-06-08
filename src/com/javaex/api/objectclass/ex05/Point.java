package com.javaex.api.objectclass.ex05;

public class Point implements Cloneable{
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
		
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
