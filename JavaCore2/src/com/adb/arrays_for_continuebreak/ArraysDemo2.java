package com.adb.arrays_for_continuebreak;

import java.util.Arrays;

import javax.swing.OverlayLayout;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={33,54,34,76,8,46,29,56,-3,-56,-29};
		int max=0,min=0;
		int m;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		m=(max+min)/2;
		System.out.println("max: "+max+"   "+"min: "+min+"   "+"m: "+m);
		
		System.out.println("********");
		Arrays.sort(arr);//排序
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("********");
		int[] ee={1,2,3,4};
		int[] arr2={5,6,7,8,9};
		System.arraycopy(ee, 0, arr2, 0,  4);//数据的拷贝，从源数组起始位置代替目的数组的目的位置 替换几个相等长度的数据！！
 		for (int i : ee) {
			System.out.print(i);
		}
 		System.out.println();
 		for (int i : arr2) {
			System.out.print(i);
		}
	}

}
