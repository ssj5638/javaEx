package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(5);
		point1.setY(5);
		point1.draw();
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		point2.draw();
		
//		System.out.printf("X1 = %d, Y1 = %d %n", point1.getX(), point1.getY());
//		System.out.printf("X2 = %d, Y2 = %d %n", point2.getX(), point2.getY());
	}

}
