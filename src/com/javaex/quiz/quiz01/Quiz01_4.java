package com.javaex.quiz.quiz01;

public class Quiz01_4 {
	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		byte b2 = (byte)i;		
		char ch2 = (char)b;
		short s = (short)ch; // 둘다 2바이트이지만, 
//		float f = (float)l;
		float f = l;
//		int i2 = (int)ch;
		int i2 = ch;
		
		System.out.println(b2);
		System.out.println(ch2);
		System.out.println(s);
		System.out.println(f);
		System.out.println(i2);
		
	}
}