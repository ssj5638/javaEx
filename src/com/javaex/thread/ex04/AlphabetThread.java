package com.javaex.thread.ex04;

public class AlphabetThread implements Runnable {

	@Override
	public void run() {
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {	
					// 출력 속도 지연 시키기
					Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
