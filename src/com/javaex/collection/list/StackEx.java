package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// 스택 선언
		Stack<Integer> stack = new Stack<>();
		
		// 값을 10개 push
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		// pop : 출력 위치 확인
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// peek
		System.out.println(stack.peek());
		System.out.println(stack);
		/*
		while(true) {
			System.out.println(stack.pop());
		
		}*/
		while(!stack.empty()) { // 스택이 비어있지 않았을 때에만 loop
			System.out.println(stack.pop());
		
		}
		
		
	}

}