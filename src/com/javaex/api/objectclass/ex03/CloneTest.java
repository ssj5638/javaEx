package com.javaex.api.objectclass.ex03;

public class CloneTest { // 기본타입 얕은 복제

	public static void main(String[] args) {
		Point p = new Point (10, 20);
		
		System.out.println("p=" + p);
		
//		Point p2 = p; // 참조 주소로 값을 변경.
		
		Point p2 = p.getClone();
		System.out.println("p2=" + p2);
		
		p2.setX(30);
		p2.setY(100);
		
		System.out.println("p2=" + p2);
		System.out.println("p=" + p);

	}

}
