package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	private String subject;
	private String roomName;
	
	// 생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return subject.hashCode();
//		return super.hashCode();
	}
	@Override
	public String toString() {
		String output = "Class(subject = " + subject + ", room = " + roomName + ")";
		return output;
	}
	
}

public class HashTableEx {

	public static void main(String[] args) {

		Map<String, ClassRoom> map = new Hashtable<>();
		
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("401", new ClassRoom("Linux", "R401"));
		
		System.out.println(map);
		// 순서는 없다
		
		// 맴에서 데이터 가져오기 : get() 메서드
		System.out.println(map.get("301"));
		
		// 맵의 데이터 변경하기 :
		map.put("201", new ClassRoom("C#", "R201"));
		System.out.println(map.get("201"));
		System.out.println(map);
		
		// 키가 있는지 확인
		System.out.println(map.containsKey("301"));
		System.out.println(map.containsKey("501"));
		
		// subject가 Java인 ClassRoom을 받아오기
		System.out.println(map.containsValue("Java")); // hashCode 적용 전, 문자열이 아닌 객체를 받기때문에 false
		System.out.println(map.containsValue(new ClassRoom("Java"))); // ClassRoom의 hashCode를 이용한 비교
		
		// Iterator 
		System.out.println("=======Iterator=======");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		// 맵 비우기
		map.clear();
		System.out.println(map);
		
	}

}
