package com.adb.baseDataType;

import java.io.PrintStream;

public class Demo {
	public  static void main(String[] args){
		Byte byte1=10,byte2=10;
		Short short1=2,short2=3;
		Integer integer1=20,integer2=30;
		Long long1=22L,long2=33L;
		Float float1=33.0f,float2=34.4f;
		PrintStream out=System.out;
		out.println("byte1+byte2:"+(byte1+byte2));
		out.println("short1+short2:"+(short1+short2));
		out.println("integer1+integer2:"+(integer1+integer2));
		out.println("long1+long2:"+(long1+long2));
		out.println("float1+float2:"+(float1+float2));
		out.println("*************");
		out.println("byte1+short1:"+(byte1+short1));
		out.println("byte1+integer1:"+(byte1+integer1));
		out.println("byte1+long1:"+(byte1+long1));
		out.println("byte1+float1:"+(byte1+float1));
		out.println("*************");
		integer2=byte1.intValue();//自身的方法
		out.println(integer2);
		integer2=Integer.valueOf(""+byte1);
		out.println(integer2);
		integer2=Integer.parseInt(""+byte1);//用其他类的方法 转换为string类型
		integer1=Integer.parseInt(Byte.toString(byte1));//用自身类的方法转换
		out.println(integer1);
	}
}
