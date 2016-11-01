package com.java.abstractclass;

public class Orange extends Banana{
	public Orange(){
		System.out.println("我是Orange子类的构造方法");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("水果给人感觉就是好！");
	}
	public void bb(){
		System.out.println("水果真的好棒！");

	}

	 

}
