package com.sun.jpeg.turbo.demo;

public class Util {

	static {
		System.loadLibrary("test");
	}
	
	public native static void read();

}
