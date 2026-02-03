package com.in.rays.Runniable.thread;

public class Student implements Runnable{
	
	private int id;
	private String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		
	}

	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name + " " + id);
		}
		
	}
	

}
