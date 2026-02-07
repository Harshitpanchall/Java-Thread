package com.in.rays.Runniable.thread;

public class Employee implements Runnable{

	public String name;
	public int id;
	
	public  Employee(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
	
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i + " " + name + " " + id);
		}
		
	}

}
