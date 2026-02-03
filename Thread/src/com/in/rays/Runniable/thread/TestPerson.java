package com.in.rays.Runniable.thread;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Person("harsit", 12, 34.39));
		Thread t2 = new Thread(new Person("utlarsh", 13, 23.34));
		Thread t3 = new Thread(new Person("rohit", 14, 45.56));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
