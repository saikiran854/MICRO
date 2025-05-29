package com.axison.cj;

public class ThreadSynchronised extends Thread {
	
	private Counter counter;
	
	public ThreadSynchronised(Counter count) {
		this.counter = count;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		ThreadSynchronised t1 = new ThreadSynchronised(c);
		ThreadSynchronised t2 = new ThreadSynchronised(c);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c.getCount());
		

	}

}
