package com.axison.cj;

public class ThreadState extends Thread {
	
	public ThreadState(String name){
		super(name);
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(Thread.currentThread().getName() + " - priority : "
						+ Thread.currentThread().getPriority() + " - count : " + i);
				
			}
		}
	}

	public static void main(String[] args) {
		
		ThreadState l = new ThreadState("Low Priority");
		ThreadState m = new ThreadState("Med Priority");
		ThreadState h = new ThreadState("Highs Priority");
		l.setPriority(MIN_PRIORITY);
		m.setPriority(NORM_PRIORITY);
		h.setPriority(MAX_PRIORITY);
		l.start();
		m.start();
		h.start();

	}

}
