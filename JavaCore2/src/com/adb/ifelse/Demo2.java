package com.adb.ifelse;

import java.io.PrintStream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		int sum = 0;
		out.println("FOR DEMO:");
		for (int i = 0; i <= 100; i = i + 2) {
			sum += i;
		}
		out.println("0到100之间的偶数和:" + sum);
		out.println("********");
		out.println("WHILE DEMO:");
		int a = 1, a1 = 1;
		while (a > -3) {
			out.println("a:" + a);
			a--;
			out.println("a:" + a);
		}
		out.println("********");
		out.println("DO WHILE DEMO:");
		do {
			out.println("a1:" + a1);
			a1--;
			out.println("a1:" + a1);
		} while (a1 > -3);// 如果都是一样的参数a 会影响
		out.println("********");
		out.println("FOREACH DEMO:");
		int[] arr = { 11, 22, 33, 44, 55 };
		for (int i : arr) {
			out.println("arr:" + i);// 输出数组的数据
		}
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			out.println(j);
		}
		out.println("********");
		out.println("DO WHILE DEMO:");
		// 九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				out.print(j + "*" + i + "=" + (i * j) + "\t");

			}
			out.println();
			// 两个变量同时改变了
			/*
			 * for(int i=1,j=1;(i<=9)&&(j<=i);i++,j++){
			 * out.print(j+"*"+i+"="+(i*j)+"\t"); } out.println();
			 */
		}
	}
}
