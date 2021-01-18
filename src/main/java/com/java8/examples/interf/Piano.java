package com.java8.examples.interf;

public interface Piano {
	
	public default void play() {
		System.out.println("Piono Play");
	}
}
