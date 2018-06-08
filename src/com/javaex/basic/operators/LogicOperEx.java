package com.javaex.basic.operators;

public class LogicOperEx {
	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		
		// 비교 연산자 : >, >=, <, <=, ==, !=
		System.out.println(7 > 3);
		System.out.println(7 == 3);
		System.out.println(7!= 3);
		
		// 논리 연산자 : AND(&&), OR(||), NOT(!)
		System.out.println((n1 > n2) && (n1 < n2));
		System.out.println((n1 > n2) || (n1 < n2));
		System.out.println(!((n1 > n2) && (n1 < n2)));
		System.out.println(!((n1 > n2) || (n1 < n2)));
		
	}
}
