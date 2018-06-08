package com.javaex.exception;

import java.io.IOException;  // 컴파일러가 꼭 체크를 해야하는 패키지

public class ThrowsExcept {
	public void executeException() throws IOException {
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");
		
	}

	public void executeRuntimeException() {
		System.out.println("런타임 오류");
		throw new RuntimeException("Runtime Exception");
	}
	public double divide (int x, int y) {
		if (y == 0) {
			throw new ArithmeticException(); // 바깥쪽에서 처리할 수 있도록 하는 코드
		}
		return x/y;
	}	
}	
