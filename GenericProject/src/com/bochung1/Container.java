package com.bochung1;

public class Container<T, M> {
	private T key;
	private M value;
	
	public void set(T key, M value) {
		this.key = key;
		this.value =value;
		
		
	}
	public T get() {
		return key;
	}
	public T getkey() {
		return key;
	}
	public M getValue() {
		return value;
	}
	
	
	
	
	
	
	
	
	
}
