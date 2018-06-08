package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		
		// 객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs);
		System.out.println("hs size = " + hs.size());
		
		// 지정한 객체를 포함하고 있는가? : Contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
	
		// 객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
		hs.remove("C++"); // 에러가 따로 발생하지 않는다
		
	}

}
