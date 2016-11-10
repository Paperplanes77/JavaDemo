package com.adb.thread2;

public class DieLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DieLock dieLock=new DieLock(true);
		DieLock dieLock2=new DieLock(false);
		dieLock.start();
		dieLock2.start();

	}

}
