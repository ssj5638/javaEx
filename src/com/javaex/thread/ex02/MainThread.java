package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
		// 쓰레드를 불러와 실행
		Thread thread = new DigitThread();
		
		// 쓰레드의 시작
		thread.start();
		
/*	AlphabetThread로 이동	
 		// 메인 쓰레드의 코드 만들기
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {	
					// 출력 속도 지연 시키기
					Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		Thread thread2 = new AlphabetThread();
		thread2.start();
		
		try {
			// thread와 thread2를 메인 스레드의 흐름에 합류
			// join을 입력하기 전에는 "메인 쓰레드 종료" 메시지가 먼저 출력된다 < MainThread2.java
			thread.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");

	}

}
