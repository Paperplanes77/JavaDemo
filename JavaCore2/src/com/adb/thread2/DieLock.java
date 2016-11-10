package com.adb.thread2;

public class DieLock extends Thread{
	private boolean flag;
	public DieLock(boolean flag) {
		this.flag=flag;
 	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 if (flag) {
			synchronized (Lock.objA) {
				System.out.println("objA"+true);
				synchronized (Lock.objB) {
					System.out.println("objB"+true);
				}
			}
		}else {
			synchronized (Lock.objB) {
				System.out.println("objA"+false);
				synchronized (Lock.objA) {
					System.out.println("objB"+false);
				}
			}
		}
	}
}
