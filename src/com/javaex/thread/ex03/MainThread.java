package com.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		// 쓰레드를 불러와 실행
		Thread thread = new Thread (new DigitThread());
		Thread thread2 = new Thread (new AlphabetThread());
		
		// 쓰레드 간의 경쟁상황 발생시 우선순위 지정 10~1
		thread.setPriority(Thread.MAX_PRIORITY);	// 10 쓰레드에 상수로 지정되어 있음
		thread2.setPriority(Thread.MIN_PRIORITY);	// 1
		
		// 쓰레드의 시작
		thread.start();
		thread2.start();
		
		try {
			// thread와 thread2를 메인 스레드의 흐름에 합류
			thread.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");

	}

}
