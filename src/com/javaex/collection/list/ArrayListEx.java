package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
//		List<String> l = new ArrayList<>();
		List<String> l = new LinkedList<>(); // 바꿔도 무방함
		
		// 객체 추가
		l.add("java");
		l.add("C");
		l.add("C++");
		l.add("Python");
		
		// 객체의 삽입
		l.add(2, "C#");
		
		// List는 중복 허용
		l.add("java");
		System.out.println(l);
		System.out.println(" 총 객체 수 : " + l.size());
		
		// 객체의 삭제
		l.remove(2);
		l.remove("Python");
		System.out.println(l);
		
		// Iterator의 이용
		System.out.println("=======Iterator=======");
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		// 비우기
		l.clear();
		System.out.println(l);
		
	}

}
