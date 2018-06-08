package com.javaex.basic.var;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar = 3.14159F; // float형 변수임을 알리는 f을 입력해야 한다.
		double doubleVar = 3.14159;
		
		// 정밀도 체크
		doubleVar = 0.1234567890123456789;
		floatVar = 0.1234567890123456789f;

		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);	
		// 결과값을 보면 소수점 이하의 값이 소실 되었음을 확인 할 수 있음
		
		// e(지수값) 사용한 표현 
		int intVar = 3000000;
		doubleVar = 3E6; // 10의 6제곱
		floatVar = 3E6F; // 10의 6제곱

		System.out.println("intVar : " + intVar);
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);	
		
		// 부동소수점 계산의 유의점
		System.out.println(0.1 * 3);
	}

}
