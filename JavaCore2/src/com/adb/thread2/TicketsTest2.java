package com.adb.thread2;

public class TicketsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTickets2 windows=new MyTickets2();
		Thread thread=new Thread(windows);
		thread.setName("窗口一:");
		
		Thread thread2=new Thread(windows);
		thread2.setName("窗口二:");
	 
		Thread thread3=new Thread(windows);
		thread3.setName("窗口三:");
	 
		Thread thread4=new Thread(windows);
		thread4.setName("窗口四:");
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
