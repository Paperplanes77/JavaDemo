package com.java.abstractclass_interface;

public class Demo2 extends Demo{



	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("我在这里重写了BiBi接口里面的方法！");
	}

	@Override
	public void show4() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("let we go!");
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("我爱阅读！");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiBi bbb=new Demo2();
		bbb.show3();
		bbb.show();
	}

	
}
