package com.javaex.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		
		// %s, %d, %n
		
		String fruit = "Apple";
		int total = 10;
		int eat = 3;
		// format 하지 않음
		System.out.println(total + "개의 " + fruit + " 중에 " + eat + "개를 먹었다.");
		// format 사용
		System.out.printf("%d개의 %s 중에 %s개를 먹었다.%n", total, fruit, eat);
		
		// %f
		float pi = 3.14159f;
		System.out.printf("파이 값은 %f 입니다. %n", pi);
		System.out.printf("파이 값은 %.3f 입니다.", pi);
		
		String str = String.format("%d개의 %s 중에 %s개를 먹었다.%n", total, fruit, eat);
		System.out.println(str);
	}

}
