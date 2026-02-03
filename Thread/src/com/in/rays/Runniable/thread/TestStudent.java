package com.in.rays.Runniable.thread;

public class TestStudent {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Student("harshit", 12));
		Thread t2 = new Thread(new Student("utkarsh", 13));
		Thread t3 = new Thread(new Student("rohit", 14));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
