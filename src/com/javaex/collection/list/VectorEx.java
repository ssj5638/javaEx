package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		// 벡터의 선언 (Array 참조)
		Vector<Integer> v = new Vector<>();
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// 1부터 10까지의 값을 담아봅시다.
		for (int i = 1; i<= 10; i++) {
			// 값을 넣어봅시다.
			v.addElement(i);
			// v.addElement(Integer.valueOf(10)); 와 같다.
		}

		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// 허용량 초과
		v.addElement(11);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		// 자동으로 용량(Capacity) 증가
		
		// 중간에 값 입력
		v.insertElementAt(5, 7);
		System.out.println(v);
		
		// 객체 조회 : 특정 인덱스의 객체 반환
		int val = v.elementAt(5);
		System.out.println(val);
		
		// 객체의 인덱스를 조회
		System.out.println("indexOf(7): " + v.indexOf(7));
		// 없는 객체의 인덱스
		System.out.println("indexOf(0): " + v.indexOf(0));
		
		// 객체 포함 여부 반환
		System.out.println("contains(10) : " + v.contains(10));
		
		// 객체 삭제
		v.removeElement(10);
		System.out.println(v);
		
		// 내용을 하나씩 불러와서 출력
		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.println(item);
		}
		
		// TODO : 개선해 봅시다.
		
		// 버퍼를 비워 봅시다.
//		v.clear(); // Enumeration 테스트를 위함
		System.out.println("v = " + v);
		System.out.println("Size : " + v.size() + ", Capacity : " + v.capacity());
		
		// Generic 활용
		Vector<? super Number> v2 = new Vector<>(); // 확장된 Generic
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement(new String ("Java")); // String은 Number가 아니기 때문에 Number를 상속하지 않았음
		
		System.out.println(v2);
		
		// Enumeration을 이용해서 항목을 차례대로 꺼낼 수 있다.
		Enumeration<Integer> e = v.elements();
		System.out.println("=====Enumeration=====");
		
		while(e.hasMoreElements()) { // Elements를 더 가지고 있는가
			Integer item = e.nextElement();
			System.out.println(item);
		}
		
		
	}

}
