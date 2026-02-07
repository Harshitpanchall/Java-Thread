package com.in.rays.Runniable.thread;

public class Person implements Runnable {
	
	private String name;
	private int id;
	private double balance;
	
	public Person(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	
	}

	@Override
	public void run() {
		 for(int i = 1; i <= 10; i++) {
			 try {
				Thread.sleep(1000000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(i + " " + name + " " + id);
		 }
		
	}
	

}
