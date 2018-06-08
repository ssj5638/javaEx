package com.javaex.api.generic.ex3;

// Generic 이용
public class Box<K, V> {
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {
		return content;
	}
	
	public void setContent(V content) {
		this.content = content;
	}	
}
