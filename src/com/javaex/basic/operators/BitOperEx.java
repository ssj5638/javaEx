package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트 연산
		// 하드웨어 제어, 이미지 프로세싱
		// 미세한 단위의 데티어 제어에 사용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
//		byte result = b1 & b2; // bit 연산은 정수형으로 변환해서 이용하기 때문에 코드 오류
		int result = b1 & b2; // bit and 연산		
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; // bit or 연산	
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // bit xor 연산	
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not 연산	
		System.out.println(Integer.toBinaryString(result));
		
	}
}