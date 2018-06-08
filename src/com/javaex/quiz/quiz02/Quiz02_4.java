package com.javaex.quiz.quiz02;

public class Quiz02_4 {
	public static void main(String[] args) {
		
		char ch = 'A';
		
		// 'A'가 65, 'a'가 97
		char conv = (char)(ch + 32);
		// char값과 숫자를 합할 경우 int 형으로 변환 됨
		
		System.out.println(conv);
		System.out.println((char)(ch + 32));
		
	}
}
