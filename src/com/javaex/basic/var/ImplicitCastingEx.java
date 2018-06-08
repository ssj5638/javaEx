package com.javaex.basic.var;

// 암시적 형변환 예제
public class ImplicitCastingEx {
	public static void main (String[] args){
		byte b = 25; // 1바이트 정수형
		System.out.println(b);
		
		short s = b; // 2바이트 정수형
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		float f = i;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		char ch = 'A';
//		short s2 = ch; // 2바이트 정수형과 2바이트 문자형 변환은 불가
		
	}
}
