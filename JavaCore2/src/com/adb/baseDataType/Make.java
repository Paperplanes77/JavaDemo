package com.adb.baseDataType;

import java.io.PrintStream;

import org.omg.CORBA.INTERNAL;

public class Make {
	static final int YEAR=365;
	public static void main(String[] args){
	/*	float a=0.2f,b=3;
//		a+=b;
		a=a+b;
		System.out.println(a);
		int m=3;
		float n=2;
		n=m+n;
		System.out.println(n);
		if(a!=b){
			System.out.println(YEAR);*/
		int x=3,y=2;
		PrintStream out=System.out;
		out.println((x-y));
		out.println((x+y));
		out.println((x/y));
		out.println((x%y));
		out.println();
		char m='a',n='b';
		out.println((m+n));
		out.println('m');
		out.println('n');
		out.println('m'+'n');
		out.println();
		float q=3.0f;
		double w=3.0;
		out.println((q+w));
		out.println();
		boolean e=true,t=false;
		out.println(e);
		out.println(t);
		out.println((e&&t));
		out.println(e||t);
		out.println(!e);
		out.println("!t="+!t);
		out.println();
		out.println("Integer.MIN_VALUE: "+Integer.MIN_VALUE);
		out.println("Integer.MAX_VALUE"+Integer.MAX_VALUE);
		out.println("Integer.SIZE:"+Integer.SIZE);
		out.println("Integer.TYPE:"+Integer.TYPE);
		out.println("Integer.CLASS:"+Integer.class);
		
	}

}
