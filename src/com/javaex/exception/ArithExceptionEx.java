package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
		// 스테너로부터 정수 입력
		// 100을 정수로 나눈다
		double result =0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
//		// 오류 발생 가능 영역		
//		num = scanner.nextInt();
//		result = 100 / num;
//		// 오류 발생 가능 영역
		
		try {
			num = scanner.nextInt();
			result = 100 / num;
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해주세요.");
		} catch (ArithmeticException e){
			System.out.println("0으로는 나눌 수 없습니다."); // 이 곳에서 처리가 되어 더이상 try하지 않음
			
		} catch(Exception e) {		// Exception e의 경우 가장 마지막에 둔다. 처리할 곳이 없을때 실행
			e.printStackTrace();	// java.lang.ArithmeticException 출력
		} finally {	// 무조건 실행
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();
		

	}

}
