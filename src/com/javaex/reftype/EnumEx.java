package com.javaex.reftype;

public class EnumEx {

	public static void main(String[] args) {

		Week today = Week.THURSDAY;
		
		System.out.printf("Today is %s(%d)%n", 
				today.name(), 
				today.ordinal());
		
		// 문자열을 가지고 열거 객체 반환
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name() + " " + obj.ordinal());
		// obj.ordinal() obj에 입력된 값의 순서번호

	}

}
