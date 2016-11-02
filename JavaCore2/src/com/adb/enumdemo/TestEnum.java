package com.adb.enumdemo;

import java.io.PrintStream;
import java.time.MonthDay;

public class TestEnum {
	 public static void print(EnumDemo2 we){
		 PrintStream out=System.out;
		 switch (we) {
			case SUNDAY:
				System.out.println("星期天");
				break;
			case MONDAY:
				System.out.println("星期一");
				break;
			case TUESDAY:
				System.out.println("星期二");
				break;
			case WEDNESDAY:
				System.out.println("星期三");
				break;
			case THURSDAY:
				System.out.println("星期四");
				break;
			case FRIDAY:
				System.out.println("星期五");
				break;
			default:
				System.out.println("星期六");
				break;
		}
	 }
	 public static void printEnum(EnumDemo we,PrintStream out){
		 out.println(we.getIndex()+"       "+we.getStr());
	 }
	 public static void print2(EnumDemo we){
		 PrintStream out=System.out;
		switch (we) {
		case SUNDAY:
			System.out.println("星期天");
			printEnum(we, out);
			break;
		case MONDAY:
			System.out.println("星期一");
			printEnum(we, out);
			break;
		case TUESDAY:
			System.out.println("星期二");
			printEnum(we, out);
			break;
		case WEDNESDAY:
			System.out.println("星期三");
			printEnum(we, out);
			break;
		case THURSDAY:
			System.out.println("星期四");
			printEnum(we, out);
			break;
		case FRIDAY:
			System.out.println("星期五");
			printEnum(we, out);
			break;
		default:
			System.out.println("星期六");
			printEnum(we, out);
			break;
		}
	 }
	 public static void main(String[] args){
		/* print(EnumDemo2.SUNDAY);
		 print(EnumDemo2.MONDAY);
		 print(EnumDemo2.TUESDAY);
		 print(EnumDemo2.WEDNESDAY);
		 print(EnumDemo2.THURSDAY);
		 print(EnumDemo2.FRIDAY);
		 print(EnumDemo2.SATURDAY);*/
		 print2(EnumDemo.SUNDAY);
		 print2(EnumDemo.MONDAY);
		 print2(EnumDemo.TUESDAY);
		 print2(EnumDemo.WEDNESDAY);
		 print2(EnumDemo.THURSDAY);
		 print2(EnumDemo.FRIDAY);
		 print2(EnumDemo.SATURDAY);

	 }
}
