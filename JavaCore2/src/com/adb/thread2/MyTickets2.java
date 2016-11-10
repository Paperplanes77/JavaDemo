package com.adb.thread2;

public class MyTickets2 implements Runnable{
	//静态的生命周期比较长  不好  只创建了一个对象不用了static
	private int tickets=100;
	private Object object=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//车站永远有车 一直在卖！
		while (true) {
			//锁起来    用同一把锁    把窗子门都关起来！
			synchronized (object) {
				//tickets票数要大于0
				if (tickets>0) {
					try {
						//火车站省份证检查 等待一会
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//先赋值在运算     
					System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets--+"张票");
				}
			}
		}
			 
		  //用 for循环是可以强票了        票数怎么共享？    
	}
	
}
