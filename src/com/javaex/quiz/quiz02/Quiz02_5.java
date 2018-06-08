package com.javaex.quiz.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		num1 = ++num1 + 1;
		num2 = num2++ +1;
				
		System.out.println((num1 == num2) ? "같음" : "다름");
		System.out.println("최종 num1의 값은? " + num1);
		System.out.println("최종 num2의 값은? " + num2);
		
	}

}
