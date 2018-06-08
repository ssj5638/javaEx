package com.javaex.api.generic.ex1;

public class Boxapp {

	public static void main(String[] args) {

		// Box 하나 만들고 int 값을 설정
		Box intBox = new Box();
		intBox.setContent(123);
		// 값을 꺼내와 봅시다.
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		// Box 하나 만들고 String 값을 설정
		Box strBox = new Box();
		strBox.setContent("Java");
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		// 만약 캐스팅을 잘못했다면?
		strVal = (String)intBox.getContent(); // 컴파일 타임에서 에러 확인 불가

	}

}
