package com.adb.thread;

public class TestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest4 threadTest4=new ThreadTest4();
		new Thread(threadTest4).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main线程在运行!");
		}
	}

}

class ThreadTest4 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadTest在运行!");
		}
	}
}