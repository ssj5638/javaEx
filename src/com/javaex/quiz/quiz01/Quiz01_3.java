package com.javaex.quiz.quiz01;

public class Quiz01_3 {
	public static void main(String[] args) {
		System.out.println("1" + "3"); // ""은 문자열
		System.out.println(true + "Java"); // 문자열과 픞러스 연산하는 경우 문자열로 인식
		System.out.println('A' + 'B');  // 문자 A, B의 유니코드를 숫자값으로 인식
		System.out.println('1' + 2); // 문자 1의 유니코드를 숫자값으로 인식
		System.out.println('J' + "ava"); // 문자열과 픞러스 연산하는 경우 문자열로 인식
//		System.out.println(false + null); // null값은 값이 없는 것이므로 연산할 수 없음,  0와 null은 같지 않음
	}
}
