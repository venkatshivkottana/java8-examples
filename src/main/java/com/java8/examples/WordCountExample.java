package com.java8.examples;

import com.java8.examples.interf.WordCount;

public class WordCountExample {

	public static void main(String args[]) {
		WordCount interfRef = (input) -> {
			if (input == null || input.isEmpty()) { 
				return 0; 
			} 
			return input.split("\\s+").length;
		};
		System.out.println(interfRef.getNumberOfWords("Venkat Joined wipro recently yeah"));
	}
}
