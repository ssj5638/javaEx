package com.javaex.thread.ex03;

public class DigitThread implements Runnable {

	@Override
	public void run() {

		// 새 쓰레드의 실행 흐름
		for (int i = 0; i <= 30; i++) {
			System.out.println("DigitThread: "+ i);
			
			// 쓰레드 지연
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
//		super.run(); // 상속받은것이 아니므로 삭제!
	}
	
	
}
