package com.in.rays.thread;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Employee("harshit","indore",01,230000.00));
		Thread t2 = new Thread(new Employee("utkarsh","bhopal",12,340000.44));
		Thread t3 = new Thread(new Employee("Palak","indore",13,34000.44));
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
