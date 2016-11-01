package com.java.study6;

interface A {
	void play();
}

interface B {
	void dance();
}

interface E extends A, B {
	void sing();
}

public class C implements E {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("***");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		C c=new C();
		c.dance();
		 
	}
}
