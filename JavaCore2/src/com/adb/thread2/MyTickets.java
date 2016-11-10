package com.adb.thread2;

public class MyTickets implements Runnable{
	static int n=200;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (n>0) {
			System.out.println(Thread.currentThread().getName()+"正在出售第"+n+"张票");
			n--;
		}
			 
		  //用 for循环是可以强票了        票数怎么共享？    
	}
	
}
