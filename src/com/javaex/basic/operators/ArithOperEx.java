package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		// 부호(단항)연산자 : +, -
		System.out.println(-a);
		System.out.println(-1*a);
		System.out.println("------------");
		
		// 사칙연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); //나머지
		System.out.println("------------");
		
		// 정수와 정수의 나눗셈은 정수
		System.out.println((float)a/(float)b);
		System.out.println((float)a / b);
		System.out.println("------------");		
		
		// 증감연산자 ++, --
		// ++a와 a++를 혼동하지 말자
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);	
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);
		System.out.println("------------");	
		
		// 나눗셈 보충
//		System.out.println(4 / 0); //ArithmeticException
		System.out.println(4.0 / 0);
		
		System.out.println(7 % 4);
		System.out.println(7.2 % 2.0); // 유의, 문제있는 연산
		
		// Infinity의 체크
		System.out.println(Double.isInfinite(4.0 / 0));
		// NaN
		System.out.println(Double.isNaN(4.0 / 0));
		

	}

}
