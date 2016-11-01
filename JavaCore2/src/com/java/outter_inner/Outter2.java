package com.java.outter_inner;

 
public class Outter2 {
	private Inner3 inner3;
	String name="Outer";
	public void print(){
		System.out.println("我是外部类---Outter2");
	}
	public Inner3 getInner3Instance(){
		if (inner3==null) {
			inner3=new Inner3();
		}
		return inner3;
	}
	public void execInner3Name(){
		System.out.println("我是外部类,我要开始执行内部类的方法了");
		getInner3Instance().print();
		System.out.println("我是外部类,我结束执行内部类的方法了");

	}
	public void readInner3Name(){
		String tmpName=getInner3Instance().name;
		System.out.println("我是Outter3类,我可以反问访问内部类的名字"+tmpName);
	}
	class Inner3{
		String name="Inner3";
		public void print(){
			System.out.println("我是内部类----Inner3");
		}
		public void readOutter2Name(){
			 System.out.println("这是内部类的方法,我自己的内部类的名字是："+name+"我的外部类的名字是:"+Outter2.this.name);

		}
		public void execOutter2Print(){
			System.out.println("我是内部类,我将要执行外部类的方法");
			Outter2.this.print();
			System.out.println("我是内部类,我将要结束外部类的方法");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 outter2=new Outter2();
		outter2.print();
		outter2.readInner3Name();
		outter2.execInner3Name();
		Outter2.Inner3 inner3= outter2.new Inner3();
		inner3.print();
		inner3.readOutter2Name();
		inner3.execOutter2Print();
	}

}
