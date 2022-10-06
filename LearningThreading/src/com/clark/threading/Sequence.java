package com.clark.threading;

public class Sequence {
	private int value = 0;
	public synchronized int getNext() {
	//	synchronized (this){
		value++;
		return value;
	//	}
	}
//not thread safe when shared across multiple threads
	//When code is inside its not going to pause and let another thread some in, its going to do all or nothing
}
