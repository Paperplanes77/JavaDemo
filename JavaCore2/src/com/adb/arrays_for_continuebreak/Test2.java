package com.adb.arrays_for_continuebreak;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]={1,2,3,4,5};
		int a2[]={9,8,7,6,5,4,3};
		System.arraycopy(a1, 0, a2, 0, 3);
		System.out.print("a1数组中的内容:");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.print("a2数组中的内容:");//怎么不可以直接打换行
//		System.out.println("a2数组中的内容:");//有什么差别？
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
		}
		System.out.println();
		System.out.println("数组拷贝完成！");

	}

}
