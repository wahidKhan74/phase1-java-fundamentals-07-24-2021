package com.simplilearn.collections.multothreading;

public class ThreadWithSleep {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread t1 working!");
		} );
		
		Thread t2 = new Thread(()->{
			System.out.println("Thread t2 working!");
		} );
		
		Thread t3 = new Thread(()->{
			System.out.println("Thread t3 working!");
		} );
		
		t1.start();
		
		t2.sleep(5000);
		
		t2.start();
	}
}
