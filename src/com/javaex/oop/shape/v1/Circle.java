package com.javaex.oop.shape.v1;

public class Circle extends Shape {

	protected double radius;
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("원 [ x=%d, y=%d, r=%f, area=%f]을 그렸습니다.", x, y, radius, area());
	}

	@Override
	public double area() {
		double area = Math.PI*Math.pow(radius, 2); // pow 제곱		
		return area;
	}
	
	
	
}
