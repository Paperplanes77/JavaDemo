/**
 * 
 */
package com.adb.helloworld;

import java.io.PrintStream;

/**
 * @author Administrator
 *
 */
public class HelloWorld3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		i = 9;
		j = 4;
		int m = i % j;
		args[0] = "123";
		args[1] = "345";
		PrintStream out = System.out;
		out.println("Hello World!");
		out.println("���֣�" + args[0] + "  ����:" + args[1]);
		out.println(args[2]);
		System.out.println(m);
		System.out.println();
	}

}
