package com.javaex.thread.ex02;

public class MainThread2 {

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
		
		System.out.println("메인 쓰레드 종료");

	}

}
