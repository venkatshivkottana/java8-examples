package com.java8.examples.interf;

public interface Guitar {

	public default void play() {
		System.out.println("Guitar Play");
	}
}
