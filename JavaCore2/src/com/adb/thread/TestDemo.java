package com.adb.thread;

 

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTest2().run();
		for(int i=0;i<10;i++){
			System.out.println("Main线程在运行!");
		}
	}

}
class ThreadTest2{
	public static void run(){
	for(int i=0;i<10;i++){
		System.out.println("ThreadTest在运行!");
	}
	}
}