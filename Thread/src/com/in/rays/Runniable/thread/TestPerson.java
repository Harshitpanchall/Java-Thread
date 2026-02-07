package com.in.rays.Runniable.thread;

public class TestPerson {
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Person("hatrshit",23,230000));
		Thread t2 = new Thread(new Person("utlatsh",24,2300));
		Thread t3 = new Thread(new Person("rohit",25,200));
		
		t1.start();
		t2.start();
		t3.start();
	}
	


}
