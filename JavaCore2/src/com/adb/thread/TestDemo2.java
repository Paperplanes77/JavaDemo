package com.adb.thread;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest3().start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main线程在运行!");
		}
	}

}

class ThreadTest3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadTest在运行!");
		}
	}
}