package com.in.rays.Runniable.thread;

public class TestEmployee {
	public static void main(String[] args) {
		
	Thread t1 = new Thread(new Employee("harshit Panchal",01));
	Thread t2 = new Thread(new Employee("utkrsh", 02));
	
	t1.start();
	t2.start();
	
	
	}

}
