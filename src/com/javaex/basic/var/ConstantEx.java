package com.javaex.basic.var;

public class ConstantEx {
	
	static final double PI = 3.14159; // static이 없으면 main 메소드에서 사용 불가
	static final int SPEED_LIMIT = 110;
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		// 상수 변경 시도
//		SPEED_LIMIT =120;
		//final이어서 변경 불가
	}
}
