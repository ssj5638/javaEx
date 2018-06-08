package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s = new Shape();	// 안 됨
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();

	}

}
