package com.in.rays.thread;

public class Employee extends Thread{
	
	public String name;
	public int id ;
	public double balance;
	public String city;
	
	public Employee(String name , String city, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.city = city;
		
	}
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + name + " " + id + " " + balance + " " + city);
			
		}
	}

}
