package com.javaex.quiz.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
//		boolean result;		
//		result = a % 2 == 0 ? true : false;		
//		System.out.println("a는 짝수입니까 ? " + result);
		System.out.println(a % 2 == 0);

		
//		result = b % 3 == 0 ? true : false;
//		System.out.println("b는 3의 배수입니까? " + result);
		System.out.println(b % 3 == 0);
		
//		boolean b1, b2, r1;
//		b1 = a % 2 == 0 ? true : false;
//		b2 = b % 2 == 0 ? true : false;	
//		r1 = b1 && b2;
		

		boolean r1 = a % 2 == 0 && b % 3 == 0;	
		System.out.println(r1);
		
//		r2 = c << 4;
//		System.out.println((r2));
		char r2 = (char)(c+4);// char값과 숫자를 합할 경우 int 형으로 변환 됨
		System.out.println(r2);
	}

}
