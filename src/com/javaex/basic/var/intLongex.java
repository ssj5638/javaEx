package com.javaex.basic.var;

public class intLongex {
	public static void main(String[] args) {
		
		// int 변수의 선언
		int intVar1;
		int intVar2;
		
		intVar1 = 2018;
//		intVar2 = 1234567890123; //Out of range
		
		System.out.println(intVar1);
		
		// long 변수의 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2018;
//		longVar2 = 1234567890123; // long형 변수임을 알리는 l을 입력해야 한다.
		longVar2 = 1234567890123L;

		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 데이터 처리 : 2진수, 8진수, 16진수 
		int bin;
		int oct;
		int hex;
		
		bin = 0b1100; // 2진수 표현 : 0b
		oct = 072; // 8진수 표현 : 0
		hex = 0xFF; // 16진수 표현 : 0x
		
		System.out.println(bin+", "+oct+", "+hex);
	}
}
