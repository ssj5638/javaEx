package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>(); // Queue의 경우 인터페이스이기 때문에 실체화 할 수 없어, LinkedList를 사용하나 LinkedList의 함수를 사용해서는 안 됨
		
		// 데이터 제공
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		
		// poll
		System.out.println(queue.poll());
		System.out.println(queue);
		
		// peek
		System.out.println(queue.peek());
		System.out.println(queue);
		
		// poll의 경우 empty 체크
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
