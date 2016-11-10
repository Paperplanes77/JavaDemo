package com.adb.thread2;

public class TicketsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTickets windows=new MyTickets();
		Thread thread=new Thread(windows);
		thread.setName("窗口一:");
		//只需要创建一个对象 节省空间！
		//MyTickets windows2=new MyTickets();
		Thread thread2=new Thread(windows);
		thread2.setName("窗口二:");
	 
		//MyTickets windows3=new MyTickets();
		Thread thread3=new Thread(windows);
		thread3.setName("窗口三:");
	 
		//MyTickets windows4=new MyTickets();
		Thread thread4=new Thread(windows);
		thread4.setName("窗口四:");
		
		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
