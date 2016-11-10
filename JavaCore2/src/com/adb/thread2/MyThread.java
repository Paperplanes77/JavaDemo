package com.adb.thread2;

public class MyThread extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			//Thread类里面的getName()
			System.out.println(getName()+"学习线程!"+i);
		}
	}
}
