package com.javaex.oop.point.v4;

public class PointApp {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		point1.setX(5);
//		point1.setY(5);
		Point point1 = new Point(5,5);
		point1.draw();
		
//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);
		Point point2 = new Point(10,23);
		point2.draw();
		
		point2.draw(true);
		point2.draw(false);
		
//		System.out.printf("X1 = %d, Y1 = %d %n", point1.getX(), point1.getY());
//		System.out.printf("X2 = %d, Y2 = %d %n", point2.getX(), point2.getY());
		
		ColorPoint cp = new ColorPoint("Red");
		cp.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
		
		
	}

}
