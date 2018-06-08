package com.javaex.api.generic.ex3;

public class Boxapp { // 확장 가능형 클래스의 경우 안정성이 좋음

	public static void main(String[] args) {

		// Box 하나 만들고 int 값을 설정
		Box<String, Integer> intBox = new Box<>();
		intBox.setKey("Integer");
//		intBox.setKey(123);
		intBox.setContent(123);
//		intBox.setContent("Java"); // 컴파일시 체크 (안정성)
		
		// 값을 꺼내와 봅시다.
		int retVal = intBox.getContent(); // 캐스팅에 대한 번거로움 없음 (불필요)
		System.out.println(intBox.getKey());
		System.out.println(retVal);
		
		// Box 하나 만들고 String 값을 설정
		Box<String, String> strBox = new Box();
		strBox.setKey("String");
		strBox.setContent("Java");
		
		String strVal = strBox.getContent(); // 캐스팅에 대한 번거로움 없음 (불필요)
		System.out.println(strBox.getKey());
		System.out.println(strVal);
		 
		
		// 만약 캐스팅을 잘못했다면?
//		strVal = intBox.getContent(); // 버전 1과 다르게 컴파일 타임에서 확인 가능 : 안정성 확보

	}

}
