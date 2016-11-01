package com.adb.arrays_for_continuebreak;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,min,max;
		int A[]={74,48,30,17,62};
		min=max=A[0];
		System.out.println("数组A的元素包括：");
		for (int j = 0; j < A.length; j++) {
 			if(A[j]>max)
 				max=A[j];
 			if(A[j]<min)
 				min=A[j];
		}
		System.out.println(max);
		System.out.println(min);
		int C[]=Arrays.copyOf(A,  4);
		for (int j : C) {
			System.out.println(j);
		}
	}

}
