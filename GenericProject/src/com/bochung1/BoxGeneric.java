package com.bochung1;

//<T>는 제너릭(Generic)
//T는 어떠한 타입도 올 수 있다. ex)int, short, long
public class BoxGeneric<A> {
	private A t;
	
	public A get() {
		return this.t;
	}
	public void set(A t) {
		this.t = t;
	}

}
