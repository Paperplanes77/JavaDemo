package com.adb.thread2;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		MyThread mt2=new MyThread();
		//不是开始run方法 那就是普通的调用！
		mt.setName("faker");
		mt2.setName("peaunt");
		mt.start();
		mt2.start();
		//如果同时一个线程start2次 会出异常  已经开始了线程状态！
	}

}
