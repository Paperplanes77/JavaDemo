package com.adb.thread2;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			//Thread类里面的getName()
			System.out.println(Thread.currentThread().getName()+"学习线程!"+i);
		}
	}
	
}
