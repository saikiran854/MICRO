package com.axison.cj;

public class ThreadDaemon extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Thread is running!!");
		}
	}

	public static void main(String[] args) {
		
		ThreadDaemon t1 = new ThreadDaemon();
		t1.start();
		t1.setDaemon(true);
		System.out.println("Application done");

	}

}
