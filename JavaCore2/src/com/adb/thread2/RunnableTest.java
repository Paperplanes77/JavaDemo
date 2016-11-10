package com.adb.thread2;

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myRunnable=new MyRunnable();
		Thread thread=new Thread(myRunnable);
		thread.setName("sembi!");
		MyRunnable myRunnable2=new MyRunnable();
		Thread thread2=new Thread(myRunnable2);
		thread2.setName("duke!");
		thread.start();
		thread2.start();
	}

}
