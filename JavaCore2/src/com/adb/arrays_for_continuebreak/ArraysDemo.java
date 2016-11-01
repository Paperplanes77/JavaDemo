package com.adb.arrays_for_continuebreak;

import java.io.PrintStream;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out=System.out;
		int[] intArray;
		char[] charArray;
		String[] stringArray;
		intArray=new int[8];
		out.println("check int Array default values:");
		for (int i : intArray) {
			out.print(i+"  ");
		}
		out.println();
		intArray[0]=12;
		intArray[1]=13;
		intArray[2]=14;
		for (int i : intArray) {
			out.print(i+"  ");
		}
		out.println();

		charArray=new char[8];
		out.println("check char Array default values:");
		for (char i : charArray) {
			out.print(i+"  ");
		}
		out.println();
		charArray[0]='a';
		charArray[1]='b';
		charArray[2]='c';
		for (char i : charArray) {
			out.print(i+"  ");
		}
		
		out.println();
		stringArray=new String[8];
		out.println("check string Array default values:");
		for (String i : stringArray) {
			out.print(i+"  ");
		}
		out.println();
		stringArray[0]="hello wrold";
		stringArray[1]="wawawa";
		stringArray[2]="boomboom";
		stringArray[8]="一条好鱼的鱼!";

		for (String i : stringArray) {
			out.print(i+"  ");
		}
 	}

}
