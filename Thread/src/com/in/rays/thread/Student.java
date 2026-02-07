package com.in.rays.thread;

public class Student extends Thread {
	
	private String name;
	private int id;
	private double balance;
	
	public Student(String name, int id, double balance) {
		this.name = name;
		this.balance = balance;
		this.id = id;
	
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + name + id);
		}
		
	}

}
