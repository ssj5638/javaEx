package com.javaex.basic.console;

public class ConsoleOuputEx {

	public static void main(String[] args) {
		// System.out.print		: 개행 안 함
		// System.out.println	: 개행 함
		// System.out.printf	: 포맷(?)
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2); // ★모든 객체(Object)에는 문자열을 출력하는 메소드(toString())가 있다
		
		System.out.println("Hello\nJava"); // 강제 개행
		System.out.println("Hello\tJava"); // 탭 문자
		System.out.println("Hello, \"Java\""); // 큰따옴표
		System.out.println("\\ 역슬래시"); // 역슬래시
		
		String dir = "D:\\javastudy\\eclipse"; // 역슬레시의 표현은 디렉토리 표현시 사용할 수 있다.
		
		System.out.println(dir);

	}

}
