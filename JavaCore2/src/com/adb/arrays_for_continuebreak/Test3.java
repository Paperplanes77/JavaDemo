package com.adb.arrays_for_continuebreak;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,32,45,32,65,32,2};
		System.out.println("数组排序前的顺序:");
		for (int i = 0; i < a.length; i++) {
 			System.out.print(a[i]+"    ");
		}
		Arrays.sort(a);
		System.out.println("\n 数组排序后的顺序:");
		for (int m : a) {
			System.out.print(m+"  ");
		}
	}

}
