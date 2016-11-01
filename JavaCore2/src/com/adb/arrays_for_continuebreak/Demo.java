package com.adb.arrays_for_continuebreak;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		for(i=1;i<=10;i++){
		if (i==3) {
			System.out.println("i为:"+i);
			continue;//跳过当前
		}
		if (i==5) {
			System.out.println("i为:"+i);
			break;//打破循环
		}
		if (i==10) {
			System.out.println("i为:"+i);
			return;//提前退出
		}
		sum+=i;
		}
		System.out.println("总和:"+sum);
		int[] a={23,34,56,53};
		for (int j : a) {
			System.out.println("j的数组:"+j);
		}
		int[][] mm=new int[9][3];
		for (int j = 0; j < mm.length; j++) {
			for (int j2 = 0; j2 < mm[j].length; j2++) {
				System.out.print(mm[j][j2]);
			}
			System.out.println();
		}
		int[][] mm2=new int[9][];
	}
}
