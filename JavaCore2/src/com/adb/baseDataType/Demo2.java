package com.adb.baseDataType;

import java.io.PrintStream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		/*char zi='我';
		out.println(zi+1);
		float num=3.0f;
		out.println(num+"*"+num+"="+(num*num));
		out.println("***********8");
		out.println(Float.MAX_VALUE);
		out.println(Float.MIN_VALUE);
		out.println(Float.SIZE);
		out.println(Float.class);
		char ch1='\'';
		char ch2='a';
		out.println(ch1+"字符要加单引号"+ch2);
		int a=156;
		float b=24.1f;
		out.println("a="+a+",b="+b);
		out.println("a/b="+(a/b));*/
		
		int a=55,b=9;
		float g,h;
		g=a/b;
		out.println(g);
		g=(float)a/b;
		out.println(g);
		
	}

}
