/**
 * 
 */
package com.adb.for_data;

import java.io.PrintStream;

/**
 * @author Administrator
 *
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		Integer integer1 = 9, intger2 = 12;
		out.println("integer1&integer1:" + (integer1 & integer1));
		out.println("integer1&integer1:" + (Integer.toBinaryString(integer1 & integer1)));
		out.println("****************");
		out.println("integer1|integer1:" + (integer1 | integer1));
		out.println("integer1|integer1:" + (Integer.toBinaryString(integer1 |integer1)));
		out.println("****************");
		out.println("integer1^integer1:" + (integer1 ^ integer1));
		out.println("integer1^integer1:" + (Integer.toBinaryString(integer1 ^integer1)));
		out.println("****************");
		out.println("integer<<1:"+(Integer.toBinaryString(integer1<<1)));
		out.println("integer<<1:"+(Integer.toBinaryString(integer1<<32)));
		out.println("integer<<1:"+(Integer.toBinaryString(integer1<<31)));
		out.println("****************");
		out.println("integer>>1:"+(Integer.toBinaryString(integer1>>1)));
		out.println("integer>>1:"+(Integer.toBinaryString(integer1>>32)));
		out.println("integer>>1:"+(Integer.toBinaryString(integer1>>31)));
		out.println("integer>>1:"+(Integer.toBinaryString(integer1>>4)));
		out.println("****************");
		out.println("integer>>>1:"+(Integer.toBinaryString(integer1>>>1)));
		out.println("integer>>>1:"+(Integer.toBinaryString(integer1>>>32)));
		out.println("integer>>>1:"+(Integer.toBinaryString(integer1>>>31)));
	}

}
