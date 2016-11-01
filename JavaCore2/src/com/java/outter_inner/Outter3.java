package com.java.outter_inner;

public class Outter3 {
	String name="Outter3";
	private Inner4 inner4;
	public Inner4 getInner4Instance(){
		if (inner4==null) {
			inner4=new Inner4();
		}
		return inner4;
	}
	public void print(){
		System.out.println("我是外部类------Outter3");
	}
	public void readInner4Name(){
		String tmpName=getInner4Instance().name;
		System.out.println("我是外部类"+name+"通过方法知道内部类的名字"+tmpName);
	}
	public void execInner4Print(){
		System.out.println("我是外部类开始调用内部类方法");
		getInner4Instance().print();
		System.out.println("我是外部类开始结束内部类方法");
	}
	class Inner4{
		String name="Inner4";
		public void print(){
			System.out.println("我是内部类------Innner4");
		}
		public void readOutter3Name(){
			String tmpName=Outter3.this.name;
			System.out.println("我是内部类"+name+"知道外部类的名字"+tmpName);
		}
		public void execOutter3Print(){
			System.out.println("我是内部类开始调用外部类方法");
			Outter3.this.print();
			System.out.println("我是内部类开始结束外部类方法");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter3 outter3=new Outter3();
		outter3.print();
		outter3.readInner4Name();
		outter3.execInner4Print();
		System.out.println("++++++++++++++++++++++++++++++");
		Outter3.Inner4 inner4=outter3.getInner4Instance();
		inner4.print();
		inner4.readOutter3Name();
		inner4.execOutter3Print();
	}

}
