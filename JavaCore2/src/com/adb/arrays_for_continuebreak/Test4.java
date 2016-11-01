package com.adb.arrays_for_continuebreak;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二维数组
		int sum=0;
		int num[][]={{30,35,26,32},{33,34,30,29}};
		for (int i = 0; i < num.length; i++) {
			System.out.print("第"+(i+1)+"学生的成绩:");
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+"   ");
				sum+=num[i][j];
			}
			System.out.println();
		}
		System.out.println("学生总成绩为:"+sum);
		
		//三维数组
		int sum2=0;
		int a[][][]={{{5,1},{6,7}},{{9,4},{8,3}}};
		for (int i = 0; i < a.length; i++) {
 			for (int j = 0; j < a[i].length; j++) {
 				for (int j2 = 0; j2 < a[j].length; j2++) {
 					System.out.print("a["+i+"]["+j+"]["+j2+"]");
					System.out.println(a[i][j][j2]);
					sum2+=a[i][j][j2];
				}
 			}
  		}
		System.out.println("总和为:"+sum2);
	}

}
