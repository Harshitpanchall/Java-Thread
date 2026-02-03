package com.in.rays.thread;

public class HelloThread extends Thread {
	private String name;
	private int id;
	
	
	public HelloThread(String name, int id) {
		this.name = name;
		this.id= id;
		
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
		System.out.println(i + " " + name + " " + id);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

	}

}
