package com.java.abstractclass_interface;

import com.adb.arrays_for_continuebreak.Demo;

public class BoomTest implements BiBi,BiBi2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("重新了BiBi2的方法show1");

	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("重新了BiBi2的方法show2");
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("重新了BiBi的方法show3");

	}

	@Override
	public void show4() {
		// TODO Auto-generated method stub
		System.out.println("重新了BiBi的方法show4");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiBi bi=new BoomTest();
		bi.show3();
		BiBi2 bi2=new BoomTest();
		bi2.show2();
	}

}
