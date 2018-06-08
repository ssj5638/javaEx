package com.javaex.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력하세요 : ");
		
		int dan = scan.nextInt();
		int i = 1;
		
		while(i < 9) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;			
		}		
		scan.close();
	}
}
