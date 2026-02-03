package com.in.rays.thread;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread h1 = new HelloThread("harshit",23);
		HelloThread h2 = new HelloThread("utkarsh", 24);
		
		h1.start();
		h2.start();
		
	}

}
