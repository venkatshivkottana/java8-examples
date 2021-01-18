package com.java8.examples.impl;

import com.java8.examples.interf.Guitar;
import com.java8.examples.interf.Piano;

public class Instrument implements Piano, Guitar {

	@Override
	public void play() {
		Piano.super.play();
		Guitar.super.play();
	}

	public static void main(String args[]) {
		new Instrument().play();
	}

}
