package com.javaex.basic.console;
import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
//		java.util.Scanner scanner; // import 작성없이 이런 형태도 사용 가능
		
		Scanner scanner = new Scanner(System.in); // scanner 메모리 할당
		
		System.out.print("나이는 ? ");
		int age = scanner.nextInt();
		
		String name = scanner.next();
		
		System.out.println("Welcom, " + name);
		System.out.println("age : " + age);
		
		scanner.close(); // 닫아줄 것!
		
	}

}