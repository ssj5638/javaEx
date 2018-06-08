package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{
	
	int num;
	
	public SimpleNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	// hashCode, equals를 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
//		return super.hashCode();
//		return num%10;
		return num%2; // 해쉬를 관리하기 위해 1차적 검색 기능
	}
}

public class HashSetEx2 {

	public static void main(String[] args) {
		
		 HashSet<SimpleNum> hs = new HashSet<>();
		 
		 SimpleNum s1 = new SimpleNum(10);
		 SimpleNum s2 = new SimpleNum(20);
		 SimpleNum s3 = new SimpleNum(20); // 오버라이드 추가 전, s2 와  s3의 객체가 다르다고 판단함 
		 // new로 생성하는 순간 메모리 주소값이 달라짐
		 

		 hs.add(s1);
		 hs.add(s2);
		 hs.add(s3);
		 
		 System.out.println(hs);
		 
		 System.out.println(s2.equals(s3));

	}

}
